package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.IShape;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArt;
import com.aspose.slides.SmartArtNodeCollection;
import com.aspose.slides.examples.Utils;

public class RemoveSmartArtShapeNodeAtSpecificPosition {

	public static void main(String[] args) {

             //  ExStart:RemoveSmartArtShapeNodeAtSpecificPosition 
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RemoveSmartArtShapeNodeAtSpecificPosition.class);

		// Load the desired the presentation
		Presentation pres = new Presentation(dataDir + "AddSmartArtNode.pptx");

		// Traverse through every shape inside first slide
		for (IShape shape : pres.getSlides().get_Item(0).getShapes()) {

			// Check if shape is of SmartArt type
			if (shape instanceof SmartArt) {
				// Typecast shape to SmartArt
				SmartArt smart = (SmartArt) shape;

				if (smart.getAllNodes().size() > 0) {
					// Accessing SmartArt node at index 0
					ISmartArtNode node = smart.getAllNodes().get_Item(0);

					if (node.getChildNodes().size() >= 2) {
						// Removing the child node at position 1
						(node.getChildNodes()).removeNode(1);
					}

				}
			}

		}

		// Save Presentation
		pres.save(dataDir + "RemoveSmartArtNodeByPosition.pptx", SaveFormat.Pptx);

	//ExEnd:RemoveSmartArtShapeNodeAtSpecificPosition 
      }

}

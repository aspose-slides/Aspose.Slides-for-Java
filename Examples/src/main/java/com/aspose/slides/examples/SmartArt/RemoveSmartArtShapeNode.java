package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.IShape;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RemoveSmartArtShapeNode {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RemoveSmartArtShapeNode.class);

		// Load the desired the presentation
		Presentation pres = new Presentation(dataDir + "AddSmartArtNode.pptx");

		// Traverse through every shape inside first slide
		for (IShape shape : pres.getSlides().get_Item(0).getShapes()) {

			// Check if shape is of SmartArt type
			if (shape instanceof ISmartArt) {
				// Typecast shape to SmartArtEx
				ISmartArt smart = (ISmartArt) shape;

				if (smart.getAllNodes().size() > 0) {
					// Accessing SmartArt node at index 0
					ISmartArtNode node = smart.getAllNodes().get_Item(0);

					// Removing the selected node
					smart.getAllNodes().removeNode(node);

				}
			}
		}

		// Save Presentation
		pres.save(dataDir + "RemoveSmartArtNode.pptx", SaveFormat.Pptx);

	}

}

package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SmartArtNode;
import com.aspose.slides.examples.Utils;

public class AccessingSmartArtShapeChildNodes {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AccessingSmartArtShapeChildNodes.class);

		// Instantiate Presentation Class
		Presentation pres = new Presentation(dataDir + "AccessChildNodes.pptx");

		// Get first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Traverse through every shape inside first slide
		for (IShape shape : slide.getShapes()) {
			// Check if shape is of SmartArt type
			if (shape instanceof ISmartArt) {
				// Typecast shape to SmartArtEx
				ISmartArt smart = (ISmartArt) shape;

				// Traverse through all nodes inside SmartArt
				for (int i = 0; i < smart.getAllNodes().size(); i++) {
					// Accessing SmartArt node at index i
					SmartArtNode node0 = (SmartArtNode) smart.getAllNodes().get_Item(i);

					// Traversing through the child nodes in SmartArt node at index i
					for (int j = 0; j < node0.getChildNodes().size(); j++) {
						// Accessing the child node in SmartArt node
						SmartArtNode node = (SmartArtNode) node0.getChildNodes().get_Item(j);

						// Printing the SmartArt child node parameters
						System.out.print("j = " + j + ", Text = " + node.getTextFrame().getText() + ",  Level = " + node.getLevel() + ", Position = " + node.getPosition());
					}
				}
			}
		}

	}

}

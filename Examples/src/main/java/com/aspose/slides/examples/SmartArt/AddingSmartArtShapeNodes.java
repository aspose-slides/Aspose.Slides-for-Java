package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.IShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArt;
import com.aspose.slides.SmartArtNode;
import com.aspose.slides.examples.Utils;

public class AddingSmartArtShapeNodes {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingSmartArtShapeNodes.class);

		// Load the desired the presentation
		Presentation pres = new Presentation(dataDir + "SimpleSmartArt.pptx");

		// Traverse through every shape inside first slide
		for (IShape shape : pres.getSlides().get_Item(0).getShapes()) {

			// Check if shape is of SmartArt type
			if (shape instanceof SmartArt) {

				// Typecast shape to SmartArt
				SmartArt smart = (SmartArt) shape;

				// Adding a new SmartArt Node
				SmartArtNode TemNode = (SmartArtNode) smart.getAllNodes().addNode();

				// Adding text
				TemNode.getTextFrame().setText("Test");

				// Adding new child node in parent node. It will be added in the end of collection
				SmartArtNode newNode = (SmartArtNode) TemNode.getChildNodes().addNode();

				// Adding text
				newNode.getTextFrame().setText("New Node Added");

			}
		}

		// Saving Presentation
		pres.save(dataDir + "AddSmartArtNode.pptx", SaveFormat.Pptx);

	}

}

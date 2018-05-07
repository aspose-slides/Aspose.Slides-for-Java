package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SmartArtNode;
import com.aspose.slides.examples.Utils;

public class AccessingSmartArtShapeNodes {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AccessingSmartArtShapeNodes.class);

        //ExStart:AccessingSmartArtShapeNodes

		// Instantiate Presentation Class
		Presentation pres = new Presentation(dataDir + "SmartArtShape.pptx");

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
					SmartArtNode node = (SmartArtNode) smart.getAllNodes().get_Item(i);

					// Printing the SmartArt node parameters
					System.out.print(node.getTextFrame().getText() + " " + node.getLevel() + " " + node.getPosition());

				}
			}
              
  //ExEnd:AccessingSmartArtShapeNodes		
}

	}

}

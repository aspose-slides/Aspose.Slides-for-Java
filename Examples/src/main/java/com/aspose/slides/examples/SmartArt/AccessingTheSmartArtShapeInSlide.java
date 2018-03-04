package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AccessingTheSmartArtShapeInSlide {

	public static void main(String[] args) {
                  //ExStart:AccessingTheSmartArtShapeInSlide
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AccessingTheSmartArtShapeInSlide.class);

		// Instantiate Presentation Class
		Presentation pres = new Presentation(dataDir + "SimpleSmartArt.pptx");

		// Get first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Traverse through every shape inside first slide
		for (IShape shape : pres.getSlides().get_Item(0).getShapes()) {
			// Check if shape is of SmartArt type
			if (shape instanceof ISmartArt) {
				// Typecast shape to SmartArtEx
				ISmartArt smart = (ISmartArt) shape;
			}
		}

              //ExEnd:AccessingTheSmartArtShapeInSlide
	}

}

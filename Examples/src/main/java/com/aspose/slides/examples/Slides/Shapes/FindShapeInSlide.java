package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class FindShapeInSlide {
	//ExStart:FindShapeInSlide
	public static void main(String[] args) {
	
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FindShapeInSlide.class);
		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "Source Frame.pptx");

		// Accessing a slide using its slide index
		ISlide slide = pres.getSlides().get_Item(0);
		// Calling FindShape method and passing the slide reference with the
		// alternative text of the shape to be found
		IShape shape = findShape(slide, "Shape1");

	}

	static IShape findShape(ISlide slide, String alttext) {
		// Iterating through all shapes inside the slide
		for (int i = 0; i < slide.getShapes().size(); i++) {
			// If the alternative text of the slide matches with the required
			// one then return the shape
			if (slide.getShapes().get_Item(i).getAlternativeText().compareTo(alttext) == 0)
				return slide.getShapes().get_Item(i);
		}
		return null;

	}
	//ExEnd:FindShapeInSlide

}
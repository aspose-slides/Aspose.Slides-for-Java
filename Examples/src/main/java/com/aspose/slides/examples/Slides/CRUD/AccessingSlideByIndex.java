package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AccessingSlideByIndex {

	public static void main(String[] args) {
		
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AccessingSlideByIndex.class);
		
		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");

		// Accessing a slide using its slide index
		ISlide slide = pres.getSlides().get_Item(0);

	}

}
package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RemoveASlideUsingSlideReference {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RemoveASlideUsingSlideReference.class);

		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");

		// Accessing a slide using its index in the slides collection
		ISlide slide = pres.getSlides().get_Item(0);

		// Removing a slide using its reference
		pres.getSlides().remove(slide);

		// Writing the presentation file
		pres.save(dataDir + "modified.pptx", SaveFormat.Pptx);

	}

}
package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RemoveASlideUsingSlideIndex {

	public static void main(String[] args) {
		
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RemoveASlideUsingSlideIndex.class);
		
		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");

		// Removing a slide using its slide index
		pres.getSlides().removeAt(0);

		// Writing the presentation file
		pres.save(dataDir + "modified.pptx", SaveFormat.Pptx);

	}

}

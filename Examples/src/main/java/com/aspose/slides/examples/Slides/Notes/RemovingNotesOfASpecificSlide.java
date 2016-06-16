package com.aspose.slides.examples.Slides.Notes;

import com.aspose.slides.INotesSlideManager;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RemovingNotesOfASpecificSlide {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RemovingNotesOfASpecificSlide.class);

		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "presWithNotes.pptx");

		// Removing notes of first slide
		INotesSlideManager mgr = pres.getSlides().get_Item(0).getNotesSlideManager();
		mgr.removeNotesSlide();

		// Saving presentation to disk
		pres.save(dataDir + "test.pptx", SaveFormat.Pptx);

	}

}

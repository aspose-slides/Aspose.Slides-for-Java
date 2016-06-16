package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationInNotesSlideViewToTIFF {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ConvertingPresentationInNotesSlideViewToTIFF.class);

		//Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");

		//Saving the presentation to TIFF notes
		pres.save(dataDir + "TestNotes.tiff", SaveFormat.TiffNotes);

	}

}
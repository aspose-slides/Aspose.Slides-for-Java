package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationInNotesSlideViewToPDF {

	public static void main(String[] args) {

		// The path to the documents directory.
		//ExStart:ConvertingPresentationInNotesSlideViewToPDF
              String dataDir = Utils.getDataDir(ConvertingPresentationInNotesSlideViewToPDF.class);

		//Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");

		//Saving the presentation to PDF notes
		pres.save(dataDir + "TestNotes.pdf", SaveFormat.PdfNotes);
               //ExEnd:ConvertingPresentationInNotesSlideViewToPDF
	}

}
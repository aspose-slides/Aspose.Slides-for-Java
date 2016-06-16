package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingASpecificSlideToPDF {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ConvertingASpecificSlideToPDF.class);

		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");
		// Setting array of slides positions
		int[] slides = new int[] { 2, 3, 5 };

		// Save the presentation to PDF
		pres.save(dataDir + "demo.pdf", slides, SaveFormat.Pdf);

	}

}

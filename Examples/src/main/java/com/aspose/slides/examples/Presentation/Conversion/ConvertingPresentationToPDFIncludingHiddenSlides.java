package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToPDFIncludingHiddenSlides {

	public static void main(String[] args) {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ConvertingPresentationToPDFIncludingHiddenSlides.class);
		Presentation pres = new Presentation(dataDir + "demo.pptx");
		try {
			// Instantiate the PdfOptions class
			PdfOptions pdfOptions = new PdfOptions();

			// Specify that the generated document should include hidden slides
			pdfOptions.setShowHiddenSlides(true);

			// Save the presentation to PDF with specified options
			pres.save(dataDir + "Presentation.pdf", SaveFormat.Pdf, pdfOptions);
		} finally {
			if (pres != null)
				pres.dispose();
		}
	}

}

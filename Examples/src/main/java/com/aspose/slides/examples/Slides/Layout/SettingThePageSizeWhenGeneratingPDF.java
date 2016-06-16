package com.aspose.slides.examples.Slides.Layout;

import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideSizeType;
import com.aspose.slides.examples.Utils;

public class SettingThePageSizeWhenGeneratingPDF {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingThePageSizeWhenGeneratingPDF.class);

		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation();

		// Set SlideSize.Type Property
		pres.getSlideSize().setType(SlideSizeType.A4Paper);

		// Set different properties of PDF Options
		PdfOptions opts = new PdfOptions();
		opts.setSufficientResolution(600);

		// Save presentation to disk
		pres.save(dataDir + "Export.pdf", SaveFormat.Pdf, opts);

	}

}

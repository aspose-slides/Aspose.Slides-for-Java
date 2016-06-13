/** 
 * Copyright 2001-2016 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToPasswordProtectedPDF {

	public static void main(String[] args) {

		// ExStart:
		
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToPasswordProtectedPDF.class);
        
		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");

		// Instantiate the PdfOptions class
		PdfOptions opts = new PdfOptions();

		// Setting PDF password
		opts.setPassword("password");

		// Save the presentation to password protected PDF
		pres.save(dataDir + "demo.pdf", SaveFormat.Pdf, opts);

		// ExEnd:

	}

}

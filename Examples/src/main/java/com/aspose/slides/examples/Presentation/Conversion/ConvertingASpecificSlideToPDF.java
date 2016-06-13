/** 
 * Copyright 2001-2016 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingASpecificSlideToPDF {

	public static void main(String[] args) {
		// ExStart:
		
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingASpecificSlideToPDF.class);
        
		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");
		// Setting array of slides positions
		int[] slides = new int[] { 2, 3, 5 };

		// Save the presentation to PDF
		pres.save(dataDir + "demo.pdf", slides, SaveFormat.Pdf);

		// ExEnd:

	}

}

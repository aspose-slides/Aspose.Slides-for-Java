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
import com.aspose.slides.XpsOptions;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToXPSWithXpsOptions {

	public static void main(String[] args) {
		// ExStart:
		
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToXPSWithXpsOptions.class);
        
		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");

		// Instantiate the TiffOptions class
		XpsOptions opts = new XpsOptions();

		// Save MetaFiles as PNG
		opts.setSaveMetafilesAsPng(true);

		// Save the presentation to XPS document
		pres.save(dataDir + "demo.xps", SaveFormat.Xps, opts);

		// ExEnd:
	}

}

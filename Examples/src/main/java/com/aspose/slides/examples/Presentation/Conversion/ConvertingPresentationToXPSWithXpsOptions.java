package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.XpsOptions;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToXPSWithXpsOptions {

	public static void main(String[] args) {
		
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
		
	}

}

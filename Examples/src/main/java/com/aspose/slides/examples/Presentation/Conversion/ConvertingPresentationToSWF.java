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
import com.aspose.slides.SwfOptions;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToSWF {

	public static void main(String[] args) {

		// ExStart:
		
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToSWF.class);
        
		Presentation pres = new Presentation(dataDir + "Sample.pptx");
		try {
			SwfOptions swfOptions = new SwfOptions();
			swfOptions.setViewerIncluded(false);
			// Saving presentation
			pres.save(dataDir + "Sample.swf", SaveFormat.Swf, swfOptions);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (pres != null)
				pres.dispose();
		}
		
		// ExEnd:

	}

}

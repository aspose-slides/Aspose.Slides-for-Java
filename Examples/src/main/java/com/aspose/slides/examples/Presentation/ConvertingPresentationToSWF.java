/** 
 * Copyright 2001-2016 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.slides.examples.Presentation;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SwfOptions;

public class ConvertingPresentationToSWF {

	public static void main(String[] args) {

		// ExStart:
		Presentation pres = new Presentation();
		try {
			SwfOptions swfOptions = new SwfOptions();

			swfOptions.setViewerIncluded(false);
			// Saving presentation
			pres.save("output.swf", SaveFormat.Swf, swfOptions);

			//swfOptions.setViewerIncluded(true);
			// Saving notes pages
			//pres.save("outputNotes.swf", SaveFormat.SwfNotes, swfOptions);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (pres != null)
				pres.dispose();
		}
		// ExEnd:

	}

}

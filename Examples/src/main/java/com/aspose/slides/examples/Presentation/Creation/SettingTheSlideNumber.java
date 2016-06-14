/* 
 * Copyright 2001-2016 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.slides.examples.Presentation.Creation;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingTheSlideNumber {

	public static void main(String[] args) {

		// ExStart:
		
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(SettingTheSlideNumber.class);
        
		// Opening the presentation file by passing the file path to the
		// constructor of Presentation class
		Presentation pres = new Presentation(dataDir + "Presentation.pptx");

		// Get the slide number
		int firstSlideNumber = pres.getFirstSlideNumber();

		// Set the slide number
		pres.setFirstSlideNumber(10);

		// Write the presentation to disk
		pres.save(dataDir + "SlideNumber.pptx", SaveFormat.Pptx);

		// ExEnd:
	}

}

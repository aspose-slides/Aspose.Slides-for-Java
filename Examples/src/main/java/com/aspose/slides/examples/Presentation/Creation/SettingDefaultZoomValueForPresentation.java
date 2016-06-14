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

public class SettingDefaultZoomValueForPresentation {
	
	public static final void main(String[] args) {
		
		// ExStart:
		
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(SettingDefaultZoomValueForPresentation.class);
        
		// Create an instance of Presentation class 
        Presentation pres = new Presentation();

        // Setting View Properties of Presentation
        pres.getViewProperties().getSlideViewProperties().setScale(50); //zoom value in percentages for slide view
        pres.getViewProperties().getNotesViewProperties().setScale(50); //zoom value in percentages for notes view 

        // Write the presentation as a PPTX file 
		pres.save(dataDir + "Zoom.pptx", SaveFormat.Pptx);

		// ExEnd:
	}
}

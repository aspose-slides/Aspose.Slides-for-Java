package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class OpeningAPresentation {

	public static final void main(String[] args) {
		
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(OpeningAPresentation.class);
        
		// Opening the presentation file by passing the file path to the
		// constructor of Presentation class
		Presentation pres = new Presentation(dataDir + "Presentation.pptx");

		// Printing the total number of slides present in the presentation
		System.out.println(pres.getSlides().size());

	}
}

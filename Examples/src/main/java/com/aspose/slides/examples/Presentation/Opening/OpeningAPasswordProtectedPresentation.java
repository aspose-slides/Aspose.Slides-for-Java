package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class OpeningAPasswordProtectedPresentation {

	public static final void main(String[] args) {
		
		// The path to the documents directory.
        	String dataDir = Utils.getDataDir(OpeningAPasswordProtectedPresentation.class);
                 //ExStart:OpeningAPasswordProtectedPresentation
		// Creating instance of load options to set the presentation access password
		LoadOptions loadOptions = new LoadOptions();

		// Setting the access password
		loadOptions.setPassword("pass");

		// Opening the presentation file by passing the file path and load
		// options to the constructor of Presentation class
		Presentation pres = new Presentation(dataDir + "demoPassDocument.pptx", loadOptions);

		// Printing the total number of slides present in the presentation
		System.out.println(pres.getSlides().size());
               //  ExEnd:OpeningAPasswordProtectedPresentation
	}
}

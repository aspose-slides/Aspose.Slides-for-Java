package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AccessingTheDocumentPropertiesOfAPasswordProtectedPresentationWithoutPassword {

	public static void main(String[] args) {
		
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessingTheDocumentPropertiesOfAPasswordProtectedPresentationWithoutPassword.class);
        
		// Creating instance of load options to set the presentation access password
		com.aspose.slides.LoadOptions loadOptions = new com.aspose.slides.LoadOptions();

		// Setting the access password to null
		loadOptions.setPassword(null);

		// Setting the access to document properties
		loadOptions.setOnlyLoadDocumentProperties(true);

		// Opening the presentation file by passing the file path and load
		// options to the constructor of Presentation class
		Presentation pres = new Presentation(dataDir + "demoPassDocument.pptx", loadOptions);

		// Getting Document Properties
		IDocumentProperties docProps = pres.getDocumentProperties();

	}

}

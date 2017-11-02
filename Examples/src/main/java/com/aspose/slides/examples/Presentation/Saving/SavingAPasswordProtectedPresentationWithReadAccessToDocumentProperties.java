package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class SavingAPasswordProtectedPresentationWithReadAccessToDocumentProperties {

	public static void main(String[] args) {
               //ExStart:SavingAPasswordProtectedPresentationWithReadAccessToDocumentProperties
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SavingAPasswordProtectedPresentationWithReadAccessToDocumentProperties.class);

		// Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation();

		// ....do some work here.....

		// Setting access to document properties in password protected mode
		pres.getProtectionManager().setEncryptDocumentProperties(false);

		// Setting Password
		pres.getProtectionManager().encrypt("pass");

		// Save your presentation to a file
		pres.save(dataDir + "demoPassDocument.pptx", com.aspose.slides.SaveFormat.Pptx);

	 //ExEnd:SavingAPasswordProtectedPresentationWithReadAccessToDocumentProperties
          }

}

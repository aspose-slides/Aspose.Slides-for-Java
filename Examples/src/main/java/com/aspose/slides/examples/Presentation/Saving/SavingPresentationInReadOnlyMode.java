package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class SavingPresentationInReadOnlyMode {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SavingPresentationInReadOnlyMode.class);

		// Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation();

		// ....do some work here.....

		// Setting Write protection Password
		pres.getProtectionManager().setWriteProtection("test");

		// Save your presentation to a file
		pres.save(dataDir + "demoWriteProtected.pptx", com.aspose.slides.SaveFormat.Pptx);

	}

}
package com.aspose.slides.examples.VBAMacros;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RemovingVBAMacrosInPresentation {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RemovingVBAMacrosInPresentation.class);
               // ExStart:RemovingVBAMacrosInPresentation 
		// Load Presentation
		Presentation pres = new Presentation(dataDir + "VBA.pptm");

		// Access the Vba module and remove
		pres.getVbaProject().getModules().remove(pres.getVbaProject().getModules().get_Item(0));

		// Save Presentation
		pres.save(dataDir + "test.pptm", SaveFormat.Pptm);

              //ExEnd:RemovingVBAMacrosInPresentation 
	}

}

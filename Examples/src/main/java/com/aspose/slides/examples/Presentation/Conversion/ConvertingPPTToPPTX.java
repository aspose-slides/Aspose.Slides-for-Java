package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPPTToPPTX {

	public static void main(String[] args) {
//ExStart:ConvertingPPTToPPTX


		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ConvertingPPTToPPTX.class);

		// Instantiate a Presentation object that represents a PPTX file
		Presentation pres = new Presentation(dataDir + "Aspose.ppt");

		// Saving the PPTX presentation to PPTX format
		pres.save(dataDir + "ConvertedAspose.pptx", SaveFormat.Pptx);
//ExEnd:ConvertingPPTToPPTX

	}

}

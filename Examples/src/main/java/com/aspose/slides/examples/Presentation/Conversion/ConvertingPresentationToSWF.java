package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SwfOptions;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToSWF {

	public static void main(String[] args) {
		//ExStart:ConvertingPresentationToSWF
		// The path to the documents directory.
        	String dataDir = Utils.getDataDir(ConvertingPresentationToSWF.class);
        
		Presentation pres = new Presentation(dataDir + "Sample.pptx");
		try {
			SwfOptions swfOptions = new SwfOptions();
			swfOptions.setIncludeComments(true);
                        swfOptions.setViewerIncluded(false);
			// Saving presentation
			pres.save(dataDir + "Sample.swf", SaveFormat.Swf, swfOptions);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (pres != null)
				pres.dispose();
		}

	}
                //ExEnd:ConvertingPresentationToSWF
}

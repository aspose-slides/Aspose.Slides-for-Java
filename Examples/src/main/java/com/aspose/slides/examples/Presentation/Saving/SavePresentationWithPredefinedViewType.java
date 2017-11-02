package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ViewType;
import com.aspose.slides.examples.Utils;

public class SavePresentationWithPredefinedViewType {

	public static void main(String[] args) {
                //  ExStart:SavePresentationWithPredefinedViewType 
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SavePresentationWithPredefinedViewType.class);

		// Opening the presentation file
		Presentation pres = new Presentation();
		// Setting view type
		pres.getViewProperties().setLastView((byte) ViewType.SlideMasterView);

		// Saving presentation
		pres.save(dataDir + "newDemo.pptx", SaveFormat.Pptx);

           //  ExEnd:SavePresentationWithPredefinedViewType 
	}

}

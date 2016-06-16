package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class CloningASlideFromOnePresentationToAnotherAtASpecifiedPosition {

	public static void main(String[] args) {
		
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CloningASlideFromOnePresentationToAnotherAtASpecifiedPosition.class);
		
		// Instantiate Presentation class to load the source presentation file
		Presentation srcPres = new Presentation(dataDir + "Presentation.pptx");

		// Instantiate Presentation class for destination presentation (where slide is to be cloned)
		Presentation destPres = new Presentation(dataDir + "demo.pptx");

		// Clone the desired slide from the source presentation to the end of the collection of slides in destination presentation
		ISlideCollection slds = destPres.getSlides();

		// Clone the desired slide from the source presentation to the specified position in destination presentation
		slds.insertClone(0, srcPres.getSlides().get_Item(1));

		// Write the destination presentation to disk
		destPres.save(dataDir + "demo.pptx", SaveFormat.Pptx);

	}

}

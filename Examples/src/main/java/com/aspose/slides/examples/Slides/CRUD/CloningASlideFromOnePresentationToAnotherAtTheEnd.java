package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class CloningASlideFromOnePresentationToAnotherAtTheEnd {

	public static void main(String[] args) {
		
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CloningASlideFromOnePresentationToAnotherAtTheEnd.class);
		
		// Instantiate Presentation class to load the source presentation file
		Presentation srcPres = new Presentation(dataDir + "Presentation.pptx");

		// Instantiate Presentation class for destination PPTX (where slide is to be cloned)
		Presentation destPres = new Presentation();

		// Clone the desired slide from the source presentation to the end of the collection of slides in destination presentation
		ISlideCollection slds = destPres.getSlides();

		slds.addClone(srcPres.getSlides().get_Item(0));

		// Write the destination presentation to disk
		destPres.save(dataDir + "helloworld_dest2.pptx", SaveFormat.Pptx);

	}

}

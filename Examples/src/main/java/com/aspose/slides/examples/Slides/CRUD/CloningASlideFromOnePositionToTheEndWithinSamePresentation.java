package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class CloningASlideFromOnePositionToTheEndWithinSamePresentation {

	public static void main(String[] args) {
		
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CloningASlideFromOnePositionToTheEndWithinSamePresentation.class);
		
		// Instantiate Presentation class that represents a presentation file
		Presentation pres = new Presentation(dataDir + "Presentation.pptx");

		// Clone the desired slide to the end of the collection of slides in the same presentation
		ISlideCollection slds = pres.getSlides();

		slds.addClone(pres.getSlides().get_Item(0));

		// Write the modified presentation to disk
		pres.save(dataDir + "helloworld_cloned.pptx", SaveFormat.Pptx);

	}

}

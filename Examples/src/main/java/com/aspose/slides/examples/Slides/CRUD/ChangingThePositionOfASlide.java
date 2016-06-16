package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ChangingThePositionOfASlide {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ChangingThePositionOfASlide.class);

		// Instantiate Presentation class to load the source presentation file
		Presentation pres = new Presentation(dataDir + "Presentation.pptx");

		// Get the slide whose position is to be changed
		ISlide sld = pres.getSlides().get_Item(0);

		// Set the new position for the slide
		sld.setSlideNumber(2);

		// Write the presentation to disk
		pres.save(dataDir + "helloworld_Pos.pptx", SaveFormat.Pptx);

	}

}

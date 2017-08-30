package com.aspose.slides.examples.Slides.Transitions;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.Utils;

public class SimpleTransition {

	public static void main(String[] args) {

	//ExStart:SimpleTransition
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SimpleTransition.class);

		// Instantiate a Presentation object that represents a PPTX file
		Presentation pres = new Presentation(dataDir + "SimpleSlideTransitions.pptx");

		// Accessing a slide using its slide position
		ISlide slide = pres.getSlides().get_Item(1);

		// Setting the slide transition effect to fade
		slide.getSlideShowTransition().setType(TransitionType.Fade);

		// Writing the presentation as a PPTX file
		pres.save(dataDir + "modified.pptx", SaveFormat.Pptx);

	//ExEnd:SimpleTransition
	}

}

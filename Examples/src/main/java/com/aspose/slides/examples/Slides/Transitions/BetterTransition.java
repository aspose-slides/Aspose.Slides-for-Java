package com.aspose.slides.examples.Slides.Transitions;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionSpeed;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.Utils;

public class BetterTransition {

	public static void main(String[] args) {
		
		 // The path to the documents directory.
	    String dataDir = Utils.getDataDir(BetterTransition.class);

		// Instantiate a Presentation object that represents a PPTX file
		Presentation pres = new Presentation(dataDir + "BetterSlideTransitions.pptx");

		// Accessing a slide using its slide position
		ISlide slide = pres.getSlides().get_Item(1);

		// Setting the slide transition effect to fade
		slide.getSlideShowTransition().setType(TransitionType.Fade);

		// Setting the speed of slide transition to slow
		slide.getSlideShowTransition().setSpeed(TransitionSpeed.Slow);

		// Setting the transition to advance on click
		slide.getSlideShowTransition().setAdvanceOnClick(true);

		// Setting the transition to advance after a specific time period
		slide.getSlideShowTransition().setAdvanceAfterTime(5);

		// Writing the presentation as a PPTX file
		pres.save(dataDir + "modified.pptx", SaveFormat.Pptx);


	}

}

package com.aspose.slides.examples.Slides.Transitions;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.Utils;

public class ManagingBetterSlideTransitions {

	public static void main(String[] args) {
		
		// The path to the documents directory.
	    	String dataDir = Utils.getDataDir(ManagingBetterSlideTransitions.class);

		// Instantiate Presentation class that represents a presentation file
		Presentation pres = new Presentation(dataDir + "BetterSlideTransitions.pptx");

		// Apply circle type transition on slide 1
		pres.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Circle);

		// Set the transition time of 3 seconds
		// Set the transition time of 5 seconds
		pres.getSlides().get_Item(0).getSlideShowTransition().setAdvanceOnClick(true);
		pres.getSlides().get_Item(0).getSlideShowTransition().setAdvanceAfterTime(3000);

		// Apply comb type transition on slide 2
		pres.getSlides().get_Item(1).getSlideShowTransition().setType(TransitionType.Comb);

		// Set the transition time of 5 seconds
		pres.getSlides().get_Item(1).getSlideShowTransition().setAdvanceOnClick(true);
		pres.getSlides().get_Item(1).getSlideShowTransition().setAdvanceAfterTime(5000);

		// Apply zoom type transition on slide 3
		pres.getSlides().get_Item(2).getSlideShowTransition().setType(TransitionType.Zoom);

		// Set the transition time of 7 seconds
		pres.getSlides().get_Item(2).getSlideShowTransition().setAdvanceOnClick(true);
		pres.getSlides().get_Item(2).getSlideShowTransition().setAdvanceAfterTime(7000);

		// Write the presentation to disk
		pres.save(dataDir + "SampleTransition.pptx", SaveFormat.Pptx);

	}

}

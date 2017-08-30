package com.aspose.slides.examples.Slides.Transitions;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.Utils;

public class ManagingSimpleSlideTransitions {

	public static void main(String[] args) {
		
	//ExStart:ManagingSimpleSlideTransitions
			// The path to the documents directory.
	    String dataDir = Utils.getDataDir(ManagingSimpleSlideTransitions.class);
	    
		// Instantiate Presentation class that represents a presentation file
		Presentation pres = new Presentation(dataDir + "SimpleSlideTransitions.pptx");

		// Apply circle type transition on slide 1
		pres.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Circle);

		// Apply comb type transition on slide 2
		pres.getSlides().get_Item(1).getSlideShowTransition().setType(TransitionType.Comb);

		// Apply zoom type transition on slide 3
		pres.getSlides().get_Item(2).getSlideShowTransition().setType(TransitionType.Zoom);

		// Write the presentation to disk
		pres.save(dataDir + "SampleTransition.pptx", SaveFormat.Pptx);
	//ExEnd:ManagingSimpleSlideTransitions
	


	}

}

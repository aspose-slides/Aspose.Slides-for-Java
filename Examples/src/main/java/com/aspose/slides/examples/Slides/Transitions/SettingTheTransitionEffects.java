package com.aspose.slides.examples.Slides.Transitions;

import com.aspose.slides.OptionalBlackTransition;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.Utils;

public class SettingTheTransitionEffects {

	public static void main(String[] args) {
		 
		// The path to the documents directory.
	    	String dataDir = Utils.getDataDir(SettingTheTransitionEffects.class);
		
	    	// Create an instance of Presentation class
		Presentation pres = new Presentation();

		// Set effect
		pres.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Cut);
		((OptionalBlackTransition) pres.getSlides().get_Item(0).getSlideShowTransition().getValue()).setFromBlack(true);

		// Write the presentation to disk
		pres.save(dataDir + "Test.pptx", SaveFormat.Pptx);

	}

}

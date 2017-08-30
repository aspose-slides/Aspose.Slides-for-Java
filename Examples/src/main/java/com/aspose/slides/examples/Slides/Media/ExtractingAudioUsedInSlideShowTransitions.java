package com.aspose.slides.examples.Slides.Media;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISlideShowTransition;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class ExtractingAudioUsedInSlideShowTransitions {

	public static void main(String[] args) {
		            //ExStart:ExtractingAudioUsedInSlideShowTransitions

		// The path to the documents directory.
	    	String dataDir = Utils.getDataDir(ExtractingAudioUsedInSlideShowTransitions.class);
	    
		String presName = "AudioSlide.pptx";
		// Instantiate Presentation class that represents the presentation file
		Presentation pres = new Presentation(dataDir + presName);

		// Access the desired slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Get the slideshow transition effects for slide
		ISlideShowTransition transition = slide.getSlideShowTransition();

		// Extract sound in byte array
		byte[] audio = transition.getSound().getBinaryData();
		System.out.println("Length: " + audio.length);
	            //ExEnd:ExtractingAudioUsedInSlideShowTransitions
}

}

package com.aspose.slides.examples.slides.media;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISlideShowTransition;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class ExtractAudio
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Media();

        String presName = dataDir + "AudioSlide.ppt";

        //ExStart:ExtractAudio
        // Instantiate Presentation class that represents the presentation file
        Presentation pres = new Presentation(presName);
        try {
            // Access the desired slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Get the slideshow transition effects for slide
            ISlideShowTransition transition = slide.getSlideShowTransition();

            //Extract sound in byte array
            byte[] audio = transition.getSound().getBinaryData();

            System.out.println("Length: " + audio.length);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExtractAudio

    }
}


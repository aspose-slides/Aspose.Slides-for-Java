package com.aspose.slides.examples.slides.media;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISlideShowTransition;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class ExtractAudio
{
    public static void main(String[] args)
    {

        //ExStart:ExtractAudio

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Media();

        String presName = dataDir + "AudioSlide.pptx";

        // Instantiate Presentation class that represents the presentation file
        Presentation pres = new Presentation(presName);

        // Access the desired slide
        ISlide slide = pres.getSlides().get_Item(2);

        // Get the slideshow transition effects for slide
        ISlideShowTransition transition = slide.getSlideShowTransition();

        //Extract sound in byte array
        byte[] audio = transition.getSound().getBinaryData();

        System.out.println("Length: " + audio.length);
        //ExEnd:ExtractAudio

    }
}


package com.aspose.slides.examples.slides.transitions;


import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This example demonstrates how to set the duration of the slide transition effect in milliseconds.
*/

public class AnimationDurationSlide
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();
        String outPath = RunExamples.getOutPath() + "AnimationDurationSlidest-out.pptx";

        //ExStart:AnimationDurationSlide
        // Instantiate Presentation class that represents a presentation file
        Presentation pres = new Presentation(dataDir + "AnimationDurationSlides.pptx");
        {
            for (ISlide slide : pres.getSlides())
            {
                // Sets the transition duration to 0.25s
                slide.getSlideShowTransition().setDuration(250);
            }

            // Save result
            pres.save(outPath, SaveFormat.Pptx);
        }
        //ExEnd:AnimationDurationSlide
    }
}

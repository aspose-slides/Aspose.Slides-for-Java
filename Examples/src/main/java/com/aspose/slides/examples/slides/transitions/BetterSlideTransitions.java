package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.RunExamples;


public class BetterSlideTransitions
{
    public static void main(String[] args)
    {
        //ExStart:BetterSlideTransitions
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();

        // Instantiate Presentation class that represents a presentation file
        Presentation pres = new Presentation(dataDir + "BetterSlideTransitions.pptx");
        try
        {

            // Apply circle type transition on slide 1
            pres.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Circle);


            // Set the transition time of 3 seconds
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
            pres.save(dataDir + "SampleTransition_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:BetterSlideTransitions
    }
}

package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.RunExamples;





public class SimpleSlideTransitions
{
    public static void main(String[] args)
    {
        //ExStart:SimpleSlideTransitions
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();

        // Instantiate Presentation class that represents a presentation file
        Presentation pres = new Presentation(dataDir + "SimpleSlideTransitions.pptx");
        try
        {

            // Apply circle type transition on slide 1
            pres.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Circle);

            // Apply comb type transition on slide 2
            pres.getSlides().get_Item(1).getSlideShowTransition().setType(TransitionType.Comb);

            // Write the presentation to disk
            pres.save(dataDir + "SampleTransition_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SimpleSlideTransitions
    }
}

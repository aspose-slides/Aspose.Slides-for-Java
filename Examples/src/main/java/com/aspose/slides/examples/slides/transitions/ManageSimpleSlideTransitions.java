package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.RunExamples;





public class ManageSimpleSlideTransitions
{
    public static void main(String[] args)
    {
        //ExStart:ManageSimpleSlideTransitions
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();

        // Instantiate Presentation class to load the source presentation file
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");
        try
        {
            // Apply circle type transition on slide 1
            presentation.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Circle);

            // Apply comb type transition on slide 2
            presentation.getSlides().get_Item(1).getSlideShowTransition().setType(TransitionType.Comb);

            // Write the presentation to disk
            presentation.save(dataDir + "SampleTransition_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ManageSimpleSlideTransitions
    }
}

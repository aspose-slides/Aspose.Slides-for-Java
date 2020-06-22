package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.OptionalBlackTransition;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.RunExamples;


public class SetTransitionEffects
{
    public static void main(String[] args)
    {
        //ExStart:SetTransitionEffects
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");
        try
        {
            // Set effect
            presentation.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Cut);
            ((OptionalBlackTransition) presentation.getSlides().get_Item(0).getSlideShowTransition().getValue()).setFromBlack(true);

            // Write the presentation to disk
            presentation.save(dataDir + "SetTransitionEffects_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetTransitionEffects
    }
}

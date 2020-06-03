package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SetTransitionMorphType
{
    public static void main(String[] args)
    {

        //ExStart:SetTransitionMorphType
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();

        Presentation presentation = new Presentation(dataDir + "presentation.pptx");
        try
        {
            presentation.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Morph);
            ((IMorphTransition) presentation.getSlides().get_Item(0).getSlideShowTransition().getValue()).setMorphType(TransitionMorphType.ByWord);
            presentation.save(dataDir + "presentation-out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetTransitionMorphType
    }
}


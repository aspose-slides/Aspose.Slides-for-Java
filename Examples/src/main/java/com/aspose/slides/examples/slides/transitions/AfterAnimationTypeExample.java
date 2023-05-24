package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;

public class AfterAnimationTypeExample
{
    public static void main(String[] args)
    {
        String pptxFileName = RunExamples.getDataDir_Slides_Presentations_LowCode() + "ForEachPortion.pptx";

        //ExStart:AfterAnimationTypeExample
        // The path to the document directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();
        String outPath = RunExamples.getOutPath() + "AnimationAfterEffect-out.pptx";

        // Instantiate Presentation class that represents a presentation file
        Presentation pres = new Presentation(dataDir + "AnimationAfterEffect.pptx");
        try {
            // Add new slide to the presentation
            ISlide slide1 = pres.getSlides().addClone(pres.getSlides().get_Item(0));
            // Get the first effect of the first slide
            ISequence seq = slide1.getTimeline().getMainSequence();
            // Change the After animation effect to "Hide on Next Mouse Click"
            for (IEffect effect : seq)
                effect.setAfterAnimationType(AfterAnimationType.HideOnNextMouseClick);

            // Add new slide to the presentation
            ISlide slide2 = pres.getSlides().addClone(pres.getSlides().get_Item(0));
            // Get the first effect of the first slide
            seq = slide2.getTimeline().getMainSequence();
            // Change the After animation effect type to "Color"
            for (IEffect effect : seq)
            {
                effect.setAfterAnimationType(AfterAnimationType.Color);
                effect.getAfterAnimationColor().setColor(Color.GREEN);
            }

            // Add new slide to the presentation
            ISlide slide3 = pres.getSlides().addClone(pres.getSlides().get_Item(0));
            // Get the first effect of the first slide
            seq = slide3.getTimeline().getMainSequence();
            // Change the After animation effect to "Hide After Animation"
            for (IEffect effect : seq)
                effect.setAfterAnimationType(AfterAnimationType.HideAfterAnimation);

            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AfterAnimationTypeExample
    }
}

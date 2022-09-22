package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.IEffect;
import com.aspose.slides.ISequence;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

public class AnimationRepeatOnSlide
{
    public static void main(String[] args)
    {
        // The path to the document directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();
        String outDir = RunExamples.getOutPath();

        //ExStart:AnimationRepeatOnSlide
        // Instantiate Presentation class that represents a presentation file
        Presentation pres = new Presentation(dataDir + "AnimationOnSlide.pptx");
        try {
            // Gets the effects sequence for the first slide
            ISequence effectsSequence = pres.getSlides().get_Item(0).getTimeline().getMainSequence();

            // Gets the first effect of the main sequence.
            IEffect effect = effectsSequence.get_Item(0);

            // Changes the effect Timing/Repeat to "Until End of Slide"
            effect.getTiming().setRepeatUntilEndSlide(true);

            // Changes the effect Timing/Repeat to "Until End of Slide"
            effect.getTiming().setRepeatUntilNextClick(true);
            // Save presentation
            pres.save(outDir + "AnimationOnSlide-out.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AnimationRepeatOnSlide
    }
}

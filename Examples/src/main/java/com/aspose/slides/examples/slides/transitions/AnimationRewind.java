package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.IEffect;
import com.aspose.slides.ISequence;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

public class AnimationRewind
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();

        // Instantiate Presentation class that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "AnimationRewind.pptx");
        try {
            // Gets the effects sequence for the first slide
            ISequence effectsSequence = presentation.getSlides().get_Item(0).getTimeline().getMainSequence();

            // Gets the first effect of the main sequence.
            IEffect effect = effectsSequence.get_Item(0);
            System.out.println("Effect Timing/Rewind in source presentation is " + effect.getTiming().getRewind());
            // Turns the effect Timing/Rewind on.
            effect.getTiming().setRewind(true);

            // Save presentation
            presentation.save(RunExamples.OutPath + "AnimationRewind-out.pptx", SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }

        Presentation pres = new Presentation(RunExamples.OutPath + "AnimationRewind-out.pptx");
        try {
            // Gets the effects sequence for the first slide
            ISequence effectsSequence = pres.getSlides().get_Item(0).getTimeline().getMainSequence();

            // Gets the first effect of the main sequence.
            IEffect effect = effectsSequence.get_Item(0);
            System.out.println("Effect Timing/Rewind in destination presentation is " + effect.getTiming().getRewind());
        } finally {
            if (pres != null) pres.dispose();
        }
    }
}

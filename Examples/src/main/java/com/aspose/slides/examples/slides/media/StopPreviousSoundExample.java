package com.aspose.slides.examples.slides.media;

import com.aspose.slides.IEffect;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

public class StopPreviousSoundExample
{
    public static void main(String[] args)
    {
        //ExStart:StopPreviousSoundExample
        String pptxFile = RunExamples.getDataDir_Slides_Presentations_Media() + "AnimationStopSound.pptx";
        String outPath = RunExamples.getOutPath() + "AnimationStopSound-out.pptx";

        Presentation pres = new Presentation(pptxFile);
        try {
            // Gets the first effect of the first slide.
            IEffect firstSlideEffect = pres.getSlides().get_Item(0).getTimeline().getMainSequence().get_Item(0);

            // Gets the first effect of the second slide.
            IEffect secondSlideEffect = pres.getSlides().get_Item(1).getTimeline().getMainSequence().get_Item(0);

            if (firstSlideEffect.getSound() != null)
            {
                // Changes the second effect Enhancements/Sound to "Stop Previous Sound"
                secondSlideEffect.setStopPreviousSound(true);
            }
            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:StopPreviousSoundExample
    }
}

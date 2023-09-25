package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class AnimateTextTypeExample
{
    public static void main(String[] args)
    {
        // Path to output document
        String outFilePath = RunExamples.getOutPath() + "AnimateTextEffect_out.pptx";

        //ExStart:AnimateTextTypeExample
        Presentation presentation = new Presentation();
        try {
            IAutoShape oval = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Ellipse, 100, 100, 300, 150);
            oval.getTextFrame().setText("The new animated text");

            // Get anomation timeline.
            IAnimationTimeLine timeline = presentation.getSlides().get_Item(0).getTimeline();

            // Set the effect of the first slide.
            IEffect effect = timeline.getMainSequence().addEffect(oval, EffectType.Appear, EffectSubtype.None, EffectTriggerType.OnClick);

            // Set the effect Animate text type to "By letter".
            effect.setAnimateTextType(AnimateTextType.ByLetter);

            // Set the delay between animated text parts.
            effect.setDelayBetweenTextParts(-1.5f);

            // Save presentation.
            presentation.save(outFilePath, SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }


        //ExEnd:AnimateTextTypeExample
    }
}

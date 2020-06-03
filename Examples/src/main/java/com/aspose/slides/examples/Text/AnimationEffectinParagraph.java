package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AnimationEffectinParagraph
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        //ExStart:AnimationEffectinParagraph
        Presentation presentation = new Presentation(dataDir + "Presentation1.pptx");
        try
        {
            // select paragraph to add effect
            IAutoShape autoShape = (IAutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0);
            IParagraph paragraph = autoShape.getTextFrame().getParagraphs().get_Item(0);

            // add Fly animation effect to selected paragraph
            IEffect effect = presentation.getSlides().get_Item(0).getTimeline().getMainSequence().addEffect(paragraph, EffectType.Fly, EffectSubtype.Left, EffectTriggerType.OnClick);


            presentation.save(dataDir + "AnimationEffectinParagraph.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }


        //ExEnd:AnimationEffectinParagraph
    }
}


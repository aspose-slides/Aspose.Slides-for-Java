package com.aspose.slides.examples.Text;

import com.aspose.slides.EffectSubtype;
import com.aspose.slides.EffectTriggerType;
import com.aspose.slides.EffectType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IEffect;
import com.aspose.slides.IParagraph;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class AnimationEffectinParagraph {
    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AnimationEffectinParagraph.class);

        //ExStart:AnimationEffectinParagraph
        // Create an instance of Presentation class
        Presentation presentation = new Presentation(dataDir + "Presentation1.pptx");
        try {
            // select paragraph to add effect
            IAutoShape autoShape = (IAutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0);
            IParagraph paragraph = autoShape.getTextFrame().getParagraphs().get_Item(0);

            // add Fly animation effect to selected paragraph
            IEffect effect = presentation.getSlides().get_Item(0).getTimeline().getMainSequence().
                    addEffect(paragraph, EffectType.Fly, EffectSubtype.Left, EffectTriggerType.OnClick);

            presentation.save(dataDir + "AnimationEffectinParagraph.pptx", SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AnimationEffectinParagraph

    }
}

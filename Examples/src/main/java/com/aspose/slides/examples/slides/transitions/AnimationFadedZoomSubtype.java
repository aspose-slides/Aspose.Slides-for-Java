package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class AnimationFadedZoomSubtype
{
    public static void main(String[] args)
    {
        String outPres = RunExamples.getOutPath() + "AnimationFadedZoom-out.pptx";

        //ExStart:AnimationFadedZoomSubtype
        // Instantiate Presentation class that represents a presentation file
        Presentation pres = new Presentation();
        try {
            // Create shapes for demonstration
            IAutoShape shp1 = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle,
                    0,
                    0,
                    50,
                    50);
            IAutoShape shp2 = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle,
                    100,
                    0,
                    50,
                    50);
            // Add FadedZoom effects
            IEffect ef1 = pres.getSlides().get_Item(0).getTimeline().getMainSequence().addEffect(shp1,
                    EffectType.FadedZoom,
                    EffectSubtype.ObjectCenter,
                    EffectTriggerType.OnClick);
            IEffect ef2 = pres.getSlides().get_Item(0).getTimeline().getMainSequence().addEffect(shp2,
                    EffectType.FadedZoom,
                    EffectSubtype.SlideCenter,
                    EffectTriggerType.OnClick);
            // Save presentation
            pres.save(outPres, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AnimationFadedZoomSubtype
    }
}

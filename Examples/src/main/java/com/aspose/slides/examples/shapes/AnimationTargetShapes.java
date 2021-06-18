package com.aspose.slides.examples.shapes;/*
 * Copyright (c) 2009-2021 Aspose Pty Ltd. All Rights Reserved.
 */

import com.aspose.slides.IEffect;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

public class AnimationTargetShapes
{
    public static void main(String[] args)
    {
        //ExStart:AnimationTargetShapes
        // Path to source presentation
        String presentationFileName = RunExamples.getDataDir_Shapes() + "AnimationShapesExample.pptx";

        Presentation pres = new Presentation(presentationFileName);
        try {
            for (ISlide slide : pres.getSlides())
            {
                for (IEffect effect : slide.getTimeline().getMainSequence())
                {
                    System.out.println(effect.getType() + " animation effect is set to shape#" +
                            effect.getTargetShape().getUniqueId() + " on slide#" + slide.getSlideNumber());
                }
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AnimationTargetShapes
    }
}

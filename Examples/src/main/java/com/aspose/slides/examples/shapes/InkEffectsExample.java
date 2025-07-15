package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class InkEffectsExample
{
    public static void main(String[] args)
    {
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Shapes();

        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "InkEffects.png";

        //ExStart:InkEffectsExample
        Presentation pres = new Presentation(dataDir + "InkEffects.pptx");
        try {
            // Get Ink object
            Ink ink = (Ink) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            IInkBrush brush = ink.getTraces()[0].getBrush();

            // Show InkEffects of the brush
            System.out.println("InkEffects = " + InkEffectType.getName(InkEffectType.class, brush.getInkEffect()));

            // Set image for InkEffects
            IImage image = Images.fromFile(dataDir + "Effect.png");
            Ink.getInkEffectImages().addItem(brush.getInkEffect(), image);

            // Save result
            pres.getSlides().get_Item(0).getImage(2f, 2f).save(outFilePath, ImageFormat.Png);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:InkEffectsExample
    }
}

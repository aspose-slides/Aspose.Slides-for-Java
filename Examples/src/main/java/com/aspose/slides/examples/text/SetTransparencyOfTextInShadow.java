package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class SetTransparencyOfTextInShadow
{
    public static void main(String[] args)
    {
        //ExStart:SetTransparencyOfTextInShadow
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();
        Presentation pres = new Presentation(dataDir + "transparency.pptx");
        try
        {
            IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            IEffectFormat effects = shape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getEffectFormat();

            IOuterShadow outerShadowEffect = effects.getOuterShadowEffect();

            Color shadowColor = outerShadowEffect.getShadowColor().getColor();
            System.out.println(String.format("{0} - transparency is: {1}", shadowColor, ((float) (shadowColor.getAlpha() & 0xFF) / (Byte.MIN_VALUE & 0xFF)) * 100));

            // set transparency to zero percent
            //com.aspose.cells.Color.fromArgb(255, shadowColor.Clone()).CloneTo(outerShadowEffect.getShadowColor().getColor());
            outerShadowEffect.getShadowColor().setColor(new java.awt.Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), 255));
            pres.save(dataDir + "transparency-2.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SetTransparencyOfTextInShadow
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IEffectFormat;
import com.aspose.slides.IOuterShadow;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

import java.awt.Color;

/**
 * @author mfazi
 */
public class SetTransparencyOfTextInShadow {
    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetTransparencyOfTextInShadow.class);

        //ExStart:SetTransparencyOfTextInShadow
        // Create an instance of Presentation class
        Presentation pres = new Presentation(dataDir + "transparency.pptx");
        try {
            IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            IEffectFormat effects = shape.getTextFrame().getParagraphs().get_Item(0).
                    getPortions().get_Item(0).getPortionFormat().getEffectFormat();

            IOuterShadow outerShadowEffect = effects.getOuterShadowEffect();

            java.awt.Color shadowColor = outerShadowEffect.getShadowColor().getColor();
            System.out.println("{shadowColor} - transparency is: {((float)shadowColor.Alpha / 255) * 100}");

            // set transparency to zero percent
            outerShadowEffect.getShadowColor().setColor(
                    new java.awt.Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), 255));

            pres.save(dataDir + "transparency-2.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExStart:SetTransparencyOfTextInShadow
    }

}
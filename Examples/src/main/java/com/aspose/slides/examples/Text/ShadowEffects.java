/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Text;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

import java.awt.*;

public class ShadowEffects
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ShadowEffects.class);

        //Create an instance of Presentation class
        Presentation Pres = new Presentation();

        //Get first slide
        ISlide Slide = Pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle type
        IAutoShape aShp = Slide.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

        //Add TextFrame to the Rectangle
        aShp.addTextFrame("Aspose TextBox");

        // Disable shape fill in case we want to get shadow of Text1
        aShp.getFillFormat().setFillType(FillType.NoFill);

        // Add outer shadow and set all necessary parameters
        aShp.getEffectFormat().enableOuterShadowEffect();
        IOuterShadow Shadow = aShp.getEffectFormat().getOuterShadowEffect();
        Shadow.setBlurRadius(4.0);
        Shadow.setDirection(45);
        Shadow.setDistance(3);
        Shadow.setRectangleAlign(RectangleAlignment.TopLeft);
        Shadow.getShadowColor().setColor(Color.black);

        //Write the Presentation1 to disk
        Pres.save(dataDir+ "pres.pptx", SaveFormat.Pptx);
    }
}





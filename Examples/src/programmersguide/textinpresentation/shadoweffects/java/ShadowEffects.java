/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.textinpresentation.shadoweffects.java;

import com.aspose.slides.*;

public class ShadowEffects
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/textinpresentation/shadoweffects/data/";

        //instantiate a Presentation Object
        Presentation pres = new Presentation();

        //Get first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle type
        IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

        //Add TextFrame to the Rectangle
        ashp.addTextFrame("Aspose TextBox");

        // Disable shape fill in case we want to get shadow of text.
        ashp.getFillFormat().setFillType(FillType.NoFill);

        // Add outer shadow and set all necessary parameters
        OuterShadow shadow = new OuterShadow();
        ashp.getEffectFormat().setOuterShadowEffect(shadow);
        shadow.setBlurRadius(4.0);
        shadow.setDirection(45);
        shadow.setDistance(3);
        shadow.setRectangleAlign(RectangleAlignment.TopLeft);
        shadow.getShadowColor().setPresetColor(PresetColor.Black);

        //Write the presentation to disk
        pres.save(dataDir+ "pres.pptx", SaveFormat.Pptx);
    }
}





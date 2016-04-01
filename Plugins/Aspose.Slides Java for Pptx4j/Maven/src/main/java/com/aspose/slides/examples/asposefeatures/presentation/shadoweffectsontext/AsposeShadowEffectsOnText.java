package com.aspose.slides.examples.asposefeatures.presentation.shadoweffectsontext;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.IOuterShadow;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresetColor;
import com.aspose.slides.RectangleAlignment;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class AsposeShadowEffectsOnText
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeShadowEffectsOnText.class);

        // instantiate a Presentation Object
        Presentation pres = new Presentation();

        // Get first slide
        ISlide sld = pres.getSlides().get_Item(0);

        // Add an AutoShape of Rectangle type
        IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle,
                        150, 75, 150, 50);

        // Add TextFrame to the Rectangle
        ashp.addTextFrame("Aspose TextBox");

        // Disable shape fill in case we want to get shadow of text.
        ashp.getFillFormat().setFillType(FillType.NoFill);

        // Add outer shadow and set all necessary parameters
        ashp.getEffectFormat().enableOuterShadowEffect(); 
        IOuterShadow shadow = ashp.getEffectFormat().getOuterShadowEffect();
        shadow.setBlurRadius(4.0);
        shadow.setDirection(45);
        shadow.setDistance(3);
        shadow.setRectangleAlign(RectangleAlignment.TopLeft);
        shadow.getShadowColor().setPresetColor(PresetColor.Black);

        // Write the presentation to disk
        pres.save(dataDir + "AsposeTextShadow_Out.pptx", SaveFormat.Pptx);

        System.out.println("Process Completed Successfully.");
    }
}

package com.aspose.slides.examples.Text;

import com.aspose.slides.ColorType;
import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IEffectFormat;
import com.aspose.slides.IPortion;
import com.aspose.slides.IPortionFormat;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SchemeColor;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class ManagingWordArtProperties {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ManagingWordArtProperties.class);

        //ExStart:ManagingWordArtProperties
        // Create an instance of Presentation class
        Presentation pres = new Presentation();
        try {
            // Get reference of a slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Add an AutoShape of Rectangle type
            IAutoShape ashp = slide.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 400, 300);
            ashp.getFillFormat().setFillType(FillType.NoFill);

            // Add TextFrame to the Rectangle
            ashp.addTextFrame("Aspose TextBox");
            IPortion port = ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0);
            IPortionFormat pf = port.getPortionFormat();
            pf.setFontHeight(50);

            // Enable InnerShadowEffect
            IEffectFormat ef = pf.getEffectFormat();
            ef.enableInnerShadowEffect();

            // Set all necessary parameters
            ef.getInnerShadowEffect().setBlurRadius(8.0);
            ef.getInnerShadowEffect().setDirection(90);
            ef.getInnerShadowEffect().setDistance(6.0);
            ef.getInnerShadowEffect().getShadowColor().setB((byte) 189);

            // Set ColorType as Scheme
            ef.getInnerShadowEffect().getShadowColor().setColorType(ColorType.Scheme);

            // Set Scheme Color
            ef.getInnerShadowEffect().getShadowColor().setSchemeColor(SchemeColor.Accent1);

            // Write the presentation as a PPTX file
            pres.save(dataDir + "WordArt.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ManagingWordArtProperties
    }

}

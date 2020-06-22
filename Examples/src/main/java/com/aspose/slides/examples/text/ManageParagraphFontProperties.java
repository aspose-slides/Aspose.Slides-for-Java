package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class ManageParagraphFontProperties
{
    public static void main(String[] args)
    {
        //ExStart:ManageParagraphFontProperties
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Instantiate PresentationEx 
        Presentation presentation = new Presentation(dataDir + "DefaultFonts.pptx");
        try
        {
            // Accessing a slide using its slide position
            ISlide slide = presentation.getSlides().get_Item(0);

            // Accessing the first and second placeholder in the slide and typecasting it as AutoShape
            ITextFrame tf1 = ((IAutoShape) slide.getShapes().get_Item(0)).getTextFrame();
            ITextFrame tf2 = ((IAutoShape) slide.getShapes().get_Item(1)).getTextFrame();

            // Accessing the first Paragraph
            IParagraph para1 = tf1.getParagraphs().get_Item(0);
            IParagraph para2 = tf2.getParagraphs().get_Item(0);

            // Justify the paragraph
            para2.getParagraphFormat().setAlignment(TextAlignment.JustifyLow);

            // Accessing the first portion
            IPortion port1 = para1.getPortions().get_Item(0);
            IPortion port2 = para2.getPortions().get_Item(0);

            // Define new fonts
            FontData fd1 = new FontData("Elephant");
            FontData fd2 = new FontData("Castellar");

            // Assign new fonts to portion
            port1.getPortionFormat().setLatinFont(fd1);
            port2.getPortionFormat().setLatinFont(fd2);

            // Set font to Bold
            port1.getPortionFormat().setFontBold(NullableBool.True);
            port2.getPortionFormat().setFontBold(NullableBool.True);

            // Set font to Italic
            port1.getPortionFormat().setFontItalic(NullableBool.True);
            port2.getPortionFormat().setFontItalic(NullableBool.True);

            // Set font color
            port1.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            port1.getPortionFormat().getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Purple));
            port2.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            port2.getPortionFormat().getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Peru));

            // Write the PPTX to disk 
            presentation.save(dataDir + "ManagParagraphFontProperties_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ManageParagraphFontProperties
    }
}


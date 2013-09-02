/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithtextinpresentationex.managingfontrelatedproperties.java;

import com.aspose.slides.*;

import java.awt.*;

public class ManagingFontRelatedProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithtextinpresentationex/managingfontrelatedproperties/data/";

        //Instantiate a Presentation object that represents a PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Accessing a slide using its slide position
        SlideEx slide = pres.getSlides().get_Item(0);

        //Accessing the first and second placeholder in the slide and typecasting it as AutoShape
        //Accessing the first and second placeholder in the slide and typecasting it as AutoShape
        TextFrameEx tf1 = ((AutoShapeEx)slide.getShapes().get_Item(0)).getTextFrame();
        TextFrameEx tf2 = ((AutoShapeEx)slide.getShapes().get_Item(1)).getTextFrame();

        //Accessing the first Paragraph
        ParagraphEx para1 = tf1.getParagraphs().get_Item(0);
        ParagraphEx para2 = tf2.getParagraphs().get_Item(0);

        //Accessing the first portion
        PortionEx port1 = para1.getPortions().get_Item(0);
        PortionEx port2 = para2.getPortions().get_Item(0);

        //Define new fonts
        FontDataEx fd1 = new FontDataEx("Elephant");
        FontDataEx fd2 = new FontDataEx("Castellar");

        //Assign new fonts to portion
        port1.getPortionFormat().setLatinFont(fd1);
        port2.getPortionFormat().setLatinFont(fd2);

        //Set font to Bold
        port1.getPortionFormat().setFontBold(NullableBool.True);
        port2.getPortionFormat().setFontBold(NullableBool.True);

        //Set font to Italic
        port1.getPortionFormat().setFontItalic (NullableBool.True);
        port2.getPortionFormat().setFontItalic (NullableBool.True);

        //Set font color
        port1.getPortionFormat().getFillFormat().setFillType(FillTypeEx.Solid);
        port1.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.blue);
        port2.getPortionFormat().getFillFormat().setFillType(FillTypeEx.Solid);
        port2.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.red);

        //Write the PPTX to disk
        pres.write(dataDir + "output.pptx");

        // Status
        System.out.println("Process completed successfully.");

    }
}





/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.textinpresentation.fontproperties.java;


import com.aspose.slides.*;

import java.awt.*;

public class FontProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/textinpresentation/fontproperties/data/";
        //Instantiate a Presentation object that represents a PPTX file
        Presentation pres = new Presentation(dataDir+ "welcome.pptx");

        //Accessing a slide using its slide position
        ISlide slide = pres.getSlides().get_Item(0);

        //Accessing the first and second placeholder in the slide and typecasting it as AutoShape
        ITextFrame tf1 = ((IAutoShape)slide.getShapes().get_Item(0)).getTextFrame();
        ITextFrame tf2 = ((IAutoShape)slide.getShapes().get_Item(1)).getTextFrame();

        //Accessing the first Paragraph
        IParagraph para1 = tf1.getParagraphs().get_Item(0);
        IParagraph para2 = tf2.getParagraphs().get_Item(0);

        //Accessing the first portion
        IPortion port1 = para1.getPortions().get_Item(0);
        IPortion port2 = para2.getPortions().get_Item(0);

        //Define new fonts
        FontData fd1 = new FontData("Elephant");
        FontData fd2 = new FontData("Castellar");

        //Assign new fonts to portion
        port1.getPortionFormat().setLatinFont(fd1);
        port2.getPortionFormat().setLatinFont(fd2);

        //Set font to Bold
        port1.getPortionFormat().setFontBold(NullableBool.True);
        port2.getPortionFormat().setFontBold(NullableBool.True);

        //Set font to Italic
        port1.getPortionFormat().setFontItalic(NullableBool.True);
        port2.getPortionFormat().setFontItalic(NullableBool.True);

        //Set font color
        port1.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
        port1.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
        port2.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
        port2.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.GREEN);

        //Save the PPTX to disk
        pres.save(dataDir+ "WelcomeFont.pptx", SaveFormat.Pptx);


    }
}





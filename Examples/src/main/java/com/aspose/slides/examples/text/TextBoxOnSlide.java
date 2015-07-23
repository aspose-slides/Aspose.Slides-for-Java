/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class TextBoxOnSlide
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(TextBoxOnSlide.class);

        //Instantiate Presentation class that represents PPTX
        Presentation pres = new Presentation();

        //Access first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle type
        IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

        //Add TextFrame to the Rectangle
        ashp.addTextFrame(" ");

        //Accessing the text frame
        ITextFrame txtFrame = ashp.getTextFrame();

        //Create the Paragraph object for text frame
        IParagraph para = txtFrame.getParagraphs().get_Item(0);

        //Create Portion object for paragraph
        IPortion portion = para.getPortions().get_Item(0);

        //Set Text
        portion.setText("Aspose TextBox");

        //Save the PPTX to Disk
        pres.save(dataDir+ "Textbox.pptx", SaveFormat.Pptx);
    }
}





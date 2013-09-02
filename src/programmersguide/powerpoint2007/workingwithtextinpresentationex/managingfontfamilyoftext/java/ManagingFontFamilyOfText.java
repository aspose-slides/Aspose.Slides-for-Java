/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithtextinpresentationex.managingfontfamilyoftext.java;

import com.aspose.slides.*;

import java.awt.*;

public class ManagingFontFamilyOfText
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithtextinpresentationex/managingfontfamilyoftext/data/";

        //Instantiate PresentationEx Class
        PresentationEx pres = new PresentationEx();

        //Get first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle type
        int idx = sld.getShapes().addAutoShape(ShapeTypeEx.Rectangle, 50, 50, 200, 50);

        //Access the added AutoShape
        AutoShapeEx ashp = (AutoShapeEx)sld.getShapes().get_Item(idx);

        //Remove any fill style associated with the AutoShape
        ashp.getFillFormat().setFillType(FillTypeEx.NoFill);

        //Access the TextFrame associated with the AutoShape
        TextFrameEx tf = ashp.getTextFrame();
        tf.setText("Aspose TextBox");

        //Access the Portion associated with the TextFrame
        PortionEx port = tf.getParagraphs().get_Item(0).getPortions().get_Item(0);

        //Set the Font for the Portion
        port.getPortionFormat().setLatinFont(new FontDataEx("Times New Roman"));

        //Set Bold property of the Font
        port.getPortionFormat().setFontBold(NullableBool.True);

        //Set  Italic property of the Font
        port.getPortionFormat().setFontItalic(NullableBool.True);

        //Set Underline property of the Font
        port.getPortionFormat().setFontUnderline(TextUnderlineTypeEx.Single);

        //Set the Height of the Font
        port.getPortionFormat().setFontHeight((byte) 25);

        //Set the color of the Font
        port.getPortionFormat().getFillFormat().setFillType(FillTypeEx.Solid);
        port.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.blue);

        //Write the presentation to disk
        pres.write(dataDir + "output.pptx");

        // Status
        System.out.println("Process completed successfully.");

    }
}





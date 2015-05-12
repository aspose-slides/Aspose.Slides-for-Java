/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.textinpresentation.fontfamily.java;

import com.aspose.slides.*;

import java.awt.*;

public class FontFamily
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/textinpresentation/fontfamily/data/";

        //Instantiate a Presentation object that represents a PPTX file
        Presentation pres = new Presentation();

        //Get first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle type
        IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 50, 200, 50);

        //Remove any fill style associated with the AutoShape
        ashp.getFillFormat().setFillType(FillType.NoFill);

        //Access the TextFrame associated with the AutoShape
        ITextFrame tf = ashp.getTextFrame();
        tf.setText("Aspose TextBox");

        //Access the Portion associated with the TextFrame
        IPortion port = tf.getParagraphs().get_Item(0).getPortions().get_Item(0);

        //Set the Font for the Portion
        port.getPortionFormat().setLatinFont(new FontData("Times New Roman"));

        //Set Bold property of the Font
        port.getPortionFormat().setFontBold(NullableBool.True);

        //Set Italic property of the Font
        port.getPortionFormat().setFontItalic(NullableBool.True);

        //Set Underline property of the Font
        port.getPortionFormat().setFontUnderline(TextUnderlineType.Single);

        //Set the Height of the Font
        port.getPortionFormat().setFontHeight(25);

        //Set the color of the Font
        port.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
        port.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);

        //Save the presentation to disk
        pres.save(dataDir+ "pptxFont.pptx", SaveFormat.Pptx);
    }
}





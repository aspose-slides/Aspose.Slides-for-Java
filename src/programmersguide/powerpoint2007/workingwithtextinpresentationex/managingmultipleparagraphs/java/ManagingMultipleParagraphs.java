/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithtextinpresentationex.managingmultipleparagraphs.java;

import com.aspose.slides.*;

import java.awt.*;

public class ManagingMultipleParagraphs
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithtextinpresentationex/managingmultipleparagraphs/data/";

        //Instantiate a PresentationEx class that represents a PPTX file
        PresentationEx pres = new PresentationEx();

        //Accessing first slide
        SlideEx slide = pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle type
        int idx = slide.getShapes().addAutoShape(ShapeTypeEx.Rectangle, 50, 150, 300, 150);
        AutoShapeEx ashp = (AutoShapeEx)slide.getShapes().get_Item(idx);

        //Access TextFrame of the AutoShape
        TextFrameEx tf = ashp.getTextFrame();

        //Create Paragraphs and Portions with different text formats
        ParagraphEx para0 = tf.getParagraphs().get_Item(0);
        PortionEx port01 = new PortionEx();
        PortionEx port02 = new PortionEx();
        para0.getPortions().add(port01);
        para0.getPortions().add(port02);

        ParagraphEx para1 = new ParagraphEx();
        tf.getParagraphs().add(para1);
        PortionEx port10 = new PortionEx();
        PortionEx port11 = new PortionEx();
        PortionEx port12 = new PortionEx();
        para1.getPortions().add(port10);
        para1.getPortions().add(port11);
        para1.getPortions().add(port12);

        ParagraphEx para2 = new ParagraphEx();
        tf.getParagraphs().add(para2);
        PortionEx port20 = new PortionEx();
        PortionEx port21 = new PortionEx();
        PortionEx port22 = new PortionEx();
        para2.getPortions().add(port20);
        para2.getPortions().add(port21);
        para2.getPortions().add(port22);

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
            {
                tf.getParagraphs().get_Item(i).getPortions().get_Item(j).setText("Portion0" + Integer.toString(j));
                if (j == 0)
                {
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j) .getPortionFormat().getFillFormat().setFillType(FillTypeEx.Solid);
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j) .getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.red);
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j) .getPortionFormat().setFontBold(NullableBool.True);
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j) .getPortionFormat().setFontHeight((byte)15);
                }
                else if (j == 1)
                {
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j) .getPortionFormat().getFillFormat().setFillType(FillTypeEx.Solid);
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j) .getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.blue);
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j) .getPortionFormat().setFontBold(NullableBool.True);
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j) .getPortionFormat().setFontHeight((byte)18);
                }
            }

        //Write PPTX to Disk
        pres.write(dataDir + "output.pptx");

        // Status
        System.out.println("Process completed successfully.");

    }
}





package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class MultipleParagraphs
{
    public static void main(String[] args)
    {
        //ExStart:MultipleParagraphs
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate a Presentation class that represents a PPTX file
        Presentation pres = new Presentation();
        try
        {
            // Accessing first slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Add an AutoShape of Rectangle type
            IAutoShape ashp = slide.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 300, 150);

            // Access TextFrame of the AutoShape
            ITextFrame tf = ashp.getTextFrame();

            // Create Paragraphs and Portions with different text formats
            IParagraph para0 = tf.getParagraphs().get_Item(0);
            IPortion port01 = new Portion();
            IPortion port02 = new Portion();
            para0.getPortions().add(port01);
            para0.getPortions().add(port02);

            IParagraph para1 = new Paragraph();
            tf.getParagraphs().add(para1);
            IPortion port10 = new Portion();
            IPortion port11 = new Portion();
            IPortion port12 = new Portion();
            para1.getPortions().add(port10);
            para1.getPortions().add(port11);
            para1.getPortions().add(port12);

            IParagraph para2 = new Paragraph();
            tf.getParagraphs().add(para2);
            IPortion port20 = new Portion();
            IPortion port21 = new Portion();
            IPortion port22 = new Portion();
            para2.getPortions().add(port20);
            para2.getPortions().add(port21);
            para2.getPortions().add(port22);

            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                {
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j).setText("Portion0" + j);
                    if (j == 0)
                    {
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().setFillType(FillType.Solid);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.RED);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontBold(NullableBool.True);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontHeight(15);
                    } else if (j == 1)
                    {
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().setFillType(FillType.Solid);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontItalic(NullableBool.True);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontHeight(18);
                    }
                }

            //Write PPTX to Disk
            pres.save(dataDir + "multiParaPort_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:MultipleParagraphs
    }
}

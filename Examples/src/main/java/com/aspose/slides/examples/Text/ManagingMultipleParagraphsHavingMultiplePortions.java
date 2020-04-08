package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.NullableBool;
import com.aspose.slides.Paragraph;
import com.aspose.slides.Portion;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class ManagingMultipleParagraphsHavingMultiplePortions {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ManagingMultipleParagraphsHavingMultiplePortions.class);

        //ExStart:ManagingMultipleParagraphsHavingMultiplePortions
        // Instantiate a Presentation class that represents a PPTX file
        Presentation pres = new Presentation();
        try {
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
                for (int j = 0; j < 3; j++) {
                    tf.getParagraphs().get_Item(i).getPortions().get_Item(j).setText("Portion0" + j);
                    if (j == 0) {
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().setFillType(FillType.Solid);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.RED);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontBold(NullableBool.True);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontHeight(15);
                    } else if (j == 1) {
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().setFillType(FillType.Solid);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontItalic(NullableBool.True);
                        tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontHeight(18);
                    }
                }

            // SavePPTX to Disk
            pres.save(dataDir + "multiParaPort.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ManagingMultipleParagraphsHavingMultiplePortions
    }

}

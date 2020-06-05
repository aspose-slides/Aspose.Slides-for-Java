package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class MutilevelBullets
{
    public static void main(String[] args)
    {
        //ExStart:MutilevelBullets
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Creating a presenation instance
        Presentation pres = new Presentation();
        try
        {

            // Accessing the first slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Adding and accessing Autoshape
            IAutoShape aShp = slide.getShapes().addAutoShape(ShapeType.Rectangle, 200, 200, 400, 200);

            // Accessing the text frame of created autoshape
            ITextFrame text = aShp.addTextFrame("");

            //clearing default paragraph
            text.getParagraphs().clear();

            //Adding first paragraph
            IParagraph para1 = new Paragraph();
            para1.setText("Content");
            para1.getParagraphFormat().getBullet().setType(BulletType.Symbol);
            para1.getParagraphFormat().getBullet().setChar((char) 8226);
            para1.getParagraphFormat().getDefaultPortionFormat().getFillFormat().setFillType(FillType.Solid);
            para1.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
            //Setting bullet level
            para1.getParagraphFormat().setDepth((short) 0);

            //Adding second paragraph
            IParagraph para2 = new Paragraph();
            para2.setText("Second Level");
            para2.getParagraphFormat().getBullet().setType(BulletType.Symbol);
            para2.getParagraphFormat().getBullet().setChar('-');
            para2.getParagraphFormat().getDefaultPortionFormat().getFillFormat().setFillType(FillType.Solid);
            para2.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
            //Setting bullet level
            para2.getParagraphFormat().setDepth((short) 1);

            //Adding third paragraph
            IParagraph para3 = new Paragraph();
            para3.setText("Third Level");
            para3.getParagraphFormat().getBullet().setType(BulletType.Symbol);
            para3.getParagraphFormat().getBullet().setChar((char) 8226);
            para3.getParagraphFormat().getDefaultPortionFormat().getFillFormat().setFillType(FillType.Solid);
            para3.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
            //Setting bullet level
            para3.getParagraphFormat().setDepth((short) 2);

            //Adding fourth paragraph
            IParagraph para4 = new Paragraph();
            para4.setText("Fourth Level");
            para4.getParagraphFormat().getBullet().setType(BulletType.Symbol);
            para4.getParagraphFormat().getBullet().setChar('-');
            para4.getParagraphFormat().getDefaultPortionFormat().getFillFormat().setFillType(FillType.Solid);
            para4.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
            //Setting bullet level
            para4.getParagraphFormat().setDepth((short) 3);

            //Adding paragraphs to collection
            text.getParagraphs().add(para1);
            text.getParagraphs().add(para2);
            text.getParagraphs().add(para3);
            text.getParagraphs().add(para4);

            //Writing the presentation as a PPTX file
            pres.save(dataDir + "MultilevelBullet.pptx", SaveFormat.Pptx);


        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:MutilevelBullets
    }
}

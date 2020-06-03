package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SetCustomBulletsNumber
{
    public static void main(String[] args)
    {

        //ExStart:SetCustomBulletsNumber

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        Presentation presentation = new Presentation();
        try
        {
            IAutoShape shape = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 200, 200, 400, 200);

            // Accessing the text frame of created autoshape
            ITextFrame textFrame = shape.getTextFrame();

            // Removing the default exisiting paragraph
            textFrame.getParagraphs().removeAt(0);

            // First list
            Paragraph paragraph1 = new Paragraph();
            paragraph1.setText("bullet 2");
            paragraph1.getParagraphFormat().setDepth((short) 4);
            paragraph1.getParagraphFormat().getBullet().setNumberedBulletStartWith((short) 2);
            paragraph1.getParagraphFormat().getBullet().setType(BulletType.Numbered);
            textFrame.getParagraphs().add(paragraph1);

            Paragraph paragraph2 = new Paragraph();
            paragraph2.setText("bullet 3");
            paragraph2.getParagraphFormat().setDepth((short) 4);
            paragraph2.getParagraphFormat().getBullet().setNumberedBulletStartWith((short) 3);
            paragraph2.getParagraphFormat().getBullet().setType(BulletType.Numbered);
            textFrame.getParagraphs().add(paragraph2);


            Paragraph paragraph5 = new Paragraph();
            paragraph5.setText("bullet 7");
            paragraph5.getParagraphFormat().setDepth((short) 4);
            paragraph5.getParagraphFormat().getBullet().setNumberedBulletStartWith((short) 7);
            paragraph5.getParagraphFormat().getBullet().setType(BulletType.Numbered);
            textFrame.getParagraphs().add(paragraph5);

            presentation.save(dataDir + "SetCustomBulletsNumber-slides.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }


        //ExEnd:SetCustomBulletsNumber

    }
}


package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class ParagraphBullets
{
    public static void main(String[] args)
    {
        //ExStart:ParagraphBullets
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
            ITextFrame txtFrm = aShp.getTextFrame();

            // Removing the default exisiting paragraph
            txtFrm.getParagraphs().removeAt(0);

            // Creating a paragraph
            Paragraph para = new Paragraph();

            // Setting paragraph bullet style and symbol
            para.getParagraphFormat().getBullet().setType(BulletType.Symbol);
            para.getParagraphFormat().getBullet().setChar((char) 8226);

            // Setting paragraph text
            para.setText("Welcome to Aspose.Slides");

            // Setting bullet indent
            para.getParagraphFormat().setIndent(25);

            // Setting bullet color
            para.getParagraphFormat().getBullet().getColor().setColorType(ColorType.RGB);
            para.getParagraphFormat().getBullet().getColor().setColor(Color.BLACK);
            para.getParagraphFormat().getBullet().setBulletHardColor(NullableBool.True); // set IsBulletHardColor to true to use own bullet color

            // Setting Bullet Height
            para.getParagraphFormat().getBullet().setHeight(100);

            // Adding Paragraph to text frame
            txtFrm.getParagraphs().add(para);

            // Creating second paragraph
            Paragraph para2 = new Paragraph();

            // Setting paragraph bullet type and style
            para2.getParagraphFormat().getBullet().setType(BulletType.Numbered);
            para2.getParagraphFormat().getBullet().setNumberedBulletStyle(NumberedBulletStyle.BulletCircleNumWDBlackPlain);

            // Adding paragraph text
            para2.setText("This is numbered bullet");

            // Setting bullet indent
            para2.getParagraphFormat().setIndent(25);

            para2.getParagraphFormat().getBullet().getColor().setColorType(ColorType.RGB);
            para2.getParagraphFormat().getBullet().getColor().setColor(Color.BLACK);
            para2.getParagraphFormat().getBullet().setBulletHardColor(NullableBool.True); // set IsBulletHardColor to true to use own bullet color

            // Setting Bullet Height
            para2.getParagraphFormat().getBullet().setHeight(100);

            // Adding Paragraph to text frame
            txtFrm.getParagraphs().add(para2);


            //Writing the presentation as a PPTX file
            pres.save(dataDir + "Bullet_out.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ParagraphBullets
    }
}

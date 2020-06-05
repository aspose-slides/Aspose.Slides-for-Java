package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;





public class ManageParagraphPictureBulletsInPPT
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:ManageParagraphPictureBulletsInPPT
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        Presentation presentation = new Presentation();

        // Accessing the first slide
        ISlide slide = presentation.getSlides().get_Item(0);

        // Instantiate the image for bullets
        BufferedImage image = ImageIO.read(new File(dataDir + "bullets.png"));
        IPPImage ippxImage = presentation.getImages().addImage(image);

        // Adding and accessing Autoshape
        IAutoShape autoShape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 200, 200, 400, 200);

        // Accessing the text frame of created autoshape
        ITextFrame textFrame = autoShape.getTextFrame();

        // Removing the default exisiting paragraph
        textFrame.getParagraphs().removeAt(0);

        // Creating new paragraph
        Paragraph paragraph = new Paragraph();
        paragraph.setText("Welcome to Aspose.Slides");

        // Setting paragraph bullet style and image
        paragraph.getParagraphFormat().getBullet().setType(BulletType.Picture);
        paragraph.getParagraphFormat().getBullet().getPicture().setImage(ippxImage);

        // Setting Bullet Height
        paragraph.getParagraphFormat().getBullet().setHeight(100);

        // Adding Paragraph to text frame
        textFrame.getParagraphs().add(paragraph);

        // Writing the presentation as a PPTX file
        presentation.save(dataDir + "ParagraphPictureBulletsPPTX_out.pptx", SaveFormat.Pptx);
        // Writing the presentation as a PPT file
        presentation.save(dataDir + "ParagraphPictureBulletsPPT_out.ppt", SaveFormat.Ppt);
        //ExEnd:ManageParagraphPictureBulletsInPPT
    }
}

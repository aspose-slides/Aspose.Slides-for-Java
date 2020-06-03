package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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

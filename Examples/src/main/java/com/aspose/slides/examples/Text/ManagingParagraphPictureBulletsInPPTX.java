package com.aspose.slides.examples.Text;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.BulletType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IPPImage;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Paragraph;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class ManagingParagraphPictureBulletsInPPTX {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ManagingParagraphPictureBulletsInPPTX.class);

        //ExStart:ManagingParagraphPictureBulletsInPPTX
        // Create an instance of Presentation class
        Presentation pres = new Presentation();
        try {
            // Accessing the first slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Instantiate the image for bullets
            BufferedImage img = ImageIO.read(new File(dataDir + "asp1.jpg"));

            IPPImage imgx = pres.getImages().addImage(img);

            // Adding and accessing Autoshape
            IAutoShape aShp = slide.getShapes().addAutoShape(ShapeType.Rectangle, 200, 200, 400, 200);

            // Accessing the text frame of created autoshape
            ITextFrame txtFrm = aShp.getTextFrame();
            // Removing the default exisiting paragraph
            txtFrm.getParagraphs().removeAt(0);

            // Creating new paragraph
            Paragraph para = new Paragraph();
            para.setText("Welcome to Aspose.Slides");

            // Setting paragraph bullet style and image
            para.getParagraphFormat().getBullet().setType(BulletType.Picture);
            para.getParagraphFormat().getBullet().getPicture().setImage(imgx);

            // Setting Bullet Height
            para.getParagraphFormat().getBullet().setHeight(100);

            // Adding Paragraph to text frame
            txtFrm.getParagraphs().add(para);

            // Writing the presentation as a PPTX file
            pres.save(dataDir + "Bullet.pptx", SaveFormat.Pptx);
            // Writing the presentation as a PPT file
            pres.save(dataDir + "Bullet.ppt", SaveFormat.Ppt);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ManagingParagraphPictureBulletsInPPTX
    }
}

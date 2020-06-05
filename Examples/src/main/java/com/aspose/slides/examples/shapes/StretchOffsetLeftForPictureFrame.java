package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class StretchOffsetLeftForPictureFrame
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:StretchOffsetLeftForPictureFrame
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Instantiate the ImageEx class
            BufferedImage img = ImageIO.read(new File(dataDir + "aspose-logo.jpg"));
            IPPImage imgEx = pres.getImages().addImage(img);

            // Add an AutoShape of Rectangle type
            IAutoShape aShape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 300, 300);

            // Set shape's fill type
            aShape.getFillFormat().setFillType(FillType.Picture);

            // Set shape's picture fill mode
            aShape.getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Stretch);

            // Set image to fill the shape
            aShape.getFillFormat().getPictureFillFormat().getPicture().setImage(imgEx);

            // Specify image offsets from the corresponding edge of the shape's bounding box
            aShape.getFillFormat().getPictureFillFormat().setStretchOffsetLeft(25);
            aShape.getFillFormat().getPictureFillFormat().setStretchOffsetRight(25);
            aShape.getFillFormat().getPictureFillFormat().setStretchOffsetTop(-20);
            aShape.getFillFormat().getPictureFillFormat().setStretchOffsetBottom(-10);


            //Write the PPTX file to disk
            pres.save(dataDir + "StretchOffsetLeftForPictureFrame_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:StretchOffsetLeftForPictureFrame
    }
}


package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class AddStretchOffsetForImageFill
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:AddStretchOffsetForImageFill
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
            ISlide sld = pres.getSlides().get_Item(0);

            // Instantiate the ImageEx class
            BufferedImage img = ImageIO.read(new File(dataDir + "aspose-logo.jpg"));
            IPPImage imgx = pres.getImages().addImage(img);

            // Add Picture Frame with height and width equivalent of Picture
            sld.getShapes().addPictureFrame(ShapeType.Rectangle, 50, 150, imgx.getWidth(), imgx.getHeight(), imgx);

            //Write the PPTX file to disk
            pres.save(dataDir + "AddStretchOffsetForImageFill_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddStretchOffsetForImageFill
    }
}

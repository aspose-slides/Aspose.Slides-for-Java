package com.aspose.slides.examples.slides.thumbnail;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class ThumbnailWithUserDefinedDimensions
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:ThumbnailWithUserDefinedDimensions
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Thumbnail();

        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "ThumbnailWithUserDefinedDimensions.pptx");
        try
        {

            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // User defined dimension
            int desiredX = 1200;
            int desiredY = 800;

            // Getting scaled value  of X and Y
            float ScaleX = (float) (1.0 / pres.getSlideSize().getSize().getWidth()) * desiredX;
            float ScaleY = (float) (1.0 / pres.getSlideSize().getSize().getHeight()) * desiredY;


            // Create a full scale image
            BufferedImage bmp = sld.getThumbnail(ScaleX, ScaleY);

            // Save the image to disk in JPEG format
            ImageIO.write(bmp, "jpeg", new File(dataDir + "Thumbnail2_out.jpg"));
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ThumbnailWithUserDefinedDimensions
    }
}

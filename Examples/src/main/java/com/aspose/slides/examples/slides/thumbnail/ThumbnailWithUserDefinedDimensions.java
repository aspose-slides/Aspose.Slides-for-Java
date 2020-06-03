package com.aspose.slides.examples.slides.thumbnail;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
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

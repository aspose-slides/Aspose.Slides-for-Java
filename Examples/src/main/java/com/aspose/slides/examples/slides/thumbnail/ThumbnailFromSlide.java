package com.aspose.slides.examples.slides.thumbnail;

import com.aspose.slides.IImage;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;



public class ThumbnailFromSlide
{
    public static void main(String[] args)
    {
        //ExStart:ThumbnailFromSlide
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Thumbnail();
        String outputDir = RunExamples.getOutPath();

        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "ThumbnailFromSlide.pptx");
        try
        {

            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Create a full scale image
            IImage bmp = sld.getImage(1f, 1f);

            // Save the image to disk in JPEG format
            bmp.save(outputDir + "Thumbnail_out.jpg");

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ThumbnailFromSlide
    }
}

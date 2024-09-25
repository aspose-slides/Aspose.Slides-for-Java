package com.aspose.slides.examples.slides.thumbnail;

import com.aspose.slides.IImage;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class ThumbnailFromSlideInNotes
{
    public static void main(String[] args)
    {
        //ExStart:ThumbnailFromSlideInNotes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Thumbnail();
        String outputDir = RunExamples.getOutPath();

        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "ThumbnailFromSlideInNotes.pptx");
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
            IImage img = sld.getImage(ScaleX, ScaleY);
            // Save the image to disk in JPEG format
            img.save(outputDir + "Notes_tnail_out.jpg");
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ThumbnailFromSlideInNotes
    }
}

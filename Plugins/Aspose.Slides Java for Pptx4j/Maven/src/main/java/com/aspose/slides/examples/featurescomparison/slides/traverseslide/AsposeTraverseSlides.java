package com.aspose.slides.examples.featurescomparison.slides.traverseslide;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AsposeTraverseSlides
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeTraverseSlides.class);

        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        //Accessing slides
        for (ISlide slide : pres.getSlides())
        {
            System.out.println(slide.getSlideNumber());			
        }
        System.out.println("Done...");
    }
}
package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class AccessSlides
{
    public static void main(String[] args)
    {
        //ExStart:AccessSlides
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "AccessSlides.pptx");
        try
        {
            // Accessing a slide using its slide index
            ISlide slide = pres.getSlides().get_Item(0);
            System.out.println("Slide Number: " + slide.getSlideNumber());
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AccessSlides
    }
}

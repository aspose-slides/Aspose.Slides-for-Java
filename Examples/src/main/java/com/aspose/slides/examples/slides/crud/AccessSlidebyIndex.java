package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class AccessSlidebyIndex
{
    public static void main(String[] args)
    {
        //ExStart:AccessSlidebyIndex
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");

        // Obtain a slide's reference by its index
        ISlide slide = presentation.getSlides().get_Item(0);
        //ExEnd:AccessSlidebyIndex           
    }
}

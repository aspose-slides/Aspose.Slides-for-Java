package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.IBaseSlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;





public class AccessSlidebyID
{
    public static void main(String[] args)
    {
        //ExStart:AccessSlidebyID
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");

        // Getting Slide ID

        long id = presentation.getSlides().get_Item(0).getSlideId();

        // Accessing Slide by ID
        IBaseSlide slide = presentation.getSlideById(id);
        //ExEnd:AccessSlidebyID
    }
}

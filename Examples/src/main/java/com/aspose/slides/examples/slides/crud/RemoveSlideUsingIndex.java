package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class RemoveSlideUsingIndex
{
    public static void main(String[] args)
    {
        //ExStart:RemoveSlideUsingIndex
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "RemoveSlideUsingIndex.pptx");
        try
        {

            // Removing a slide using its slide index
            pres.getSlides().removeAt(0);

            // Writing the presentation file
            pres.save(dataDir + "modified_out.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RemoveSlideUsingIndex
    }
}

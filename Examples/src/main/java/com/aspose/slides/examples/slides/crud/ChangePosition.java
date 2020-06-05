package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class ChangePosition
{
    public static void main(String[] args)
    {
        //ExStart:ChangePosition
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate Presentation class to load the source presentation file
        Presentation pres = new Presentation(dataDir + "ChangePosition.pptx");
        try
        {
            // Get the slide whose position is to be changed
            ISlide sld = pres.getSlides().get_Item(0);

            // Set the new position for the slide
            sld.setSlideNumber(2);

            // Write the presentation to disk
            pres.save(dataDir + "Aspose_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ChangePosition
    }
}

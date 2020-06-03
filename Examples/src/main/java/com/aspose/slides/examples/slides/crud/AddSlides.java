package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.File;





public class AddSlides
{
    public static void main(String[] args)
    {
        //ExStart:AddSlides
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Presentation class that represents the presentation file
        Presentation pres = new Presentation();
        try
        {
            // Instantiate SlideCollection calss
            ISlideCollection slds = pres.getSlides();

            for (int i = 0; i < pres.getLayoutSlides().size(); i++)
            {
                // Add an empty slide to the Slides collection
                slds.addEmptySlide(pres.getLayoutSlides().get_Item(i));

            }

            // Save the PPTX file to the Disk
            pres.save(dataDir + "EmptySlide_out.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddSlides
    }
}

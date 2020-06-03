package com.aspose.slides.examples.rendering.printing;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SetSlideNumber
{
    public static void main(String[] args)
    {
        //ExStart:SetSlideNumber
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Rendering();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "HelloWorld.pptx");
        try
        {
            // Get the slide number
            int firstSlideNumber = presentation.getFirstSlideNumber();

            // Set the slide number
            presentation.setFirstSlideNumber(10);

            presentation.save(dataDir + "Set_Slide_Number_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetSlideNumber
    }
}



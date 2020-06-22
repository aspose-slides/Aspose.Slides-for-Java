package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class ConvertSpecificSlideToPDF
{
    public static void main(String[] args)
    {
        //ExStart:ConvertSpecificSlideToPDF
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "SelectedSlides.pptx");
        try
        {
            // Setting array of slides positions
            int[] slides = {1, 3};

            // Save the presentation to PDF
            presentation.save(dataDir + "RequiredSelectedSlides_out.pdf", slides, SaveFormat.Pdf);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertSpecificSlideToPDF
    }
}



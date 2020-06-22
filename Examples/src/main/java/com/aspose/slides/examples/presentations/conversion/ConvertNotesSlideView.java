package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class ConvertNotesSlideView
{
    public static void main(String[] args)
    {
        //ExStart:ConvertNotesSlideView
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "Convert_Tiff_Default.pptx");
        try
        {
            // Saving the presentation to TIFF document
            pres.save(dataDir + "Tiff_out.tiff", SaveFormat.Tiff);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertNotesSlideView
    }
}

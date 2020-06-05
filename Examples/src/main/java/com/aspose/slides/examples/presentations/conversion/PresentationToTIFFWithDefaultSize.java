package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class PresentationToTIFFWithDefaultSize
{
    public static void main(String[] args)
    {
        //ExStart:PresentationToTIFFWithDefaultSize
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "DemoFile.pptx");
        try
        {
            // Saving the presentation to TIFF document
            presentation.save(dataDir + "Tiffoutput_out.tiff", SaveFormat.Tiff);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:PresentationToTIFFWithDefaultSize
    }
}


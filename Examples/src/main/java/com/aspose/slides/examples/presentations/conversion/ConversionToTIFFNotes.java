package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class ConversionToTIFFNotes
{
    public static void main(String[] args)
    {
        //ExStart:ConversionToTIFFNotes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "NotesFile.pptx");
        try
        {
            // Saving the presentation to TIFF notes
            presentation.save(dataDir + "Notes_In_Tiff_out.tiff", SaveFormat.Tiff);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConversionToTIFFNotes
    }
}


 
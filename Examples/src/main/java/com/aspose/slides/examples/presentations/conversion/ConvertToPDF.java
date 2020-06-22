package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class ConvertToPDF
{
    public static void main(String[] args)
    {
        //ExStart:ConvertToPDF
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "ConvertToPDF.pptx");
        try
        {
            // Save the presentation to PDF with default options
            presentation.save(dataDir + "output_out.pdf", SaveFormat.Pdf);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertToPDF            
    }
}

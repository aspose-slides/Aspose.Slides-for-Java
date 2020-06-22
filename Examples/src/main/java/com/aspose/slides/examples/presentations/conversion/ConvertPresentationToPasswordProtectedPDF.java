package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class ConvertPresentationToPasswordProtectedPDF
{
    public static void main(String[] args)
    {
        //ExStart:ConvertPresentationToPasswordProtectedPDF
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "DemoFile.pptx");
        try
        {
            // Instantiate the PdfOptions class
            PdfOptions pdfOptions = new PdfOptions();

            // Setting PDF password
            pdfOptions.setPassword("password");

            // Save the presentation to password protected PDF
            presentation.save(dataDir + "PasswordProtectedPDF_out.pdf", SaveFormat.Pdf, pdfOptions);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertPresentationToPasswordProtectedPDF
    }
}



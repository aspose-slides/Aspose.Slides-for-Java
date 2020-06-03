package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class ConvertToPDFWithHiddenSlides
{
    public static void main(String[] args)
    {
        //ExStart:ConvertToPDFWithHiddenSlides
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();
        Presentation presentation = new Presentation(dataDir + "HiddingSlides.pptx");
        try
        {
            // Instantiate the PdfOptions class
            PdfOptions pdfOptions = new PdfOptions();

            // Specify that the generated document should include hidden slides
            pdfOptions.setShowHiddenSlides(true);

            // Save the presentation to PDF with specified options
            presentation.save(dataDir + "PDFWithHiddenSlides_out.pdf", SaveFormat.Pdf, pdfOptions);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertToPDFWithHiddenSlides
    }
}



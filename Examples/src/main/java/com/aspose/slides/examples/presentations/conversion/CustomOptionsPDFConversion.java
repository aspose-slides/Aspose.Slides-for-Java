package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class CustomOptionsPDFConversion
{
    public static void main(String[] args)
    {
        //ExStart:CustomOptionsPDFConversion
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "ConvertToPDF.pptx");
        try
        {
            // Instantiate the PdfOptions class
            PdfOptions pdfOptions = new PdfOptions();

            // Set Jpeg Quality
            pdfOptions.setJpegQuality((byte) 90);

            // Define behavior for metafiles
            pdfOptions.setSaveMetafilesAsPng(true);

            // Set Text Compression level
            pdfOptions.setTextCompression(PdfTextCompression.Flate);

            // Define the PDF standard
            pdfOptions.setCompliance(PdfCompliance.Pdf15);

            NotesCommentsLayoutingOptions options = new NotesCommentsLayoutingOptions();
            options.setNotesPosition(NotesPositions.BottomFull);
            pdfOptions.setSlidesLayoutOptions(options);

            // Save the presentation to PDF with specified options
            pres.save(dataDir + "Custom_Option_Pdf_Conversion_out.pdf", SaveFormat.Pdf, pdfOptions);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CustomOptionsPDFConversion
    }
}

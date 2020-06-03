package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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


            INotesCommentsLayoutingOptions options = pdfOptions.getNotesCommentsLayouting();
            options.setNotesPosition(NotesPositions.BottomFull);

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

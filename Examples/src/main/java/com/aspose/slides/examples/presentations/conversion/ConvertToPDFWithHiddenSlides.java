package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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



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


public class ConvertNotesSlideViewToPDF
{
    public static void main(String[] args)
    {
        //ExStart:ConvertNotesSlideViewToPDF
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "NotesFile.pptx");
        try
        {
            PdfOptions pdfOptions = new PdfOptions();
            INotesCommentsLayoutingOptions options = pdfOptions.getNotesCommentsLayouting();
            options.setNotesPosition(NotesPositions.BottomFull);


            // Saving the presentation to PDF notes
            presentation.save(dataDir + "Pdf_Notes_out.pdf", SaveFormat.Pdf, pdfOptions);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertNotesSlideViewToPDF
    }
}


 
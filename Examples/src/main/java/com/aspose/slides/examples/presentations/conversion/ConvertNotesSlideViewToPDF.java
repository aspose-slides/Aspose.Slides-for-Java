package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


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
            NotesCommentsLayoutingOptions options = new NotesCommentsLayoutingOptions();
            options.setNotesPosition(NotesPositions.BottomFull);
            pdfOptions.setSlidesLayoutOptions(options);

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


 
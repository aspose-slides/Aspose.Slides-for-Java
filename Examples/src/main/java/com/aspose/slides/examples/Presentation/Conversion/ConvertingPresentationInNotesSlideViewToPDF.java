package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.INotesCommentsLayoutingOptions;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationInNotesSlideViewToPDF {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationInNotesSlideViewToPDF.class);

        //ExStart:ConvertingPresentationInNotesSlideViewToPDF
        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "demo.pptx");
        try {
            PdfOptions opts = new PdfOptions();
            INotesCommentsLayoutingOptions options = opts.getNotesCommentsLayouting();
            options.setNotesPosition(NotesPositions.BottomFull);

            //Saving the presentation to PDF notes
            pres.save(dataDir + "TestNotes.pdf", SaveFormat.Pdf, opts);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationInNotesSlideViewToPDF

    }

}
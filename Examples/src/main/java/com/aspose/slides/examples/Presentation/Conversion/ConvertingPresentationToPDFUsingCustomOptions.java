package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.INotesCommentsLayoutingOptions;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.PdfCompliance;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.PdfTextCompression;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToPDFUsingCustomOptions {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToPDFUsingCustomOptions.class);

        //ExStart:ConvertingPresentationToPDFUsingCustomOptions
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "demo.pptx");
        try {
            // Instantiate the PdfOptions class
            PdfOptions opts = new PdfOptions();

            // Set JPEG Quality
            opts.setJpegQuality((byte) 90);

            // Define behavior for Metafiles
            opts.setSaveMetafilesAsPng(true);

            // Set Text Compression level
            opts.setTextCompression(PdfTextCompression.Flate);

            // Define the PDF standard
            opts.setCompliance(PdfCompliance.Pdf15);

            INotesCommentsLayoutingOptions options = opts.getNotesCommentsLayouting();
            options.setNotesPosition(NotesPositions.BottomFull);

            // Save the presentation to PDF with specified options
            pres.save(dataDir + "demo.pdf", SaveFormat.Pdf, opts);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToPDFUsingCustomOptions
    }

}

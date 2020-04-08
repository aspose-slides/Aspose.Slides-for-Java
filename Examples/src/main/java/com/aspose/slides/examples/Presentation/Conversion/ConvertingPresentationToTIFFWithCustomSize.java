package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.INotesCommentsLayoutingOptions;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TiffCompressionTypes;
import com.aspose.slides.TiffOptions;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToTIFFWithCustomSize {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToTIFFWithCustomSize.class);

        //ExStart:ConvertingPresentationToTIFFWithCustomSize
        // Instantiate a Presentation object that represents a Presentation file
        Presentation pres = new Presentation(dataDir + "demo.pptx");
        try {
            // Instantiate the TiffOptions class
            TiffOptions opts = new TiffOptions();

            // Setting compression type
            // Possible values are:
            // Default - Specifies the default compression scheme (LZW).
            // None - Specifies no compression.
            // CCITT3
            // CCITT4
            // LZW
            // RLE
            opts.setCompressionType(TiffCompressionTypes.Default);

            // Depth – depends on the compression type and cannot be set manually.
            // Resolution unit – is always equal to “2�? (dots per inch)

            // Setting image DPI
            opts.setDpiX(200);
            opts.setDpiY(100);

            // Set Image Size
            opts.setImageSize(new java.awt.Dimension(1728, 1078));

            INotesCommentsLayoutingOptions options = opts.getNotesCommentsLayouting();
            options.setNotesPosition(NotesPositions.BottomFull);

            // Save the presentation to TIFF with specified image size
            pres.save(dataDir + "demo.tiff", SaveFormat.Tiff, opts);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToTIFFWithCustomSize
    }

}

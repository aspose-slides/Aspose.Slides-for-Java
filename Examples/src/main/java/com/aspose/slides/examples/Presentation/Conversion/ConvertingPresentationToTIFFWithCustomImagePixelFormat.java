package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.ImagePixelFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TiffOptions;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToTIFFWithCustomImagePixelFormat {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToTIFFWithCustomImagePixelFormat.class);

        //ExStart:ConvertingPresentationToTIFFWithCustomImagePixelFormat
        // Instantiate a Presentation object that represents a Presentation file
        Presentation pres = new Presentation(dataDir + "demo.pptx");
        try {
            TiffOptions options = new TiffOptions();
            options.setPixelFormat(ImagePixelFormat.Format8bppIndexed);

            /*
             * ImagePixelFormat contains the following values (as could be seen from
             * documentation):
             * Format1bppIndexed; // 1 bits per pixel, indexed.
             * Format4bppIndexed; // 4 bits per pixel, indexed.
             * Format8bppIndexed; // 8 bits per pixel, indexed.
             * Format24bppRgb; // 24 bits per pixel, RGB.
             * Format32bppArgb; // 32 bits per pixel, ARGB.
             */

            // Save the presentation to TIFF with specified image size
            pres.save(dataDir + "demo.tiff", SaveFormat.Tiff, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToTIFFWithCustomImagePixelFormat
    }

}

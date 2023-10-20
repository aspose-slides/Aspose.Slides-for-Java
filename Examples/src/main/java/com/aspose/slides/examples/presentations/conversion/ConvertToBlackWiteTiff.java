package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ConvertToBlackWiteTiff
{
    //ExStart:ConvertToBlackWiteTiff
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Conversion() + "SimpleAnimations.pptx";
        // Path to output document
        String outFilePath = RunExamples.getOutPath() + "BlackWhite_out.tiff";

        Presentation presentation = new Presentation(presentationName);
        try {
            // Instantiate the TiffOptions class
            TiffOptions options = new TiffOptions();
            // Set compressio type
            options.setCompressionType(TiffCompressionTypes.CCITT4);
            // Set convertion mode
            options.setBwConversionMode(BlackWhiteConversionMode.Dithering);

            // Save output file
            presentation.save(outFilePath, new int[] { 2 }, SaveFormat.Tiff, options);
        } finally {
            if (presentation != null) presentation.dispose();
        }
    }
    //ExEnd:ConvertToBlackWiteTiff
}

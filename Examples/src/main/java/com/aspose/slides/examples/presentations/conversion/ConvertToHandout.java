package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class ConvertToHandout
{
    public static void main(String[] args)
    {
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Conversion();

        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "HandoutExample.pdf";

        //ExStart:ConvertToHandout
        Presentation pres = new Presentation(dataDir + "HandoutExample.pptx");
        try {
            // Set convertion options
            PdfOptions options = new PdfOptions();
            options.setShowHiddenSlides(true);

            // Set Handout Layouting
            HandoutLayoutingOptions slidesLayoutOptions = new HandoutLayoutingOptions();
            // Set printing four slides per page in a horizontal sequence
            slidesLayoutOptions.setHandout(HandoutType.Handouts4Horizontal);
            options.setSlidesLayoutOptions(slidesLayoutOptions);

            // Save result
            pres.save(outFilePath, SaveFormat.Pdf, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToHandout
    }
}

package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.CompressionLevel;
import com.aspose.slides.PptxOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class CompressionLevelExample
{
    public static void main(String[] args)
    {
        // The path to output files
        String outFileLevel1 = RunExamples.getOutPath() + "PresentationCompressionLevel1.pptx";
        String outFileLevel9 = RunExamples.getOutPath() + "PresentationCompressionLevel9.pptx";

        //ExStart:CompressionLevelExample
        Presentation pres = new Presentation();
        try {
            PptxOptions pptxOptions = new PptxOptions();
            pptxOptions.setCompressionLevel(CompressionLevel.Level1);
            // Fastest compression with the lowest compression ratio.
            pres.save(outFileLevel1, SaveFormat.Pptx, pptxOptions);

            pptxOptions.setCompressionLevel(CompressionLevel.Level9);
            // Maximum compression. Produces the smallest file size with the slowest processing speed.
            pres.save(outFileLevel9, SaveFormat.Pptx, pptxOptions);
        } finally {
            if (pres != null) pres.dispose();
        }

        //ExEnd:CompressionLevelExample
    }
}

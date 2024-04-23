package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.PptxOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.Zip64Mode;
import com.aspose.slides.examples.RunExamples;

public class SaveInZip64Mode
{
    public static void main(String[] args) {
        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "PresentationZip64.pptx";

        //ExStart:ConvertToPdfUnsupportedFontStyles
        // Create a new presentation
        Presentation pres = new Presentation();
        try {
            PptxOptions pptxOptions = new PptxOptions();
            pptxOptions.setZip64Mode(Zip64Mode.Always);

            // Save the presentation
            pres.save(outFilePath, SaveFormat.Pptx, pptxOptions);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToPdfUnsupportedFontStyles
    }
}

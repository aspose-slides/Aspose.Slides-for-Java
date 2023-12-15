package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

public class ExportInkExample
{
    public static void main(String[] args)
    {
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Conversion();

        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "HideInkDemo.pdf";

        //ExStart:ExportInkExample
        Presentation pres = new Presentation(dataDir + "InkOptions.pptx");
        try {
            PdfOptions options = new PdfOptions();
            // Hide ink objects
            options.getInkOptions().setHideInk(true);
            // Save result
            pres.save(outFilePath, SaveFormat.Pdf, options);

            // Show Ink objects
            options.getInkOptions().setHideInk(false);
            // Set using ROP operation for rendering brush
            options.getInkOptions().setInterpretMaskOpAsOpacity(false);
            // Set path to output file
            outFilePath = RunExamples.getOutPath() + "ROPInkDemo.pdf";
            // Save result
            pres.save(outFilePath, SaveFormat.Pdf, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExportInkExample
    }
}

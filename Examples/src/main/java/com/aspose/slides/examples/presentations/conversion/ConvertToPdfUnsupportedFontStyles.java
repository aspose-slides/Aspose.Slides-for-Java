package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

public class ConvertToPdfUnsupportedFontStyles
{
    public static void main(String[] args)
    {
        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "UnsupportedFontStyles.pdf";

        //ExStart:ConvertToPdfUnsupportedFontStyles
        // Create a new presentation
        Presentation pres = new Presentation();
        try {
            PdfOptions pdfOptions = new PdfOptions();
            pdfOptions.setRasterizeUnsupportedFontStyles(true);

            // Save the presentation to PDF
            pres.save(outFilePath, SaveFormat.Pdf, pdfOptions);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToPdfUnsupportedFontStyles
    }
}

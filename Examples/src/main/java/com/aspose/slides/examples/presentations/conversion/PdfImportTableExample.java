package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.PdfImportOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class PdfImportTableExample
{
    public static void main(String[] args)
    {
        String pdfFileName = RunExamples.getDataDir_Conversion() + "SimpleTableExample.pdf";
        String resultPath = RunExamples.getOutPath() + "SimpleTableExample.pptx";

        //ExStart:PdfImportTableExample
        //Create presentation
        Presentation pres = new Presentation();
        try {
            PdfImportOptions pdfImportOptions = new PdfImportOptions();
            pdfImportOptions.setDetectTables(true);

            // Open PDF document
            FileInputStream stream = new FileInputStream(pdfFileName);

            // Add Slide to presentation besed on PDF data using automatically detection for importing tables
            pres.getSlides().addFromPdf(stream, pdfImportOptions);

            // Save result
            pres.save(resultPath, SaveFormat.Pptx);
        } catch(IOException e) {
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:PdfImportTableExample
    }
}

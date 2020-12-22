package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class PdfImportExample {

    public static void main(String[] args)
    {
        //ExStart:PdfImportExample
        String pdfFileName = RunExamples.getDataDir_Conversion() + "welcome-to-powerpoint.pdf";
        String resultPath = RunExamples.getOutPath() + "fromPdfDocument.pptx";

        Presentation pres = new Presentation();
        try {
            pres.getSlides().addFromPdf(pdfFileName);
            pres.save(resultPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:PdfImportExample
    }
}

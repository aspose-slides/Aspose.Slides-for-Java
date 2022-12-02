package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.PdfCompliance;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

/*
Aspose.Slides supports PDF export to formats 1.6, 1.7
and operations with A2a, A2b, A2u, A3a and A3b compliance levels:
PdfCompliance.PdfA2a
PdfCompliance.PdfA2b
PdfCompliance.PdfA2u
PdfCompliance.PdfA3a
PdfCompliance.PdfA3b

This Java code demonstrates an operation where a PDF is saved based on the PdfA2a compliance level
*/
public class ConvertToPdfCompliance
{
    public static void main(String[] args)
    {
        //ExStart:ConvertToPdfCompliance
        String presentationName = RunExamples.getDataDir_Conversion() + "ConvertToPDF.pptx";
        String outPath = RunExamples.getOutPath() + "ConvertToPDF-Comp.pdf";

        Presentation presentation = new Presentation(presentationName);
        try {
            PdfOptions pdfOptions = new PdfOptions();
            pdfOptions.setCompliance(PdfCompliance.PdfA2a);
            presentation.save(outPath, SaveFormat.Pdf, pdfOptions);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertToPdfCompliance
    }
}

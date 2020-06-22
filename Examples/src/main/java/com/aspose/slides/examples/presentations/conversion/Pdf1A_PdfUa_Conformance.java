package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.PdfCompliance;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class Pdf1A_PdfUa_Conformance
{
    public static void main(String[] args)
    {
        String pptxFile = RunExamples.getDataDir_Conversion() + "tagged-pdf-demo.pptx";
        String outPdf1aFile = RunExamples.getOutPath() + "tagged-pdf-demo_1a.pdf";
        String outPdf1bFile = RunExamples.getOutPath() + "tagged-pdf-demo_1b.pdf";
        String outPdfUaFile = RunExamples.getOutPath() + "tagged-pdf-demo_1ua.pdf";

        Presentation presentation = new Presentation(pptxFile);
        try
        {
            PdfOptions tmp0 = new PdfOptions();
            tmp0.setCompliance(PdfCompliance.PdfA1a);
            presentation.save(outPdf1aFile, SaveFormat.Pdf, tmp0);
            PdfOptions tmp1 = new PdfOptions();
            tmp1.setCompliance(PdfCompliance.PdfA1b);

            presentation.save(outPdf1bFile, SaveFormat.Pdf, tmp1);
            PdfOptions tmp2 = new PdfOptions();
            tmp2.setCompliance(PdfCompliance.PdfUa);

            presentation.save(outPdfUaFile, SaveFormat.Pdf, tmp2);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
    }
}


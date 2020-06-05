package com.aspose.slides.examples.text;

import com.aspose.slides.HtmlOptions;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SaveWithDefaultRegularFont
{

    public static void main(String[] args)
    {
        String dataDir = RunExamples.getDataDir_Text();
        String outPath = RunExamples.getOutPath();

        Presentation pres = new Presentation(dataDir + "SaveOptionsDefaultRegularFont.pptx");
        try
        {
            HtmlOptions htmlOpts = new HtmlOptions();
            htmlOpts.setDefaultRegularFont("Arial Black");
            pres.save(outPath + "Presentation-out-ArialBlack.html", SaveFormat.Html, htmlOpts);
            htmlOpts.setDefaultRegularFont("Lucida Console");
            pres.save(outPath + "Presentation-out-LucidaConsole.html", SaveFormat.Html, htmlOpts);

            PdfOptions pdfOpts = new PdfOptions();
            pdfOpts.setDefaultRegularFont("Arial Black");
            pres.save(outPath + "Presentation-out-ArialBlack.pdf", SaveFormat.Pdf, pdfOpts);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}

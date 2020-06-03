package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;




public class SavingHTMLAndCSSFileWhenExportingIntoHTML
{
    public static void main(String[] args)
    {
        //ExStart:SavingHTMLAndCSSFileWhenExportingIntoHTML
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();
        Presentation pres = new Presentation("pres.pptx");
        try
        {
            CustomHeaderAndFontsController htmlController = new CustomHeaderAndFontsController("styles.css");
            HtmlOptions options = new HtmlOptions();
            options.setHtmlFormatter(HtmlFormatter.createCustomFormatter(htmlController));

            pres.save("pres.html", SaveFormat.Html, options);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
    //ExEnd:SavingHTMLAndCSSFileWhenExportingIntoHTML

}


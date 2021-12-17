package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ConvertingPresentationToHtmlWithEmbedAllFontsHtmlController
{
    public static void main(String[] args)
    {
        String dataDir = RunExamples.getDataDir_Conversion();

        //ExStart:ConvertingPresentationToHtmlWithEmbedAllFontsHtmlController
        Presentation pres = new Presentation(dataDir + "presentation.pptx");
        try
        {
            // exclude default presentation fonts
            String[] fontNameExcludeList = {  };

            LinkAllFontsHtmlController linkcont = new LinkAllFontsHtmlController(fontNameExcludeList, "C:\\Windows\\Fonts\\");

            HtmlOptions htmlOptionsEmbed = new HtmlOptions();
            htmlOptionsEmbed.setHtmlFormatter(HtmlFormatter.createCustomFormatter(linkcont));

            pres.save(RunExamples.getOutPath() + "pres.html", SaveFormat.Html, htmlOptionsEmbed);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToHtmlWithEmbedAllFontsHtmlController
    }
}

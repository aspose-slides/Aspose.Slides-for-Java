package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class ConvertingPresentationToHtmlWithEmbedAllFontsHtmlController
{
    public static void main(String[] args)
    {
        //ExStart:ConvertingPresentationToHtmlWithEmbedAllFontsHtmlController
        String dataDir = RunExamples.getDataDir_Conversion();
        Presentation pres = new Presentation(dataDir + "presentation.pptx");
        try
        {
            // exclude default presentation fonts
            String[] fontNameExcludeList = {"Calibri", "Arial"};


            Paragraph para = new Paragraph();

            EmbedAllFontsHtmlController embedFontsController = new EmbedAllFontsHtmlController(fontNameExcludeList);

            LinkAllFontsHtmlController linkcont = new LinkAllFontsHtmlController(fontNameExcludeList, "C:\\Windows\\Fonts\\");

            HtmlOptions htmlOptionsEmbed = new HtmlOptions();
            htmlOptionsEmbed.setHtmlFormatter(HtmlFormatter.createCustomFormatter(linkcont));

            pres.save("pres.html", SaveFormat.Html, htmlOptionsEmbed);
            //ExEnd:ConvertingPresentationToHtmlWithEmbedAllFontsHtmlController
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}

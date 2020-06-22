package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ConvertingPresentationToHTMLWithPreservingOriginalFonts
{
    public static void main(String[] args)
    {
        //ExStart:ConvertingPresentationToHTMLWithPreservingOriginalFonts
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        Presentation pres = new Presentation("input.pptx");
        try
        {
            // exclude default presentation fonts
            String[] fontNameExcludeList = {"Calibri", "Arial"};

            EmbedAllFontsHtmlController embedFontsController = new EmbedAllFontsHtmlController(fontNameExcludeList);

            HtmlOptions htmlOptionsEmbed = new HtmlOptions();
            htmlOptionsEmbed.setHtmlFormatter(HtmlFormatter.createCustomFormatter(embedFontsController));

            pres.save("input-PFDinDisplayPro-Regular-installed.html", SaveFormat.Html, htmlOptionsEmbed);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToHTMLWithPreservingOriginalFonts
    }
}

package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class EmbedFontsInHtml
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();
        String outPath = RunExamples.getOutPath();

        //ExStart:EmbedFontsInHtml
        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try
        {
            // exclude default presentation fonts
            String[] fontNameExcludeList = { "Arial" };

            EmbedAllFontsHtmlController embedFontsController = new EmbedAllFontsHtmlController(fontNameExcludeList);

            HtmlOptions htmlOptionsEmbed = new HtmlOptions();
            htmlOptionsEmbed.setHtmlFormatter(HtmlFormatter.createCustomFormatter(embedFontsController));

            pres.save(outPath + "pres.html", SaveFormat.Html, htmlOptionsEmbed);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:EmbedFontsInHtml
    }
}


package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class EmbedFontsInHtml
{
    public static void main(String[] args)
    {
        // ExStart:EmbedFontsInHtml
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();
        String outPath = RunExamples.OutPath;

        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try
        {
            // exclude default presentation fonts
            String[] fontNameExcludeList = {"Calibri", "Arial"};

            EmbedAllFontsHtmlController embedFontsController = new EmbedAllFontsHtmlController(fontNameExcludeList);

            HtmlOptions htmlOptionsEmbed = new HtmlOptions();
            htmlOptionsEmbed.setHtmlFormatter(HtmlFormatter.createCustomFormatter(embedFontsController));

            pres.save(outPath + "pres.html", SaveFormat.Html, htmlOptionsEmbed);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        // ExEnd:EmbedFontsInHtml
    }
}


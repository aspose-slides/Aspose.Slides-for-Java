package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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

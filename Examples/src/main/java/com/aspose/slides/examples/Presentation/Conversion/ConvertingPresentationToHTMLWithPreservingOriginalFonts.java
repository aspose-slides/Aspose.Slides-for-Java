package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.EmbedAllFontsHtmlController;
import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.ResponsiveHtmlController;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToHTMLWithPreservingOriginalFonts{

	private static final String dataDir = Utils.getSharedDataDir(ConvertingPresentationToHTMLWithPreservingOriginalFonts.class) + "Conversion/";

	public static void main(String[] args) {
             //ExStart:ConvertingPresentationToHTMLWithPreservingOriginalFonts 
        Presentation pres = new Presentation(dataDir + "presentation.pptx");
        try
        {
            //Exclude default presentation fonts
            String[] fontNameExcludeList = { "Calibri", "Arial" };

            EmbedAllFontsHtmlController embedFontsController = new EmbedAllFontsHtmlController(fontNameExcludeList);

            HtmlOptions htmlOptionsEmbed = new HtmlOptions();
            htmlOptionsEmbed.setHtmlFormatter(HtmlFormatter.createCustomFormatter(embedFontsController));

            pres.save(dataDir+ "input-PFDinDisplayPro-Regular-installed.html", SaveFormat.Html, htmlOptionsEmbed);
        } finally {
         if (pres != null) pres.dispose();
        }
	//ExEnd:ConvertingPresentationToHTMLWithPreservingOriginalFonts
          }
          }

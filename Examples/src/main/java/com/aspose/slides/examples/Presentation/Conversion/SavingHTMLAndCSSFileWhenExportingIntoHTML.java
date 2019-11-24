package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.ResponsiveHtmlController;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SavingHTMLAndCSSFileWhenExportingIntoHTML {
public static void main (String[] args){
	 String dataDir = Utils.getDataDir(SavingHTMLAndCSSFileWhenExportingIntoHTML.class);
              //ExStart:SavingHTMLAndCSSFileWhenExportingIntoHTML
	 Presentation pres = new Presentation(dataDir+"pres.pptx");
       try{
         final CustomHeaderAndFontsController htmlController = new CustomHeaderAndFontsController("styles.css");
         HtmlOptions options = new HtmlOptions(){{
         setHtmlFormatter(HtmlFormatter.createCustomFormatter(htmlController));
        }};
         pres.save(dataDir+"pres.html", SaveFormat.Html, options);
         }  
       finally 
       {
         pres.dispose();
   }}}

               
             //ExEnd:SavingHTMLAndCSSFileWhenExportingIntoHTML

       
   
         
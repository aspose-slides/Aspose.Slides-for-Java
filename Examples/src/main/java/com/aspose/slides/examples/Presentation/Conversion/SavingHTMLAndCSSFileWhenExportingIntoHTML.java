package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.ResponsiveHtmlController;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SavingHTMLAndCSSFileWhenExportingIntoHTML {

	private static final String dataDir = Utils.getSharedDataDir(SavingHTMLAndCSSFileWhenExportingIntoHTML.class) + "Conversion/";
              //ExStart:SavingHTMLAndCSSFileWhenExportingIntoHTML
	    Presentation pres = new Presentation("pres.pptx");
         try{
           final CustomHeaderAndFontsController htmlController = new CustomHeaderAndFontsController("styles.css");
           HtmlOptions options = new HtmlOptions(){{
           setHtmlFormatter(HtmlFormatter.createCustomFormatter(htmlController));
          }
          };
           pres.save("pres.html", SaveFormat.Html, options);
          }   
        finally 
          {
           pres.dispose();
          }
              
              //ExEnd:SavingHTMLAndCSSFileWhenExportingIntoHTML

        }
        }

package com.aspose.slides.examples.featurescomparison.presentations.converttohtml;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeConvertToHTML 
{
    public static void main(String[] args) 
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeConvertToHTML.class);

        //Instantiate Presentation class that represents PPTX file
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        HtmlOptions htmlOpt = new HtmlOptions();
        htmlOpt.setHtmlFormatter(HtmlFormatter.createDocumentFormatter("",false));

        //Saving the presentation to HTML
        pres.save(dataDir + "AsposeHTML.html", SaveFormat.Html, htmlOpt);	
    }
}

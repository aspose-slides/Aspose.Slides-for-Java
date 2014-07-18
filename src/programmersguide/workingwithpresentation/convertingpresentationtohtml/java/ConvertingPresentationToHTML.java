/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithpresentation.convertingpresentationtohtml.java;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class ConvertingPresentationToHTML
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithpresentation/convertingpresentationtohtml/data/";
        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");

        HtmlOptions htmlOpt = new HtmlOptions();
        htmlOpt.setHtmlFormatter(HtmlFormatter.createDocumentFormatter("", false));

        //Saving the presentation to HTML
        pres.save(dataDir+ "demo.html", SaveFormat.Html, htmlOpt);
        System.out.println("Program executed successfully");
        
    }
}





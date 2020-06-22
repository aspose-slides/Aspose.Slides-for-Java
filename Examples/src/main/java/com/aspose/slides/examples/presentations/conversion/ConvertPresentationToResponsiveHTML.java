package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ConvertPresentationToResponsiveHTML
{
    public static void main(String[] args)
    {
        //ExStart:ConvertPresentationToResponsiveHTML
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "Convert_HTML.pptx");
        try
        {
            ResponsiveHtmlController controller = new ResponsiveHtmlController();
            HtmlOptions htmlOptions = new HtmlOptions();
            htmlOptions.setHtmlFormatter(HtmlFormatter.createCustomFormatter(controller));

            // Saving the presentation to HTML
            presentation.save(dataDir + "ConvertPresentationToResponsiveHTML_out.html", SaveFormat.Html, htmlOptions);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertPresentationToResponsiveHTML
    }
}

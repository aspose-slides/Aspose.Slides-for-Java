package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class ExportToHTMLWithResponsiveLayout
{
    public static void main(String[] args)
    {

        //ExStart:ExportToHTMLWithResponsiveLayout
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        Presentation presentation = new Presentation(dataDir + "SomePresentation.pptx");
        HtmlOptions saveOptions = new HtmlOptions();
        saveOptions.setSvgResponsiveLayout(true);
        presentation.save(dataDir + "SomePresentation-out.html", SaveFormat.Html, saveOptions);
        //ExEnd:ExportToHTMLWithResponsiveLayout
    }
}


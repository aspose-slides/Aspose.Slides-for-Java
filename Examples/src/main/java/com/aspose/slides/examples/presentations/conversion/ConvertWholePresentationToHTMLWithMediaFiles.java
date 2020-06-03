package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class ConvertWholePresentationToHTMLWithMediaFiles
{
    public static void main(String[] args)
    {
        //ExStart:ConvertWholePresentationToHTMLWithMediaFiles
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();
        String htmlDocumentFileName = "presentationWithVideo.html";
        Presentation pres = new Presentation("presentationWith.pptx");
        try
        {
            VideoPlayerHtmlController controller = new VideoPlayerHtmlController(
                    "", htmlDocumentFileName, "http://www.example.com/");

            HtmlOptions htmlOptions = new HtmlOptions(controller);
            SVGOptions svgOptions = new SVGOptions(controller);

            htmlOptions.setHtmlFormatter(HtmlFormatter.createCustomFormatter(controller));
            htmlOptions.setSlideImageFormat(SlideImageFormat.svg(svgOptions));

            pres.save(htmlDocumentFileName, SaveFormat.Html, htmlOptions);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
    //ExEnd:ConvertWholePresentationToHTMLWithMediaFiles
}


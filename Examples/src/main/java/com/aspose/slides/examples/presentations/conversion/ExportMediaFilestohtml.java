package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ExportMediaFilestohtml
{
    public static void main(String[] args)
    {
        //ExStart:ExportMediaFilestohtml
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Loading a presentation
        Presentation pres = new Presentation(dataDir + "Media File.pptx");
        try
        {
            String path = dataDir;
            String fileName = "ExportMediaFiles_out.html";
            String baseUri = "http://www.example.com/";

            VideoPlayerHtmlController controller = new VideoPlayerHtmlController(path, fileName, baseUri);

            // Setting HTML options
            HtmlOptions htmlOptions = new HtmlOptions(controller);
            SVGOptions svgOptions = new SVGOptions(controller);

            htmlOptions.setHtmlFormatter(HtmlFormatter.createCustomFormatter(controller));
            htmlOptions.setSlideImageFormat(SlideImageFormat.svg(svgOptions));

            // Saving the file
            pres.save(path + fileName, SaveFormat.Html, htmlOptions);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExportMediaFilestohtml
    }
}


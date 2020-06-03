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


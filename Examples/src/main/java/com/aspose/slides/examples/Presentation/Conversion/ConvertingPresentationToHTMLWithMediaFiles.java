package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SVGOptions;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideImageFormat;
import com.aspose.slides.VideoPlayerHtmlController;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToHTMLWithMediaFiles {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToHTMLWithMediaFiles.class);
        String pptxDocumentFileName = dataDir + "presentationWith.pptx";
        String htmlDocumentFileName = dataDir + "presentationWithVideo.html";

        //ExStart:ConvertingPresentationToHTMLWithMediaFiles
        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(pptxDocumentFileName);
        try {
            VideoPlayerHtmlController controller = new VideoPlayerHtmlController(
                    "", htmlDocumentFileName, "http://www.example.com/");

            HtmlOptions htmlOptions = new HtmlOptions(controller);
            SVGOptions svgOptions = new SVGOptions(controller);

            htmlOptions.setHtmlFormatter(HtmlFormatter.createCustomFormatter(controller));
            htmlOptions.setSlideImageFormat(SlideImageFormat.svg(svgOptions));

            pres.save(htmlDocumentFileName, SaveFormat.Html, htmlOptions);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToHTMLWithMediaFiles
    }

}

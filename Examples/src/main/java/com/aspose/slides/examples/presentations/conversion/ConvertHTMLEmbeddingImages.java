package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Html5Options;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.File;

public class ConvertHTMLEmbeddingImages
{
    public static void main(String[] args)
    {
        //ExStart:ConvertHTMLEmbeddingImages
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Conversion() + "PresentationDemo.pptx";
        // Path to HTML document
        String outFilePath = RunExamples.getOutPath() + "HTMLConvertion" + File.separator;

        Presentation pres = new Presentation(presentationName);
        try {
            Html5Options options = new Html5Options();
            // Force do not save images in HTML5 document
            options.setEmbedImages(false);
            // Set path for external images
            options.setOutputPath(outFilePath);

            // Create directory for output HTML document
            File f = new File(outFilePath);
            if (!f.exists())
                f.mkdir();

            // Save presentation in HTML5 format.
            pres.save(outFilePath + "pres.html", SaveFormat.Html5, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertHTMLEmbeddingImages
    }
}

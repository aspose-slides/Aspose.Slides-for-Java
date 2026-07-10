package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Html5Options;
import com.aspose.slides.PicturesCompression;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
The code example below demonstrates how to configure image compression to convert images to HTML5.
*/
public class Html5PicturesCompressionExample
{
    public static void main(String[] args)
    {
        // Path to source presentation
        String pptxFileName = RunExamples.getDataDir_Conversion() + "PresentationPic.pptx";

        // The path to output files
        String html5OutPath = RunExamples.getOutPath() + "PresentationPic150.html";

        //ExStart:Html5PicturesCompressionExample
        Presentation pres = new Presentation(pptxFileName);
        try {
            // Set image compression level
            Html5Options options = new Html5Options();
            options.setPicturesCompression(PicturesCompression.Dpi150);

            // Save result
            pres.save(html5OutPath, SaveFormat.Html5, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:Html5PicturesCompressionExample
    }
}

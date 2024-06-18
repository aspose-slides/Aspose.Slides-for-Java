package com.aspose.slides.examples.slides.views;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class GradientStyleRendering
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String presentationName = RunExamples.getDataDir_Slides_Views() + "GradientStyleExample.pptx";
        String outPath = RunExamples.getOutPath() + "GradientStyleExample-out.png";

        //ExStart:GradientStyleRendering
        Presentation pres = new Presentation(presentationName);
        try {
            RenderingOptions options = new RenderingOptions();

            // Set rendering the two-color gradient according to its appearance in the PowerPoint user interface.
            options.setGradientStyle(GradientStyle.PowerPointUI);

            // Get the image.
            IImage img = pres.getSlides().get_Item(0).getImage(options, 2f, 2f);

            // Save image.
            img.save(outPath, ImageFormat.Png);
        } finally {
            if (pres != null) pres.dispose();
        }

        //ExEnd:GradientStyleRendering
    }
}

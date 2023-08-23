package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.PptOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.util.UUID;

public class SlideShowMediaControls
{
    public static void main(String[] args)
    {
        // Path to PPTX document
        String outFilePath = RunExamples.getOutPath() + "SlideShowMediaControl.pptx";

        //ExStart:SlideShowMediaControls
        Presentation pres = new Presentation();
        try {
            // Еnable media control display in slideshow mode.
            pres.getSlideShowSettings().setShowMediaControls(true);

            // Save presentation in PPTX format.
            pres.save(outFilePath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SlideShowMediaControls
    }
}

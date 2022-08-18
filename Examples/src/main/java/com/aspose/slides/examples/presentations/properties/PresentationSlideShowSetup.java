package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;

public class PresentationSlideShowSetup
{
    public static void main(String[] args)
    {
        String outPptxPath = RunExamples.getOutPath() + "PresentationSlideShowSetup.pptx";

        //ExStart:PresentationSlideShowSetup
        Presentation pres = new Presentation();
        try {
            // Gets SlideShow settings
            SlideShowSettings slideShow = pres.getSlideShowSettings();

            // Sets "Using Timing" parameter
            slideShow.setUseTimings(false);

            // Sets Pen Color
            IColorFormat penColor = (ColorFormat)slideShow.getPenColor();
            penColor.setColor(Color.GREEN);

            // Adds slides for
            pres.getSlides().addClone(pres.getSlides().get_Item(0));
            pres.getSlides().addClone(pres.getSlides().get_Item(0));
            pres.getSlides().addClone(pres.getSlides().get_Item(0));
            pres.getSlides().addClone(pres.getSlides().get_Item(0));

            // Sets Show Slide parameter
            SlidesRange slidesRange = new SlidesRange();
            slidesRange.setStart(2);
            slidesRange.setEnd(5);
            slideShow.setSlides(slidesRange);

            // Save presentation
            pres.save(outPptxPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:PresentationSlideShowSetup
    }
}

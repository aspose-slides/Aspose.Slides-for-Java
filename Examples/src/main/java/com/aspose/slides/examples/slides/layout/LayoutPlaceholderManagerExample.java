package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;

public class LayoutPlaceholderManagerExample
{
    public static void main(String[] args)
    {
        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "placeholders.pptx";

        //ExStart:LayoutPlaceholderManagerExample
        Presentation pres = new Presentation();
        try {
            // Getting the Blank layout slide.
            ILayoutSlide layout = pres.getLayoutSlides().getByType(SlideLayoutType.Blank);

            // Getting the placeholder manager of the layout slide.
            ILayoutPlaceholderManager placeholderManager = layout.getPlaceholderManager();

            // Adding different placeholders to the Blank layout slide.
            placeholderManager.addContentPlaceholder(10, 10, 300, 200);
            placeholderManager.addVerticalTextPlaceholder(350, 10, 200, 300);
            placeholderManager.addChartPlaceholder(10, 350, 300, 300);
            placeholderManager.addTablePlaceholder(350, 350, 300, 200);

            // Adding the new slide with Blank layout.
            ISlide newSlide = pres.getSlides().addEmptySlide(layout);

            pres.save(outFilePath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:LayoutPlaceholderManagerExample
    }
}

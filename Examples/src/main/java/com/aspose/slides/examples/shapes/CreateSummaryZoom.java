package com.aspose.slides.examples.shapes;/*
 * Copyright (c) 2009-2021 Aspose Pty Ltd. All Rights Reserved.
 */

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;

public class CreateSummaryZoom
{
    public static void main(String[] args)
    {
        // Output file name
        String resultPath = RunExamples.getOutPath() + "SummaryZoomPresentation.pptx";

        Presentation pres = new Presentation();
        try {
            // Create slides array
            for (int slideNumber = 0; slideNumber < 5; slideNumber++)
            {
                //Add new slides to presentation
                ISlide slide = pres.getSlides().addEmptySlide(pres.getSlides().get_Item(0).getLayoutSlide());

                // Create a background for the slide
                slide.getBackground().setType(BackgroundType.OwnBackground);
                slide.getBackground().getFillFormat().setFillType(FillType.Solid);
                slide.getBackground().getFillFormat().getSolidFillColor().setColor(Color.DARK_GRAY);

                // Create a text box for the slide
                IAutoShape autoshape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 200, 500, 200);
                autoshape.getTextFrame().setText(String.format("Slide - %d", slideNumber + 2));
            }

            // Create zoom objects for all slides in the first slide
            for (int slideNumber = 1; slideNumber < pres.getSlides().size(); slideNumber++)
            {
                int x = (slideNumber - 1) * 100;
                int y = (slideNumber - 1) * 100;
                IZoomFrame zoomFrame = pres.getSlides().get_Item(0).getShapes().addZoomFrame(x, y, 150, 120, pres.getSlides().get_Item(slideNumber));

                // Set the ReturnToParent property to return to the first slide
                zoomFrame.setReturnToParent(true);
            }

            // Save the presentation
            pres.save(resultPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
    }
}

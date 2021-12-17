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

        //ExStart:CreateSummaryZoom
        Presentation pres = new Presentation();
        try {
            //Adds a new slide to the presentation
            ISlide slide = pres.getSlides().addEmptySlide(pres.getSlides().get_Item(0).getLayoutSlide());
            slide.getBackground().getFillFormat().setFillType(FillType.Solid);
            slide.getBackground().getFillFormat().getSolidFillColor().setColor(Color.GRAY);
            slide.getBackground().setType(BackgroundType.OwnBackground);

            // Adds a new section to the presentation
            pres.getSections().addSection("Section 1", slide);

            //Adds a new slide to the presentation
            slide = pres.getSlides().addEmptySlide(pres.getSlides().get_Item(0).getLayoutSlide());
            slide.getBackground().getFillFormat().setFillType(FillType.Solid);
            slide.getBackground().getFillFormat().getSolidFillColor().setColor(Color.CYAN);
            slide.getBackground().setType(BackgroundType.OwnBackground);

            // Adds a new section to the presentation
            pres.getSections().addSection("Section 2", slide);

            //Adds a new slide to the presentation
            slide = pres.getSlides().addEmptySlide(pres.getSlides().get_Item(0).getLayoutSlide());
            slide.getBackground().getFillFormat().setFillType(FillType.Solid);
            slide.getBackground().getFillFormat().getSolidFillColor().setColor(Color.MAGENTA);
            slide.getBackground().setType(BackgroundType.OwnBackground);

            // Adds a new section to the presentation
            pres.getSections().addSection("Section 3", slide);

            //Adds a new slide to the presentation
            slide = pres.getSlides().addEmptySlide(pres.getSlides().get_Item(0).getLayoutSlide());
            slide.getBackground().getFillFormat().setFillType(FillType.Solid);
            slide.getBackground().getFillFormat().getSolidFillColor().setColor(Color.GREEN);
            slide.getBackground().setType(BackgroundType.OwnBackground);

            // Adds a new section to the presentation
            pres.getSections().addSection("Section 4", slide);

            // Adds a SummaryZoomFrame object
            ISummaryZoomFrame summaryZoomFrame = pres.getSlides().get_Item(0).getShapes().addSummaryZoomFrame(150, 50, 300, 200);

            // Saves the presentation
            pres.save(resultPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CreateSummaryZoom
    }
}

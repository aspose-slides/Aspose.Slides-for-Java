/*
 * Copyright (c) 2009-2021. Aspose Pty Ltd. All Rights Reserved.
 */

package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;

public class CreateSectionZoom {

    public static void main(String[] args)
    {
        // Output file name
        String resultPath = RunExamples.getOutPath()  + "SectionZoomPresentation.pptx";
        
        //ExStart:CreateSectionZoom
        Presentation pres = new Presentation();
        try {
            //Adds a new slide to the presentation
            ISlide slide = pres.getSlides().addEmptySlide(pres.getSlides().get_Item(0).getLayoutSlide());
            slide.getBackground().getFillFormat().setFillType(FillType.Solid);
            slide.getBackground().getFillFormat().getSolidFillColor().setColor(Color.YELLOW);
            slide.getBackground().setType(BackgroundType.OwnBackground);

            // Adds a new Section to the presentation
            pres.getSections().addSection("Section 1", slide);

            // Adds a SectionZoomFrame object
            ISectionZoomFrame sectionZoomFrame = pres.getSlides().get_Item(0).getShapes().addSectionZoomFrame(20, 20, 300, 200, pres.getSections().get_Item(1));

            // Saves the presentation
            pres.save(resultPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CreateSectionZoom
    }
    
}

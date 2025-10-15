package com.aspose.slides.examples.shapes;/*
 * Copyright (c) 2009-2021 Aspose Pty Ltd. All Rights Reserved.
 */

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateZoomFrame
{
    public static void main(String[] args)
    {
        // Output file name
        String resultPath = RunExamples.getOutPath() + "ZoomFramePresentation.pptx";

        // Path to source image
        String imagePath = RunExamples.getDataDir_Shapes() + "aspose-logo.jpg";

        Presentation pres = new Presentation();
        try {
            //Add new slides to the presentation
            ISlide slide2 = pres.getSlides().addEmptySlide(pres.getSlides().get_Item(0).getLayoutSlide());
            ISlide slide3 = pres.getSlides().addEmptySlide(pres.getSlides().get_Item(0).getLayoutSlide());

            // Create a background for the second slide
            slide2.getBackground().setType(BackgroundType.OwnBackground);
            slide2.getBackground().getFillFormat().setFillType(FillType.Solid);
            slide2.getBackground().getFillFormat().getSolidFillColor().setColor(Color.CYAN);

            // Create a text box for the second slide
            IAutoShape autoshape = slide2.getShapes().addAutoShape(ShapeType.Rectangle, 100, 200, 500, 200);
            autoshape.getTextFrame().setText("Second Slide");

            // Create a background for the third slide
            slide3.getBackground().setType(BackgroundType.OwnBackground);
            slide3.getBackground().getFillFormat().setFillType(FillType.Solid);
            slide3.getBackground().getFillFormat().getSolidFillColor().setColor(Color.DARK_GRAY);

            // Create a text box for the third slide
            autoshape = slide3.getShapes().addAutoShape(ShapeType.Rectangle, 100, 200, 500, 200);
            autoshape.getTextFrame().setText("Trird Slide");

            // Add ZoomFrame objects with slide preview
            IZoomFrame zoomFrame1 = pres.getSlides().get_Item(0).getShapes().addZoomFrame(20, 20, 250, 200, slide2);

            // Add ZoomFrame objects with custom image
            // Create a new image for the zoom object
            IPPImage image = pres.getImages().addImage(Images.fromFile(imagePath));
            IZoomFrame zoomFrame2 = pres.getSlides().get_Item(0).getShapes().addZoomFrame(200, 250, 250, 100, slide3, image);

            // Set a zoom frame format for the zoomFrame2 object
            zoomFrame2.getLineFormat().setWidth(5);
            zoomFrame2.getLineFormat().getFillFormat().setFillType(FillType.Solid);
            zoomFrame2.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.MAGENTA);
            zoomFrame2.getLineFormat().setDashStyle(LineDashStyle.DashDot);

            // Do not show background for zoomFrame1 object
            zoomFrame1.setShowBackground(false);

            // Save the presentation
            pres.save(resultPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
    }
}

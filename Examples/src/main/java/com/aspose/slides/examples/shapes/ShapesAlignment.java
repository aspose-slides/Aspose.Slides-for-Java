package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

class ShapesAlignment
{
    public static void main(String[] args)
    {
        //Path for output presentation
        String outpptxFile = RunExamples.getOutPath() + "ShapesAlignment_out.pptx";

        Presentation pres = new Presentation();
        try
        {
            ISlide slide = pres.getSlides().get_Item(0);
            // Create some shapes
            slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 100, 100);
            slide.getShapes().addAutoShape(ShapeType.Rectangle, 200, 200, 100, 100);
            slide.getShapes().addAutoShape(ShapeType.Rectangle, 300, 300, 100, 100);
            // Aligning all shapes within IBaseSlide.
            SlideUtil.alignShapes(ShapesAlignmentType.AlignBottom, true, pres.getSlides().get_Item(0));

            slide = pres.getSlides().addEmptySlide(slide.getLayoutSlide());
            // Add group shape
            IGroupShape groupShape = slide.getShapes().addGroupShape();
            // Create some shapes to the group shape
            groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 350, 50, 50, 50);
            groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 450, 150, 50, 50);
            groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 550, 250, 50, 50);
            groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 650, 350, 50, 50);
            // Aligning all shapes within IGroupShape.
            SlideUtil.alignShapes(ShapesAlignmentType.AlignLeft, false, groupShape);

            slide = pres.getSlides().addEmptySlide(slide.getLayoutSlide());
            // Add group shape
            groupShape = slide.getShapes().addGroupShape();
            // Create some shapes to the group shape
            groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 350, 50, 50, 50);
            groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 450, 150, 50, 50);
            groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 550, 250, 50, 50);
            groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 650, 350, 50, 50);
            // Aligning shapes with specified indexes within IGroupShape.
            SlideUtil.alignShapes(ShapesAlignmentType.AlignLeft, false, groupShape, new int[] { 0, 2 });

            // Save presentation
            pres.save(outpptxFile, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}
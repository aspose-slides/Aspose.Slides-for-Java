package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

class ShapesAlignment
{
    public static void main(String[] args)
    {
        //Path for output presentation
        String outpptxFile = RunExamples.OutPath + "ShapesAlignment_out.pptx";

        Presentation pres = new Presentation();
        try
        {
            // Create some shapes
            ISlide slide = pres.getSlides().get_Item(0);
            IAutoShape shape1 = slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 100, 100);
            IAutoShape shape2 = slide.getShapes().addAutoShape(ShapeType.Rectangle, 250, 200, 100, 100);
            IAutoShape shape3 = slide.getShapes().addAutoShape(ShapeType.Rectangle, 400, 300, 100, 100);

            // Here we align two shapes using their indexes
            SlideUtil.alignShapes(ShapesAlignmentType.AlignMiddle, true, slide, new int[]
                    {
                            slide.getShapes().indexOf(shape1),
                            slide.getShapes().indexOf(shape2)
                    });

            // Here we aling all shapes int the slide
            SlideUtil.alignShapes(ShapesAlignmentType.AlignMiddle, true, pres.getSlides().get_Item(0).getShapes());

            pres.save(outpptxFile, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}
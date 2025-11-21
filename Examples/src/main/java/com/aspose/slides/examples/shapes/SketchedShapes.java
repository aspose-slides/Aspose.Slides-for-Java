package com.aspose.slides.examples.shapes;


import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SketchedShapes {

    public static void main(String[] args)
    {
        //ExStart:SketchedShapes
        //Path for output presentation
        String outPptxFile = RunExamples.getOutPath() + "SketchedShapes_out.pptx";
        String outPngFile = RunExamples.getOutPath() + "SketchedShapes_out.png";

        Presentation pres = new Presentation();
        try
        {

            IAutoShape shape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 20, 20, 300, 150);
            shape.getFillFormat().setFillType(FillType.NoFill);

            // Transform shape to sketch of a freehand style
            shape.getLineFormat().getSketchFormat().setSketchType(LineSketchType.Scribble);

            pres.getSlides().get_Item(0).getImage(4/3f, 4/3f).save(outPngFile, ImageFormat.Png);
            pres.save(outPptxFile, SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SketchedShapes
    }

}

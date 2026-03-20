package com.aspose.slides.examples.shapes;

import com.aspose.slides.Presentation;
import com.aspose.slides.Shape;
import com.aspose.slides.examples.RunExamples;

import java.awt.geom.Rectangle2D;

public class ShapeVisualBoundsExample
{
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationPath = RunExamples.getDataDir_Shapes() + "Shapes.pptx";

        //ExStart:ShapeVisualBoundsExample
        Presentation presentation = new Presentation(presentationPath);
        try {
            Shape shape = (Shape)presentation.getSlides().get_Item(0).getShapes().get_Item(0);

            Rectangle2D.Float visualBounds = shape.getVisualBounds();

            System.out.println(
                    "Visual bounds: X=" + visualBounds.getX() + ", Y=" + visualBounds.getY() + ", " +
                            "Width=" + visualBounds.getWidth() + ", Height=" + visualBounds.getHeight());
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ShapeVisualBoundsExample
    }
}

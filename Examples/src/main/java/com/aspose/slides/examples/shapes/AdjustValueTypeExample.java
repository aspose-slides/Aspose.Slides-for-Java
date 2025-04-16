package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;

public class AdjustValueTypeExample
{
    public static void main(String[] args) throws IOException
    {
        //Path for presentation
        String presentationName = RunExamples.getDataDir_Shapes() + "PresetGeometry.pptx";

        // Path to output document
        String outFilePath = RunExamples.getOutPath() + "PresetGeometry_out.pptx";

        //ExStart:AdjustValueTypeExample
        Presentation pres = new Presentation(presentationName);
        try {
            IAutoShape shape = (IAutoShape)pres.getSlides().get_Item(0).getShapes().get_Item(0);

            // Show all adjustment point and its types for a RoundRectangle
            System.out.println("Adjustment types for a Rectangle:");
            for (int i=0 ; i < shape.getAdjustments().size(); i++)
            {
                System.out.println("\tType for point " + i + " is \"" + ShapeAdjustmentType.getName(ShapeAdjustmentType.class, shape.getAdjustments().get_Item(i).getType()) + "\"");
            }
            // Change value of an adjustment point
            if (shape.getAdjustments().get_Item(0).getType() == ShapeAdjustmentType.CornerSize)
            {
                shape.getAdjustments().get_Item(0).setAngleValue(shape.getAdjustments().get_Item(0).getAngleValue() * 2);
            }

            // Show all adjustment point and its types for an RightArrow
            IAutoShape shape1 = (IAutoShape)pres.getSlides().get_Item(0).getShapes().get_Item(1);
            System.out.println("Adjustment types for an Arrow:");
            for (int i = 0; i < shape1.getAdjustments().size(); i++)
            {
                System.out.println("\tType for point " + i + " is \"" + ShapeAdjustmentType.getName(ShapeAdjustmentType.class, shape1.getAdjustments().get_Item(i).getType()) + "\"");
            }
            // Change value of adjustment points
            if (shape1.getAdjustments().get_Item(0).getType() == ShapeAdjustmentType.ArrowTailThickness)
            {
                shape1.getAdjustments().get_Item(0).setAngleValue(shape1.getAdjustments().get_Item(0).getAngleValue() / 3);
            }
            if (shape1.getAdjustments().get_Item(1).getType() == ShapeAdjustmentType.ArrowheadLength)
            {
                shape1.getAdjustments().get_Item(1).setAngleValue(shape1.getAdjustments().get_Item(1).getAngleValue() / 2);
            }

            // Save the presentation
            pres.save(outFilePath, SaveFormat.Pptx);

        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AdjustValueTypeExample
    }
}

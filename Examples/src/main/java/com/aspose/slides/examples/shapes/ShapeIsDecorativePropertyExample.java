package com.aspose.slides.examples.shapes;

import com.aspose.slides.IShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;

public class ShapeIsDecorativePropertyExample
{
    public static void main(String[] args)
    {
        // Path to output document
        String outFilePath = RunExamples.getOutPath() + "DecorativeDemo.pptx";

        //ExStart:ShapeIsDecorativePropertyExample
        Presentation pres = new Presentation();
        try {
            // Create new shape
            IShape shape1 = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 10, 10, 100, 100);

            // Set shape as “decorative” object
            shape1.setDecorative(true);

            // Save result
            pres.save(outFilePath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ShapeIsDecorativePropertyExample
    }
}

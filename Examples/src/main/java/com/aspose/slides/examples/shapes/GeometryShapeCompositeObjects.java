package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class GeometryShapeCompositeObjects {

    public static void main(String[] args) throws Exception
    {
        //ExStart:GeometryShapeCompositeObjects

        // Output file name
        String resultPath = RunExamples.getOutPath() +  "GeometryShapeCompositeObjects.pptx";

        Presentation pres = new Presentation();
        try
        {
            // Create new shape
            GeometryShape shape = (GeometryShape)pres.getSlides().get_Item(0).
                    getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 200, 100);

            // Create first geometry path
            GeometryPath geometryPath0 = new GeometryPath();
            geometryPath0.moveTo(0, 0);
            geometryPath0.lineTo(shape.getWidth(), 0);
            geometryPath0.lineTo(shape.getWidth(), shape.getHeight() / 3);
            geometryPath0.lineTo(0, shape.getHeight() / 3);
            geometryPath0.closeFigure();

            // Create second geometry path
            GeometryPath geometryPath1 = new GeometryPath();
            geometryPath1.moveTo(0, shape.getHeight() / 3 * 2);
            geometryPath1.lineTo(shape.getWidth(), shape.getHeight() / 3 * 2);
            geometryPath1.lineTo(shape.getWidth(), shape.getHeight());
            geometryPath1.lineTo(0, shape.getHeight());
            geometryPath1.closeFigure();

            // Set shape geometry as composition of two geometry path
            shape.setGeometryPaths(new GeometryPath[] { geometryPath0, geometryPath1 });

            // Save the presentation
            pres.save(resultPath, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:GeometryShapeCompositeObjects
    }

}

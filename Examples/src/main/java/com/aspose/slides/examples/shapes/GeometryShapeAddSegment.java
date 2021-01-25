package com.aspose.slides.examples.shapes;

import com.aspose.slides.GeometryShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;

public class GeometryShapeAddSegment {

    public static void main(String[] args) throws Exception
    {
        //ExStart:GeometryShapeAddSegment

        // Output file name
        String resultPath = RunExamples.getOutPath() + "GeometryShapeAddSegment.pptx";

        Presentation pres = new Presentation();
        try
        {
            // Create new shape
            GeometryShape shape = (GeometryShape)pres.getSlides().get_Item(0).
                    getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 200, 100);
            // Get geometry path of the shape
            IGeometryPath geometryPath = shape.getGeometryPaths()[0];

            // Add two lines to geometry path
            geometryPath.lineTo(100, 50, 1);
            geometryPath.lineTo(100, 50, 4);

            // Assign edited geometry path to the shape
            shape.setGeometryPath(geometryPath);

            // Save the presentation
            pres.save(resultPath, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:GeometryShapeAddSegment
    }

}

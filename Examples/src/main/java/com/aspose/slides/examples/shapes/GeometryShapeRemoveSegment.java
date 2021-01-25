package com.aspose.slides.examples.shapes;

import com.aspose.slides.GeometryShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;

public class GeometryShapeRemoveSegment {

    public static void main(String[] args) throws Exception {
        //ExStart:GeometryShapeAddSegment

        // Output file name
        String resultPath = RunExamples.getOutPath() +  "GeometryShapeRemoveSegment.pptx";

        Presentation pres = new Presentation();
        try
        {
            // Create new shape
            GeometryShape shape = (GeometryShape)pres.getSlides().get_Item(0).
                    getShapes().addAutoShape(ShapeType.Heart, 100, 100, 300, 300);

            // Get geometry path of the shape
            IGeometryPath path = shape.getGeometryPaths()[0];

            // remove segment
            path.removeAt(2);

            // set new geometry path
            shape.setGeometryPath(path);

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

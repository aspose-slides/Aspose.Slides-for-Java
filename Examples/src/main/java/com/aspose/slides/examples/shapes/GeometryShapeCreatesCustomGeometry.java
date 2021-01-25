package com.aspose.slides.examples.shapes;

import com.aspose.slides.GeometryShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class GeometryShapeCreatesCustomGeometry {

    public static void main(String[] args) throws Exception
    {
        //ExStart:GeometryShapeCreatesCustomGeometry

        // Output file name
        String resultPath = RunExamples.getOutPath() +  "GeometryShapeCreatesCustomGeometry.pptx";

        float R = 100, r = 50; // Outer and inner star radius

        // Create star geometry path
        GeometryPath starPath = createStarGeometry(R, r);

        Presentation pres = new Presentation();
        try
        {
            // Create new shape
            GeometryShape shape = (GeometryShape)pres.getSlides().get_Item(0).
                    getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, R * 2, R * 2);

            // Set new geometry path to the shape
            shape.setGeometryPath(starPath);

            // Save the presentation
            pres.save(resultPath, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GeometryShapeCreatesCustomGeometry

    }

    /// <summary>
    /// Creates star geometry path.
    /// </summary>
    /// <param name="outerRadius">Outet radius of a star figure.</param>
    /// <param name="innerRadiusr">inner radius of a star figure.</param>
    /// <returns>Geometry Path</returns>
    private static GeometryPath createStarGeometry(float outerRadius, float innerRadiusr)
    {
        GeometryPath starPath = new GeometryPath();
        List<Point2D.Float> points = new ArrayList<Point2D.Float>();

        int step = 72;

        for (int angle = -90; angle < 270; angle += step)
        {
            double radians = angle * (Math.PI / 180f);
            double x = outerRadius * Math.cos(radians);
            double y = outerRadius * Math.sin(radians);
            points.add(new Point2D.Float((float)x + outerRadius, (float)y + outerRadius));

            radians = Math.PI * (angle + step / 2) / 180.0;
            x = innerRadiusr * Math.cos(radians);
            y = innerRadiusr * Math.sin(radians);
            points.add(new Point2D.Float((float)x + outerRadius, (float)y + outerRadius));
        }

        starPath.moveTo(points.get(0));

        for (int i = 1; i < points.size(); i++)
        {
            starPath.lineTo(points.get(i));
        }

        starPath.closeFigure();

        return starPath;
    }

}

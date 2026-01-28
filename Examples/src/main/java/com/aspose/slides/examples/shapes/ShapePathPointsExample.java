package com.aspose.slides.examples.shapes;

import com.aspose.slides.AutoShape;
import com.aspose.slides.IShapeElement;
import com.aspose.slides.Presentation;
import com.aspose.slides.ShapeElement;
import com.aspose.slides.examples.RunExamples;
import java.awt.geom.Point2D;

public class ShapePathPointsExample 
{
    public static void main(String[] args)
    {
        // The documents directory path.
        String dataDir = RunExamples.getDataDir_Shapes();
        String pptxFileName = dataDir + "PresetGeometry.pptx";
        
        //ExStart:ShapePathPointsExample
        Presentation pres = new Presentation(pptxFileName);
        try {
            AutoShape autoShape = (AutoShape)pres.getSlides().get_Item(0).getShapes().get_Item(0);

            IShapeElement[] elements = autoShape.createShapeElements();

            for(int i = 0; i < elements.length; i++)
            {
                System.out.println("Start element");
                ShapeElement element = (ShapeElement)elements[i];

                byte[] types = element.getPathTypes();
                Point2D.Float[] points = element.getPathPoints();
                for (int j = 0; j < types.length; j++) {
                    switch (types[j] & 0xFF) {
                        case 0:
                            System.out.println("Start point " + points[i]);
                            break;
                        case 1:
                            System.out.println("LineTo point " + points[i]);
                            break;
                        case 3:
                            System.out.println("Bezier spline point " + points[i]);
                            break;
                        case 128:
                            System.out.println("Close subpath point " + points[i]);
                            break;
                        case 129:
                            System.out.println("End point " + points[i]);
                            break;
                    }
                }
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ShapePathPointsExample
    }
}

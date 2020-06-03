package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ConnectorLineAngle
{
    //ExStart:ConnectorLineAngle
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        Presentation pres = new Presentation(dataDir + "ConnectorLineAngle.pptx");
        Slide slide = (Slide) pres.getSlides().get_Item(0);
        Shape shape;
        for (int i = 0; i < slide.getShapes().size(); i++)
        {
            double dir = 0.0;
            shape = (Shape) slide.getShapes().get_Item(i);
            if (shape instanceof AutoShape)
            {
                AutoShape ashp = (AutoShape) shape;
                if (ashp.getShapeType() == ShapeType.Line)
                {
                    dir = getDirection(ashp.getWidth(), ashp.getHeight(), ashp.getFrame().getFlipH() != 0, ashp.getFrame().getFlipV() != 0);
                }
            } else if (shape instanceof Connector)
            {
                Connector ashp = (Connector) shape;
                dir = getDirection(ashp.getWidth(), ashp.getHeight(), ashp.getFrame().getFlipH() != 0, ashp.getFrame().getFlipV() != 0);
            }

            System.out.println(dir);
        }

    }

    public static double getDirection(float w, float h, boolean flipH, boolean flipV)
    {
        float endLineX = w * (flipH ? -1 : 1);
        float endLineY = h * (flipV ? -1 : 1);
        float endYAxisX = 0;
        float endYAxisY = h;
        double angle = (Math.atan2(endYAxisY, endYAxisX) - Math.atan2(endLineY, endLineX));
        if (angle < 0) angle += 2 * Math.PI;
        return angle * 180.0 / Math.PI;
    }
    //ExEnd:ConnectorLineAngle
}


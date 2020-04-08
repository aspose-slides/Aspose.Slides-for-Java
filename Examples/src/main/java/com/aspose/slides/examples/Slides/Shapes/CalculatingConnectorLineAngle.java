package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.AutoShape;
import com.aspose.slides.Connector;
import com.aspose.slides.Presentation;
import com.aspose.slides.Shape;
import com.aspose.slides.ShapeType;
import com.aspose.slides.Slide;
import com.aspose.slides.examples.Utils;

public class CalculatingConnectorLineAngle {

    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CalculatingConnectorLineAngle.class);

        TestLineDirection(dataDir);
    }

    //ExStart:CalculatingConnectorLineAngle
    public static void TestLineDirection(String dataDir) {
        Presentation pres = new Presentation(dataDir + "ConnectorLineAngle.pptx");
        try {
            Slide slide = (Slide) pres.getSlides().get_Item(0);
            Shape shape;
            for (int i = 0; i < slide.getShapes().size(); i++) {
                double dir = 0.0;
                shape = (Shape) slide.getShapes().get_Item(i);
                if (shape instanceof AutoShape) {
                    AutoShape ashp = (AutoShape) shape;
                    if (ashp.getShapeType() == (byte) ShapeType.Line) {
                        dir = getDirection(ashp.getWidth(), ashp.getHeight(), ashp.getFrame().getFlipH() != 0, ashp.getFrame().getFlipV() != 0);
                    }
                } else if (shape instanceof Connector) {
                    Connector ashp = (Connector) shape;
                    dir = getDirection(ashp.getWidth(), ashp.getHeight(), ashp.getFrame().getFlipH() != 0, ashp.getFrame().getFlipV() != 0);
                }
                System.out.println(dir);
            }
        } finally {
            if (pres != null) pres.dispose();
        }
    }

    public static double getDirection(float w, float h, boolean flipH, boolean flipV) {
        float endLineX = w * (flipH ? -1 : 1);
        float endLineY = h * (flipV ? -1 : 1);
        float endYAxisX = 0;
        float endYAxisY = h;
        double angle = (java.lang.Math.atan2(endYAxisY, endYAxisX) - java.lang.Math.atan2(endLineY, endLineX));
        if (angle < 0)
            angle += 2 * Math.PI;
        return angle * 180.0 / Math.PI;
    }
    //ExEnd:CalculatingConnectorLineAngle
}

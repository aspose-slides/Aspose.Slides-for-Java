/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.connectorlineangle.java;

import com.aspose.slides.*;

public class ConnectorLineAngle
{
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/connectorlineangle/data/";

        Presentation pres = new Presentation(dataDir + "LineExample.pptx");
        Slide slide = (Slide) pres.getSlides().get_Item(0);
        Shape shape;
        for (int i = 0; i < slide.getShapes().size(); i++) {
            double dir = 0.0;
            shape = (Shape) slide.getShapes().get_Item(i);
            if (shape instanceof AutoShape) {
                AutoShape ashp = (AutoShape) shape;
                if (ashp.getShapeType() == (byte) ShapeType.Line) {
                //    dir = getDirection(ashp.getWidth(), ashp.getHeight(), ashp.getFrame().getFlipH(), ashp.getFrame().getFlipV());
                }
            } else if (shape instanceof Connector) {
                Connector ashp = (Connector) shape;
                //dir = getDirection(ashp.getWidth(), ashp.getHeight(), ashp.getFrame().getFlipH(), ashp.getFrame().getFlipV());
            }

            System.out.println(dir);
            System.out.println("Program executed successfully");

        }
    }


        public static double getDirection(float w, float h, boolean flipH, boolean flipV)
        {
            float endLineX = w * (flipH ? -1 : 1);
            float endLineY = h * (flipV ? -1 : 1);
            float endYAxisX = 0;
            float endYAxisY = h;
            double angle = (java.lang.Math.atan2(endYAxisY, endYAxisX) - java.lang.Math.atan2(endLineY, endLineX));
            if (angle < 0) angle += 2 * Math.PI;
            return angle * 180.0 / Math.PI;
        }
    }






package com.aspose.slides.examples.Slides.Shapes;

import java.awt.geom.Point2D;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class GettingPositionCoordinatesOfPortion {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GettingPositionCoordinatesOfPortion.class);

        //ExStart:GettingPositionCoordinatesOfPortion
        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "HelloWorld.pptx");
        try {
            // Reshaping the context of presentation
            IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            ITextFrame textFrame = shape.getTextFrame();
            for (IParagraph paragraph : textFrame.getParagraphs()) {
                for (IPortion portion : paragraph.getPortions()) {
                    Point2D.Float point = portion.getCoordinates();
                    System.out.println("X: " + point.x + " Y: " + point.y);
                }
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GettingPositionCoordinatesOfPortion
    }
}

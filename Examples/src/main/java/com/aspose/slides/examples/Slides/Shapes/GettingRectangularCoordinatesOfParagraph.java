package com.aspose.slides.examples.Slides.Shapes;

import java.awt.geom.Rectangle2D;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class GettingRectangularCoordinatesOfParagraph {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GettingRectangularCoordinatesOfParagraph.class);

        //ExStart:GettingRectangularCoordinatesOfParagraph
        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "HelloWorld.pptx");
        try {
            IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            ITextFrame textFrame = shape.getTextFrame();
            // Paragragh bounds in rectangle
            Rectangle2D.Float rect = textFrame.getParagraphs().get_Item(0).getRect();
            System.out.println("X: " + rect.x + " Y: " + rect.y + " Width: " + rect.width + " Height: " + rect.height);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GettingRectangularCoordinatesOfParagraph

    }

}

package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.geom.Point2D;




public class GetPositionCoordinatesofPortion
{
    public static void main(String[] args)
    {
        //ExStart:GetPositionCoordinatesofPortion
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationOpening();
        Presentation presentation = new Presentation(dataDir + "Shapes.pptx");
        try
        {
            IAutoShape shape = (IAutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0);
            ITextFrame textFrame = shape.getTextFrame();

            for (IParagraph paragraph : textFrame.getParagraphs())
            {
                for (IPortion portion : paragraph.getPortions())
                {
                    Point2D.Float point = portion.getCoordinates();
                    System.out.println("Corrdinates X =" + point.getX() + " Corrdinates Y =" + point.getY());
                }
            }
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:GetPositionCoordinatesofPortion
    }
}



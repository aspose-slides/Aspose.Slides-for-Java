package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.awt.geom.Rectangle2D;




public class GetRectangularCoordinatesofParagraph
{
    public static void main(String[] args)
    {
        //ExStart:GetRectangularCoordinatesofParagraph
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationOpening();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "Shapes.pptx");
        try
        {
            IAutoShape shape = (IAutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0);
            ITextFrame textFrame = shape.getTextFrame();
            Rectangle2D.Float rect = (textFrame.getParagraphs().get_Item(0)).getRect();
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:GetRectangularCoordinatesofParagraph
    }
}


 
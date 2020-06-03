package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.awt.geom.Rectangle2D;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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


 
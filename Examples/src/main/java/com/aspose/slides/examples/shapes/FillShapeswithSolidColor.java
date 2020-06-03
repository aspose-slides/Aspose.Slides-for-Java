package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class FillShapeswithSolidColor
{
    public static void main(String[] args)
    {
        //ExStart:FillShapeswithSolidColor
        // The path to the documents directory.                    
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        // Get the first slide
        ISlide slide = presentation.getSlides().get_Item(0);

        // Add autoshape of rectangle type
        IShape shape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 75, 150);

        // Set the fill type to Solid
        shape.getFillFormat().setFillType(FillType.Solid);

        // Set the color of the rectangle
        shape.getFillFormat().getSolidFillColor().setColor(Color.YELLOW);

        //Write the PPTX file to disk
        presentation.save(dataDir + "RectShpSolid_out.pptx", SaveFormat.Pptx);
        //ExEnd:FillShapeswithSolidColor
    }
}



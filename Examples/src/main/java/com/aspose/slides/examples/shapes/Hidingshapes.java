package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class Hidingshapes
{
    public static void main(String[] args)
    {
        //ExStart:Hidingshapes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();

        // Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        // Add autoshape of rectangle type
        IShape shp1 = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 40, 150, 50);
        IShape shp2 = sld.getShapes().addAutoShape(ShapeType.Moon, 160, 40, 150, 50);
        String alttext = "User Defined";
        int iCount = sld.getShapes().size();
        for (int i = 0; i < iCount; i++)
        {
            AutoShape ashp = (AutoShape) sld.getShapes().get_Item(i);
            if (ashp.getAlternativeText().equals(alttext))
            {
                ashp.setHidden(true);
            }
        }

        // Save presentation to disk
        pres.save(dataDir + "Hiding_Shapes_out.pptx", SaveFormat.Pptx);
        //ExEnd:Hidingshapes
    }
}




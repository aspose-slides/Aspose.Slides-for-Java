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


public class ConnectShapesUsingConnectors
{
    public static void main(String[] args)
    {
        //ExStart:ConnectShapesUsingConnectors
        // The path to the documents directory.                    
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate Presentation class that represents the PPTX file
        Presentation input = new Presentation();
        try
        {
            // Accessing shapes collection for selected slide
            IShapeCollection shapes = input.getSlides().get_Item(0).getShapes();

            // Add autoshape Ellipse
            IAutoShape ellipse = shapes.addAutoShape(ShapeType.Ellipse, 0, 100, 100, 100);

            // Add autoshape Rectangle
            IAutoShape rectangle = shapes.addAutoShape(ShapeType.Rectangle, 100, 300, 100, 100);

            // Adding connector shape to slide shape collection
            IConnector connector = shapes.addConnector(ShapeType.BentConnector2, 0, 0, 10, 10);

            // Joining Shapes to connectors
            connector.setStartShapeConnectedTo(ellipse);
            connector.setEndShapeConnectedTo(rectangle);

            // Call reroute to set the automatic shortest path between shapes
            connector.reroute();

            // Saving presenation
            input.save(dataDir + "Connecting shapes using connectors_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (input != null) input.dispose();
        }
        //ExEnd:ConnectShapesUsingConnectors
    }
}


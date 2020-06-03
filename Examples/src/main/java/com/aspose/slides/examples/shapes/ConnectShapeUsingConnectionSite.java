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


public class ConnectShapeUsingConnectionSite
{
    public static void main(String[] args)
    {
        //ExStart:ConnectShapeUsingConnectionSite
        // The path to the documents directory.                    
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate Presentation class that represents the PPTX file
        Presentation presentation = new Presentation();
        try
        {
            // Accessing shapes collection for selected slide
            IShapeCollection shapes = presentation.getSlides().get_Item(0).getShapes();

            // Adding connector shape to slide shape collection
            IConnector connector = shapes.addConnector(ShapeType.BentConnector3, 0, 0, 10, 10);

            // Add autoshape Ellipse
            IAutoShape ellipse = shapes.addAutoShape(ShapeType.Ellipse, 0, 100, 100, 100);

            // Add autoshape Rectangle
            IAutoShape rectangle = shapes.addAutoShape(ShapeType.Rectangle, 100, 200, 100, 100);

            // Joining Shapes to connectors
            connector.setStartShapeConnectedTo(ellipse);
            connector.setEndShapeConnectedTo(rectangle);

            // Setting the desired connection site index of Ellipse shape for connector to get connected
            /*UInt32*/
            long wantedIndex = 6;

            // Checking if desired index is less than maximum site index count
            if (ellipse.getConnectionSiteCount() > (wantedIndex & 0xFFFFFFFFL))
            {
                // Setting the desired connection site for connector on Ellipse
                connector.setStartShapeConnectionSiteIndex(wantedIndex);
            }

            // Save presentation
            presentation.save(dataDir + "Connecting_Shape_on_desired_connection_site_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConnectShapeUsingConnectionSite
    }
}


package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IConnector;
import com.aspose.slides.IShapeCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class ConnectingShapesUsingConnectors {

    public static void main(String[] args) {
        
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConnectingShapesUsingConnectors.class);

        //ExStart:ConnectingShapesUsingConnectors
        // Instantiate Presentation class that represents the PPTX file
        Presentation pres = new Presentation();
        try {
            // Accessing shapes collection for selected slide
            IShapeCollection shapes = pres.getSlides().get_Item(0).getShapes();

            // Add Autoshape Ellipse
            IAutoShape ellipse = shapes.addAutoShape(ShapeType.Ellipse, 0, 100, 100, 100);

            // Add Autoshape Rectangle
            IAutoShape rectangle = shapes.addAutoShape(ShapeType.Rectangle, 100, 300, 100, 100);

            // Adding connector shape to slide shape collection
            IConnector connector = shapes.addConnector(ShapeType.BentConnector2, 0, 0, 10, 10);

            // Joining Shapes to connectors
            connector.setStartShapeConnectedTo(ellipse);
            connector.setEndShapeConnectedTo(rectangle);
            connector.reroute();

            // Saving Presentation
            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConnectingShapesUsingConnectors
    }

}

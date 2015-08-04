module Asposeslidesjava
  module ConnectShapes
    def initialize()
        # Connecting shapes using connectors
        connect_shapes()

        # Connecting Shape with connector on desired connection site
        connect_shapes_with_connector()
    end

    def connect_shapes()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Accessing shapes collection for selected slide
        shapes = pres.getSlides().get_Item(0).getShapes()

        shape_type = Rjb::import('com.aspose.slides.ShapeType')

        # Add autoshape Ellipse
        ellipse = shapes.addAutoShape(shape_type.Ellipse, 0, 100, 100, 100)

        # Add autoshape Rectangle
        rectangle = shapes.addAutoShape(shape_type.Rectangle, 100, 300, 100, 100)

        # Adding connector shape to slide shape collection
        connector = shapes.addConnector(shape_type.BentConnector2, 0, 0, 10, 10)

        # Joining Shapes to connectors
        connector.setStartShapeConnectedTo(ellipse)
        connector.setEndShapeConnectedTo(rectangle)
        connector.reroute()

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "ConnectShapes.pptx", save_format.Pptx)

        puts "Connected shapes, please check the output file."
    end

    def connect_shapes_with_connector()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Accessing shapes collection for selected slide
        shapes = pres.getSlides().get_Item(0).getShapes()

        shape_type = Rjb::import('com.aspose.slides.ShapeType')

        # Add autoshape Ellipse
        ellipse = shapes.addAutoShape(shape_type.Ellipse, 0, 100, 100, 100)

        # Add autoshape Rectangle
        rectangle = shapes.addAutoShape(shape_type.Rectangle, 100, 300, 100, 100)

        # Adding connector shape to slide shape collection
        connector = shapes.addConnector(shape_type.BentConnector2, 0, 0, 10, 10)

        # Joining Shapes to connectors
        connector.setStartShapeConnectedTo(ellipse)
        connector.setEndShapeConnectedTo(rectangle)

        # Setting the desired connection site index of Ellipse shape for connector to get connected
        wantedIndex = 6

        # Checking if desired index is less than maximum site index count
        if ellipse.getConnectionSiteCount() > wantedIndex
            # Setting the desired connection site for connector on Ellipse
            connector.setStartShapeConnectionSiteIndex(wantedIndex)
        end

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "ConnectShapesWithConnector.pptx", save_format.Pptx)

        puts "Connected shapes with connector, please check the output file."
    end
  end
end

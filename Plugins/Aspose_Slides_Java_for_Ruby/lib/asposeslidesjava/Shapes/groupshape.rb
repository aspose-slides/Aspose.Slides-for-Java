module Asposeslidesjava
  module GroupShape
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Accessing the shape collection of slides
        slide_shapes = sld.getShapes()

        # Adding a group shape to the slide
        group_shape = slide_shapes.addGroupShape()

        # Adding shapes inside Added group shape
        shape_type = Rjb::import('com.aspose.slides.ShapeType')
        group_shape.getShapes().addAutoShape(shape_type.Rectangle, 300, 100, 100, 100)
        group_shape.getShapes().addAutoShape(shape_type.Rectangle, 500, 100, 100, 100)
        group_shape.getShapes().addAutoShape(shape_type.Rectangle, 300, 300, 100, 100)
        group_shape.getShapes().addAutoShape(shape_type.Rectangle, 500, 300, 100, 100)

        # Adding group shape frame
        group_shape.setFrame(Rjb::import('com.aspose.slides.ShapeFrame').new(100, 300, 500, 40, Rjb::import('com.aspose.slides.NullableBool').False, Rjb::import('com.aspose.slides.NullableBool').False, 0))

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "GroupShape.pptx", save_format.Pptx)

        puts "Added group shape, please check the output file."
    end
  end
end

module Asposeslidesjava
  module HelloWorld
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(__FILE__))) + '/data/'
                
        # Instantiate Presentation
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shape_type = Rjb::import('com.aspose.slides.ShapeType')
        ashp = slide.getShapes().addAutoShape(shape_type.Rectangle, 150, 75, 150, 50)

        # Add ITextFrame to the Rectangle
        ashp.addTextFrame("Hello World")

        # Change the text color to Black (which is White by default)
        fill_type = Rjb::import('com.aspose.slides.FillType')
        color = Rjb::import('java.awt.Color')
        ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType(fill_type.Solid)
        ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Change the line color of the rectangle to White
        ashp.getShapeStyle().getLineColor().setColor(color.WHITE)

        # Remove any fill formatting in the shape
        ashp.getFillFormat().setFillType (fill_type.NoFill)

        # Save the presentation to disk
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "HelloWorld.pptx", save_format.Pptx)

        puts "Document has been saved, please check the output file."
    end
  end
end

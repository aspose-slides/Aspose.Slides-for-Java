module Asposeslidesjava
  module AddEllipseShape
    def initialize()
        # Adding Simple Ellipse in the Slide
        add_simple_ellipse_shape()

        # Adding Formatted Ellipse in the Slide
        add_formatted_ellipse_shape()
    end
    
    def add_simple_ellipse_shape()    
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of ellipse type
        sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Ellipse, 50, 150, 150, 50)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "SimpleEllipseShape.pptx", save_format.Pptx)

        puts "Added simple ellipse shape in the slide, please check the output file."
    end    

    def add_formatted_ellipse_shape()    
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of ellipse type
        shp = sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Ellipse, 50, 150, 150, 50)

        # Apply some formatting to ellipse shape
        shp.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        shp.getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').new(Rjb::import('com.aspose.slides.PresetColor').Chocolate))

        # Apply some formatting to the line of Ellipse
        shp.getLineFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').BLACK)
        shp.getLineFormat().setWidth(5)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "FormattedEllipseShape.pptx", save_format.Pptx)

        puts "Added formatted ellipse shape in the slide, please check the output file."
    end    

    
  end
end

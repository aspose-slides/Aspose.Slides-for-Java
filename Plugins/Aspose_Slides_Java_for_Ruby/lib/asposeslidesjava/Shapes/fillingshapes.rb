module Asposeslidesjava
  module FillingShapes
    def initialize()
        # Filling Shapes with Pattern
        fill_shapes_with_pattern()

        # Filling Shapes with Picture
        fill_shapes_with_picture()

        # Filling Shapes with Solid Color
        fill_shapes_with_solid_color()
    end

    def fill_shapes_with_pattern()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shp = sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 50, 150, 75, 150)

        # Set the fill type to Pattern
        shp.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Pattern)

        # Set the pattern style
        shp.getFillFormat().getPatternFormat().setPatternStyle(Rjb::import('com.aspose.slides.PatternStyle').Trellis)

        # Set the pattern back and fore colors
        shp.getFillFormat().getPatternFormat().getBackColor().setColor(Rjb::import('java.awt.Color').LIGHT_GRAY)
        shp.getFillFormat().getPatternFormat().getForeColor().setColor(Rjb::import('java.awt.Color').YELLOW)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "RectShpPatt.pptx", save_format.Pptx)

        puts "Filled shapes with Pattern, please check the output file."
    end    

    def fill_shapes_with_picture()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shp = sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 50, 150, 75, 150)

        # Set the fill type to Picture
        shp.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Picture)

        # Set the picture fill mode
        shp.getFillFormat().getPictureFillFormat().setPictureFillMode(Rjb::import('com.aspose.slides.PictureFillMode').Tile)

        # Set the picture
        imgx = pres.getImages().addImage(Rjb::import('java.io.FileInputStream').new(Rjb::import('java.io.File').new(data_dir + "night.jpg")))

        shp.getFillFormat().getPictureFillFormat().getPicture().setImage(imgx)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "RectShpPic.pptx", save_format.Pptx)

        puts "Filled shapes with Picture, please check the output file."
    end    

    def fill_shapes_with_solid_color()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shp = sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 50, 150, 75, 150)

        # Set the fill type to Solid
        shp.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)

        # Set the color of the rectangle
        shp.getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').YELLOW)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "RectShpSolid.pptx", save_format.Pptx)

        puts "Filled shapes with Solid Color, please check the output file."
    end
  end
end

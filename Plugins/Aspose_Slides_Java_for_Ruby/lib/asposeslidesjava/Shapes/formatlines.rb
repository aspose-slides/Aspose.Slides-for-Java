module Asposeslidesjava
  module FormatLines
    def initialize()
        # Formatting the Lines of Shapes
        format_lines()

        # Formatting the Join Styles
        format_join_styles()
    end

    def format_lines()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shp = sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 50, 150, 75, 150)

        # Set the fill color of the rectangle shape
        shp.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        shp.getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').WHITE)

        # Apply some formatting on the line of the rectangle
        shp.getLineFormat().setStyle(Rjb::import('com.aspose.slides.LineStyle').ThickThin)
        shp.getLineFormat().setWidth(7)
        shp.getLineFormat().setDashStyle(Rjb::import('com.aspose.slides.LineDashStyle').Dash)

        # set the color of the line of rectangle
        shp.getLineFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').BLUE)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "RectShpLn.pptx", save_format.Pptx)

        puts "Formatted lines, please check the output file."
    end

    def format_join_styles()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add three autoshapes of rectangle type
        shape_type = Rjb::import('com.aspose.slides.ShapeType')
        shp1 = sld.getShapes().addAutoShape(shape_type.Rectangle, 50, 100, 150, 75)
        shp2 = sld.getShapes().addAutoShape(shape_type.Rectangle, 300, 100, 150, 75)
        shp3 = sld.getShapes().addAutoShape(shape_type.Rectangle, 50, 250, 150, 75)

        # Set the fill color of the rectangle shape
        fill_type = Rjb::import('com.aspose.slides.FillType')
        color = Rjb::import('java.awt.Color')
        shp1.getFillFormat().setFillType(fill_type.Solid)
        shp1.getFillFormat().getSolidFillColor().setColor(color.BLACK)
        shp2.getFillFormat().setFillType(fill_type.Solid)
        shp2.getFillFormat().getSolidFillColor().setColor(color.BLACK)
        shp3.getFillFormat().setFillType(fill_type.Solid)
        shp3.getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Set the line width
        shp1.getLineFormat().setWidth(15)
        shp2.getLineFormat().setWidth(15)
        shp3.getLineFormat().setWidth (15)

        # Set the color of the line of rectangle
        shp1.getLineFormat().getFillFormat().setFillType(fill_type.Solid)
        shp1.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        shp2.getLineFormat().getFillFormat().setFillType(fill_type.Solid)
        shp2.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        shp3.getLineFormat().getFillFormat().setFillType(fill_type.Solid)
        shp3.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)

        # Set the Join Style
        line_join_style = Rjb::import('com.aspose.slides.LineJoinStyle')
        shp1.getLineFormat().setJoinStyle(line_join_style.Miter)
        shp2.getLineFormat().setJoinStyle(line_join_style.Bevel)
        shp3.getLineFormat().setJoinStyle(line_join_style.Round)

        # Add text to each rectangle
        shp1.getTextFrame().setText ("This is Miter Join Style")
        shp2.getTextFrame().setText( "This is Bevel Join Style")
        shp3.getTextFrame().setText ("This is Round Join Style")

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "RectShpLnJoin.pptx", save_format.Pptx)

        puts "Formatted join styles, please check the output file."
    end
  end
end

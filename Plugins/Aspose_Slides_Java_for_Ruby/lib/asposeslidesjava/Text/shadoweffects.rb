module Asposeslidesjava
  module ShadowEffects
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type 
        shp = slide.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 150, 75, 150, 50)

        # Add TextFrame to the Rectangle 
        shp.addTextFrame("Aspose TextBox")

        # Disable shape fill in case we want to get shadow of text 
        shp.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').NoFill)

        # Add outer shadow and set all necessary parameters
        shp.getEffectFormat().enableOuterShadowEffect()
        shadow = shp.getEffectFormat().getOuterShadowEffect()
        shadow.setBlurRadius(4.0)
        shadow.setDirection(45)
        shadow.setDistance(3)
        shadow.setRectangleAlign(Rjb::import('com.aspose.slides.RectangleAlignment').TopLeft)
        shadow.getShadowColor().setColor(Rjb::import('java.awt.Color').black)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "OutShadow.pptx", save_format.Pptx)

        puts "Applied shadow effects on text, please check the output file."
    end
  end
end

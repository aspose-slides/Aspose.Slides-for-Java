module Asposeslidesjava
  module RotatingShapes
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shp = sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 50, 150, 75, 150)

        # Rotate the shape to 90 degree
        shp.setRotation(90)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "RectShpRot.pptx", save_format.Pptx)

        puts "Rotated shape, please check the output file."
    end
  end
end

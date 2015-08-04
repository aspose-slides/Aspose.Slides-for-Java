module Asposeslidesjava
  module ShapeThumbnail
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Create a full scale image
        image = pres.getSlides().get_Item(0).getShapes().get_Item(0).getThumbnail()

        # Save the image to disk in PNG format
        Rjb::import('javax.imageio.ImageIO').write(image,"jpeg",Rjb::import('java.io.File').new(data_dir + "ShapeThumbnail.jpg"))

        puts "Generated shape Thumbnail from a slide, please check the output file."
    end
  end
end

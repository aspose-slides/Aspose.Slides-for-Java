module Asposeslidesjava
  module AddSmartArt
    def initialize()
        # Creating a SmartArt Shape
        create_smartart_shape()
    end    
    
    def create_smartart_shape()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add Smart Art Shape
        smart = slide.getShapes().addSmartArt(0, 0, 400, 400, Rjb::import('com.aspose.slides.SmartArtLayoutType').BasicBlockList)

        # Write the presentation as a PPTX file  
        pres.save(data_dir + "SimpleSmartArt.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Created smartart shape, please check the output file."
    end    
  end
end

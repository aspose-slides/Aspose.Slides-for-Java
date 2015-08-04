module Asposeslidesjava
  module ChangingPosition
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Aspose.pptx')

        # Get the slide whose position is to be changed
        slide = pres.getSlides().get_Item(0)

        # Set the new position for the slide
        slide.setSlideNumber(2)

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Aspose_Position.pptx", save_format.Pptx)

        puts "Changes slide position, please check the output file."
    end    
  end
end

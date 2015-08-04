module Asposeslidesjava
  module ReplaceText
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Welcome.pptx')

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Change the text of each placeholder
        shp = sld.getShapes().get_Item(0)
        shp.getTextFrame().setText("This is Placeholder")

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Welcome_PH.pptx", save_format.Pptx)

        puts "Replaced text, please check the output file."
    end
  end
end

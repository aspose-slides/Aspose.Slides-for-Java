module Asposeslidesjava
  module Hyperlinks
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Removing the hyperlinks from presentation
        pres.getHyperlinkQueries().removeAllHyperlinks()

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Hyperlinks.pptx", save_format.Pptx)

        puts "Removed hyperlinks successfully, please check the output file."
    end    
  end
end

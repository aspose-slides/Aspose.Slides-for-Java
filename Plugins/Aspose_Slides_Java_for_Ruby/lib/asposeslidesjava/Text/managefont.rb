module Asposeslidesjava
  module ManageFont
    def initialize()
        # Replacing Fonts Explicitly Inside Presentation
        replace_font()
    end
    
    def replace_font()    
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'input.pptx')

        # Load source font to be replaced
        source_font = Rjb::import('com.aspose.slides.FontData').new("Arial")
            
        # Load the replacing font
        dest_font = Rjb::import('com.aspose.slides.FontData').new("Times New Roman")
            
        # Replace the fonts
        fonts_manager = Rjb::import('com.aspose.slides.FontsManager')
        pres.fonts_manager.replaceFont(source_font, dest_font)

        # Write the presentation as a PPTX file 
        pres.save(data_dir + "ReplaceFont.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Replaced font, please check the output file."
    end
  end
end

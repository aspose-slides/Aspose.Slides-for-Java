module Asposeslidesjava
  module RemoveVBAMacro
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'vbamacro.pptx')

        # Access the Vba module and remove 
        pres.getVbaProject().getModules().remove(pres.getVbaProject().getModules().get_Item(0))

        # Write the presentation as a PPTX file  
        pres.save(data_dir + "RemoveVBAMacro.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Removed VBA Macro, please check the output file."
    end      
  end
end

module Asposeslidesjava
  module AddActiveX
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Adding the Media Player ActiveX control
        pres.getSlides().get_Item(0).getControls().addControl(Rjb::import('com.aspose.slides.ControlType').WindowsMediaPlayer, 100, 100, 400, 400)

        # Access the Media Player ActiveX control and set the video path
        pres.getSlides().get_Item(0).getControls().get_Item(0).getProperties().set_Item("URL" ,  data_dir + "Wildlife.mp4")
        
        # Write the presentation as a PPTX file  
        pres.save(data_dir + "AddActiveX.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Added ActiveX control, please check the output file."
    end    
  end
end

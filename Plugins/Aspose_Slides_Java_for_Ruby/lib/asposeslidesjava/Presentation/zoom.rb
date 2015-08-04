module Asposeslidesjava
  module Zoom
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Setting View Properties of Presentation
        #pres.getViewProperties().getSlideViewProperties().setScale(50) # zoom value in percentages for slide view
        pres.getViewProperties().getNotesViewProperties().setScale(50) # .Scale = 50; //zoom value in percentages for notes view 

        # Save the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Zoom.pptx", save_format.Pptx)

        puts "Set zoom value, please check the output file."
    end
  end
end

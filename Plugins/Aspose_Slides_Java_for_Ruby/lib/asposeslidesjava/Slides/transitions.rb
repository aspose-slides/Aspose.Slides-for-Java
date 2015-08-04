module Asposeslidesjava
  module Transitions
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        transition_type = Rjb::import('com.aspose.slides.TransitionType')

        # Apply circle type transition on slide 1
        pres.getSlides().get_Item(0).getSlideShowTransition().setType(transition_type.Circle)

        # Apply comb type transition on slide 2
        pres.getSlides().get_Item(1).getSlideShowTransition().setType(transition_type.Comb)

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "SimpleTransition.pptx", save_format.Pptx)

        puts "Done with simple transition, please check the output file."
    end    
  end
end

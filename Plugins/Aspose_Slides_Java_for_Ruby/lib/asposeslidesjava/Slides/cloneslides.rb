module Asposeslidesjava
  module CloneSlides
    def initialize()
        # Within the Same Presentation from One Position to the End
        clone_to_end_of_presentation()

        # From One Position to Anther within the Same Presentation
        clone_to_aonther_position()

        # In Another Presentation at the End of the Existing Slides
        clone_to_other_presentation_at_end_of_existing_slide()
    end    

    def clone_to_end_of_presentation()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Aspose.pptx')

        # Clone the desired slide to the end of the collection of slides in the same presentation
        slides = pres.getSlides()
        slides.addClone(pres.getSlides().get_Item(0))

        # Saving the presentation file
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Aspose_Cloned.pptx", save_format.Pptx)

        puts "Slide has been cloned, please check the output file."
    end

    def clone_to_aonther_position()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Aspose.pptx')

        # Clone the desired slide to the end of the collection of slides in the same presentation
        slides = pres.getSlides()
        
        # Clone the desired slide to the specified index in the same presentation
        slides.insertClone(2, pres.getSlides().get_Item(1))

        # Saving the presentation file
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Aspose_Cloned.pptx", save_format.Pptx)

        puts "Slide has been cloned, please check the output file."
    end

    # In Another Presentation at the End of the Existing Slides
    def clone_to_other_presentation_at_end_of_existing_slide()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        src_pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Aspose.pptx')

        # Instantiate Presentation class for destination PPTX (where slide is to be cloned)
        dest_pres = Rjb::import('com.aspose.slides.Presentation').new

        # Clone the desired slide from the source presentation to the end of the collection of slides in destination presentation
        slds = dest_pres.getSlides()

        slds.addClone(src_pres.getSlides().get_Item(0))

        # Saving the presentation file
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        dest_pres.save(data_dir + "Aspose_dest2.pptx", save_format.Pptx)

        puts "Slide has been cloned, please check the output file."
    end
  end
end

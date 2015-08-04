module Asposeslidesjava
  module RemoveSlides
    def initialize()
        # Using Slides Collection to Remove Slide by Index
        remove_slide_by_index()

        # Using Slides Collection to Remove Slide by ID
        remove_slide_by_id()
    end    

    def remove_slide_by_index()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Aspose.pptx')

        # Accessing a slide using its slide index
        slide = pres.getSlides().get_Item(0)

        # Removing a slide using its reference
        pres.getSlides().remove(slide)

        # Saving the presentation file
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Modified.pptx", save_format.Pptx)

        puts "Document has been created, please check the output file."
    end    

    def remove_slide_by_id()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Aspose.pptx')

        # Removing a slide using its slide index
        pres.getSlides().removeAt(1)

        # Saving the presentation file
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Modified.pptx", save_format.Pptx)

        puts "Removed slide by ID, please check the output file."
    end    
  end
end

module Asposeslidesjava
  module AccessSlides
    def initialize()
        # Using Slides Collection to Access Slide by Index
        get_slide_by_index()

        # Using Slides Collection to Access Slide by ID
        get_slide_by_id()
    end    

    def get_slide_by_index()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Aspose.pptx')

        # Accessing a slide using its slide index
        slide = pres.getSlides().get_Item(0)

        puts "Slide: " + slide.to_string
    end    

    def get_slide_by_id()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Aspose.pptx')

        # Getting Slide ID
        id = pres.getSlides().get_Item(0).getSlideId()
            
        # Accessing Slide by ID
        slide = pres.getSlideById(id)

        puts "Slide: " + slide.to_string
    end    
  end
end

module Asposeslidesjava
  module AddSlides
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Instantiate SlideCollection calss
        slides = pres.getSlides()

        i = 0
        while i < pres.getLayoutSlides().size()     
            # Add an empty slide to the Slides collection
            slides.addEmptySlide(pres.getLayoutSlides().get_Item(i))
            i +=1
        end
        
        #Do some work on the newly added slide

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "EmptySlide.pptx", save_format.Pptx)

        puts "Document has been created, please check the output file."
    end    
  end
end

module Asposeslidesjava
  module FindShape
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        shape = find_shape(slide, "Shape1")

        puts "Shape: " + shape.to_string
    end    

    def find_shape(slide, alttext)
        #Iterating through all shapes inside the slide
        i = 0
        while i < slide.getShapes().size()     
            # If the alternative text of the slide matches with the required one then return the shape
            if slide.getShapes().get_Item(i).getAlternativeText() == alttext
                return slide.getShapes().get_Item(i)
            end    
            i +=1
        end
        return nil
    end    
  end
end

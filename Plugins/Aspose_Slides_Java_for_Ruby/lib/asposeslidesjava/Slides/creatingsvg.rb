module Asposeslidesjava
  module CreatingSvg
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Getting last slide index
        last_slide_position = pres.getSlides().size()
        
        #Iterating through every presentation slide and generating SVG image
        i = 0
        while i < last_slide_position
            # Accessing Slides
            slide = pres.getSlides().get_Item(i)

            # Getting and saving the slide SVG image    
            slide.writeAsSvg(Rjb::import('java.io.FileOutputStream').new(data_dir + "SvgImage#{i}.svg"))
                
            i +=1    
        end

        puts "Created SVG images, please check output files."
    end    
  end
end

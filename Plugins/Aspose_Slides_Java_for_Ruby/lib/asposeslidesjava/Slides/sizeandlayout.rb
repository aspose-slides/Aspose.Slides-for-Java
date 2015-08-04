module Asposeslidesjava
  module SizeAndLayout
    def initialize()
        # Setting the Size and Type of a slide 
        set_size_and_type() 

        # Setting the page size when generating PDF 
        set_page_size_for_pdf()
    end  

    def set_size_and_type()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')
        aux_pres = Rjb::import('com.aspose.slides.Presentation').new

        slide = pres.getSlides().get_Item(0)

        # Set the slide size of generated presentations to that of source
        aux_pres.getSlideSize().setType(pres.getSlideSize().getType())
        aux_pres.getSlideSize().setSize(pres.getSlideSize().getSize())

        # Clone required slide        
        aux_pres.getSlides().addClone(pres.getSlides().get_Item(0))
        aux_pres.getSlides().removeAt(0)

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Slide_Size_Type.pptx", save_format.Pptx)

        puts "Set slide size and type, please check the output file."
    end  

    def set_page_size_for_pdf()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Set SlideSize.Type Property 
        pres.getSlideSize().setType(Rjb::import('com.aspose.slides.SlideSizeType').A4Paper)

        # Set different properties of PDF Options 
        opts = Rjb::import('com.aspose.slides.PdfOptions').new
        opts.setSufficientResolution(600)

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Export.pdf", save_format.Pdf, opts)

        puts "Set page size for pdf, please check the output file."
    end  
  end
end

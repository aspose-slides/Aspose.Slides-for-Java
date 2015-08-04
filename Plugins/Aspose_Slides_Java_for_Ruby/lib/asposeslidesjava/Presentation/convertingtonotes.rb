module Asposeslidesjava
  module ConvertingToNotes
    def initialize()
        # Converting Presentation to TIFF Notes
        convert_to_tiff_notes()

        # Converting Presentation to TIFF Notes
        convert_to_pdf_notes()
    end

    def convert_to_tiff_notes()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate a Presentation object that represents a PPTX file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "Aspose.pptx")

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Notes.tiff", save_format.TiffNotes)

        puts "Document has been converted, please check the output file."
    end    

    def convert_to_pdf_notes()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate a Presentation object that represents a PPTX file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "Aspose.pptx")

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Notes.pdf", save_format.Pdf)

        puts "Document has been converted, please check the output file."
    end    
  end
end

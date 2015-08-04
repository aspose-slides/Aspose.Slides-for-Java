module Asposeslidesjava
  module ConvertingToPdf
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate a Presentation object that represents a PPTX file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "Aspose.pptx")

        # Saving the PPTX presentation to Pdf format
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Aspose.pdf", save_format.Pdf)

        puts "Document has been converted, please check the output file."
    end
  end
end

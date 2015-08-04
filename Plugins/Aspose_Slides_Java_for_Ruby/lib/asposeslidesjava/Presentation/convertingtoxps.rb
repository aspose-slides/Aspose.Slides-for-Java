module Asposeslidesjava
  module ConvertingToXps
    def initialize()
        # Converting Presentation to TIFF with default size
        convert_with_default_size()

        # Converting Presentation to TIFF with custom size
        convert_with_custom_size()
    end

    def convert_with_default_size()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate a Presentation object that represents a PPTX file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "Aspose.pptx")

        # Saving the presentation to XPS format
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Aspose.xps", save_format.Xps)

        puts "Document has been converted, please check the output file."
    end    

    def convert_with_custom_size()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate a Presentation object that represents a PPTX file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "Aspose.pptx")

        # Instantiate the TiffOptions class
        opts = Rjb::import('com.aspose.slides.XpsOptions').new

        # Save MetaFiles as PNG
        opts.SaveMetafilesAsPng = true

        # Save the presentation to TIFF with specified image size
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Aspose-Custom-Size.xps", save_format.Xps, opts)

        puts "Document has been converted, please check the output file."
    end   
  end
end

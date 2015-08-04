module Asposeslidesjava
  module ConvertingToHtml
    def initialize()
        # Converting Presentation to HTML format
        convert_to_html()
    end

    def convert_to_html()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate a Presentation object that represents a PPTX file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "Aspose.pptx")

        html_opt = Rjb::import('com.aspose.slides.HtmlOptions').new
        html_formatter = Rjb::import('com.aspose.slides.HtmlFormatter')
        html_opt.setHtmlFormatter(html_formatter.createDocumentFormatter("",false))

        # Saving the presentation to HTML format
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Aspose.html", save_format.Html, html_opt)

        puts "Document has been converted, please check the output file."
    end    
  end
end

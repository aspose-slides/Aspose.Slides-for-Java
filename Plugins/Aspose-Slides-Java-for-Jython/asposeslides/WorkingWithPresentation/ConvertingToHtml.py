from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import HtmlOptions
from com.aspose.slides import SaveFormat
from com.aspose.slides import HtmlFormatter

class ConvertingToHtml:

    def __init__(self):
                
        self.convert_to_html()
        
    def convert_to_html(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/ConvertingToHtml/'
        
        # Instantiate a Presentation object that represents a PPTX file
        pres = Presentation(dataDir + "Aspose.pptx")
        html_opt = HtmlOptions()
        html_formatter = HtmlFormatter
        html_opt.setHtmlFormatter(html_formatter.createDocumentFormatter("",False))

        # Saving the presentation to HTML format
        save_format = SaveFormat
        pres.save(dataDir + "Aspose.html", save_format.Html, html_opt)

        print "Document has been converted, please check the output file."

if __name__ == '__main__':        
    ConvertingToHtml()
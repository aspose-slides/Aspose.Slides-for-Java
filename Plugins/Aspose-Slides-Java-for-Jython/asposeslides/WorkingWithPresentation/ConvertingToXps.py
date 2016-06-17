from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import XpsOptions

class ConvertingToXps:

    def __init__(self):
                        
        # Converting Presentation to TIFF with default size
        self.convert_with_default_size()

        # Converting Presentation to TIFF with custom size
        self.convert_with_custom_size()
    
    def convert_with_default_size(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/ConvertingToXps/'
        
        # Instantiate a Presentation object that represents a PPTX file
        pres = Presentation(dataDir + "Aspose.pptx")

        # Saving the presentation to XPS format
        save_format = SaveFormat
        pres.save(dataDir + "Aspose.xps", save_format.Xps)

        print "Document has been converted, please check the output file."
        
    def convert_with_custom_size(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/ConvertingToXps/'
        
        # Instantiate a Presentation object that represents a PPTX file
        pres = Presentation(dataDir + "Aspose.pptx")

        # Instantiate the TiffOptions class
        opts = XpsOptions

        # Save MetaFiles as PNG
        opts.SaveMetafilesAsPng = True

        # Save the presentation to TIFF with specified image size
        save_format = SaveFormat
        pres.save(dataDir + "Aspose-Custom-Size.xps", save_format.Xps, opts)

        print "Document has been converted, please check the output file."


if __name__ == '__main__':        
    ConvertingToXps()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import TiffOptions
from com.aspose.slides import TiffCompressionTypes
from java.awt import Dimension

class ConvertingToTiff:

    def __init__(self):
        
         # Converting Presentation to TIFF with default size
        self.convert_with_default_size()

        # Converting Presentation to TIFF with custom size
        self.convert_with_custom_size()
        

    def convert_with_default_size(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/ConvertingToTiff/'
        
        # Instantiate a Presentation object that represents a PPTX file
        pres = Presentation(dataDir + "Aspose.pptx")

        # Saving the PPTX presentation to Tiff format
        save_format = SaveFormat
        pres.save(dataDir + "Aspose.tiff", save_format.Tiff)

        print "Document has been converted, please check the output file."
        
    def convert_with_custom_size(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/ConvertingToTiff/'
        
        # Instantiate a Presentation object that represents a PPTX file
        pres = Presentation(dataDir + "Aspose.pptx")

        # Instantiate the TiffOptions class
        opts = TiffOptions

        # Setting compression type
        tiff_compression_types = TiffCompressionTypes
        opts.setCompressionType (tiff_compression_types.Default)

        #Setting image DPI
        opts.setDpiX(200)
        opts.setDpiY(100)

        # Set Image Size
        opts.setImageSize(Dimension(1728, 1078))

        # Save the presentation to TIFF with specified image size
        save_format = SaveFormat
        pres.save(dataDir + "Aspose-Custom-Size.tiff", save_format.Tiff,opts)

        print "Document has been converted, please check the output file."
        
        
    
if __name__ == '__main__':        
    ConvertingToTiff()
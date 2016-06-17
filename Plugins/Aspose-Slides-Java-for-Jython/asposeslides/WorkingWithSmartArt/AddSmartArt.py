from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import SmartArtLayoutType

class AddSmartArt:

    def __init__(self):
              
        self.create_smartart_shape()
        
    def create_smartart_shape(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithSmartArt/AddSmartArt/'    
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add Smart Art Shape
        smartArtLayoutType=SmartArtLayoutType
        smart = slide.getShapes().addSmartArt(0, 0, 400, 400, smartArtLayoutType.BasicBlockList)

        # Write the presentation as a PPTX file
        saveFormat=SaveFormat
        pres.save(dataDir + "SimpleSmartArt.pptx", saveFormat.Pptx)

        print "Created smartart shape, please check the output file."


if __name__ == '__main__':        
    AddSmartArt()
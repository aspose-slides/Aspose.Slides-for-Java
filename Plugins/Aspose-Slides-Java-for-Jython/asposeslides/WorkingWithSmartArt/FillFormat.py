from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import SmartArtLayoutType
from com.aspose.slides import FillType

from java.awt import Color

class FillFormat:

    def __init__(self):
              
        self.create_smartart_shape()
        
    def create_smartart_shape(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithSmartArt/FillFormat/'    
        
        # Create an instance of Presentation class
        pres =Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Adding SmartArt shape and nodes
        smartArtLayoutType=SmartArtLayoutType
        chevron = slide.getShapes().addSmartArt(10, 10, 800, 60, smartArtLayoutType.ClosedChevronProcess)
        node = chevron.getAllNodes().addNode()
        node.getTextFrame().setText("Some text")

        # Setting node fill color
        color=Color
        fillType=FillType
        item = node.getShapes().get_Item(0)
        item.getFillFormat().setFillType(fillType.Solid)
        item.getFillFormat().getSolidFillColor().setColor(color.RED)

        # Write the presentation as a PPTX file
        saveFormat=SaveFormat
        pres.save(dataDir + "FillFormat.pptx", saveFormat.Pptx)

        print "Set fill format for smartart node, please check the output file."


if __name__ == '__main__':        
    FillFormat()
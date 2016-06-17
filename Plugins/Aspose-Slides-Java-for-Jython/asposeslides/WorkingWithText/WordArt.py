from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType
from com.aspose.slides import FillType
from com.aspose.slides import RectangleAlignment
from com.aspose.slides import ColorType
from com.aspose.slides import SchemeColor

from java.awt import Color

class WordArt:

    def __init__(self):
                
        dataDir = Settings.dataDir + 'WorkingWithText/WordArt/'    
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType=ShapeType
        fillType=FillType
        ashp = slide.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 400, 300)
        ashp.getFillFormat().setFillType(fillType.NoFill)

        # Add TextFrame to the Rectangle
        ashp.addTextFrame("Aspose TextBox")
        port = ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0)
        pf = port.getPortionFormat()
        pf.setFontHeight(50)

        # Enable InnerShadowEffect
        ef = pf.getEffectFormat()
        ef.enableInnerShadowEffect()

        # Set all necessary parameters
        ef.getInnerShadowEffect().setBlurRadius(8.0)
        ef.getInnerShadowEffect().setDirection(90)
        ef.getInnerShadowEffect().setDistance(6.0)
        ef.getInnerShadowEffect().getShadowColor().setB(189)

        # Set ColorType as Scheme
        colorType=ColorType
        ef.getInnerShadowEffect().getShadowColor().setColorType(colorType.Scheme)

        # Set Scheme Color
        schemeColor=SchemeColor
        ef.getInnerShadowEffect().getShadowColor().setSchemeColor(schemeColor.Accent1)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "WordArt.pptx", save_format.Pptx)

        print "Done with word art, please check the output file."


if __name__ == '__main__':        
    WordArt()
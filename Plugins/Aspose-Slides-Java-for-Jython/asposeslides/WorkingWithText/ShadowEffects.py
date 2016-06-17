from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType
from com.aspose.slides import FillType
from com.aspose.slides import RectangleAlignment
from java.awt import Color




class ShadowEffects:

    def __init__(self):
                
        dataDir = Settings.dataDir + 'WorkingWithText/ShadowEffects/'    
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType=ShapeType
        shp = slide.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 150, 50)

        # Add TextFrame to the Rectangle
        shp.addTextFrame("Aspose TextBox")

        # Disable shape fill in case we want to get shadow of text
        fillType=FillType
        shp.getFillFormat().setFillType(fillType.NoFill)

        # Add outer shadow and set all necessary parameters
        shp.getEffectFormat().enableOuterShadowEffect()
        shadow = shp.getEffectFormat().getOuterShadowEffect()
        shadow.setBlurRadius(4.0)
        shadow.setDirection(45)
        shadow.setDistance(3)

        rectangleAlignment=RectangleAlignment

        color=Color

        shadow.setRectangleAlign(rectangleAlignment.TopLeft)
        shadow.getShadowColor().setColor(color.black)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "OutShadow.pptx", save_format.Pptx)

        print "Applied shadow effects on text, please check the output file."


if __name__ == '__main__':        
    ShadowEffects()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType


class RotatingShapes:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/RotatingShapes/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = ShapeType
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)

        # Rotate the shape to 90 degree
        shp.setRotation(90)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "RectShpRot.pptx", save_format.Pptx)

        print "Rotated shape, please check the output file."

if __name__ == '__main__':        
    RotatingShapes()
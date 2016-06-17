from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType
from com.aspose.slides import FillType 
from com.aspose.slides import PatternStyle
from com.aspose.slides import PictureFillMode
from java.awt import Color
from java.io import File
from java.io import FileInputStream

class FillingShapes:

    def __init__(self):
        
        # Filling Shapes with Pattern
        self.fill_shapes_with_pattern()

        # Filling Shapes with Picture
        self.fill_shapes_with_picture()

        # Filling Shapes with Solid Color
        self.fill_shapes_with_solid_color()
        
    def fill_shapes_with_pattern(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/FillingShapes/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = ShapeType
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)

        # Set the fill type to Pattern
        fillType = FillType
        shp.getFillFormat().setFillType(fillType.Pattern)

        # Set the pattern style
        patternStyle = PatternStyle
        shp.getFillFormat().getPatternFormat().setPatternStyle(patternStyle.Trellis)

        # Set the pattern back and fore colors
        color = Color
        shp.getFillFormat().getPatternFormat().getBackColor().setColor(color.LIGHT_GRAY)
        shp.getFillFormat().getPatternFormat().getForeColor().setColor(color.YELLOW)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "RectShpPatt.pptx", save_format.Pptx)

        print "Filled shapes with Pattern, please check the output file."
        
    def fill_shapes_with_picture(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/FillingShapes/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = ShapeType
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)

        # Set the fill type to Picture
        fillType = FillType
        shp.getFillFormat().setFillType(fillType.Picture)

        # Set the picture fill mode
        pictureFillMode = PictureFillMode
        shp.getFillFormat().getPictureFillFormat().setPictureFillMode(pictureFillMode.Tile)

        # Set the picture
        imgx = pres.getImages().addImage(FileInputStream(File(dataDir + "night.jpg")))

        shp.getFillFormat().getPictureFillFormat().getPicture().setImage(imgx)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "RectShpPic.pptx", save_format.Pptx)

        print "Filled shapes with Picture, please check the output file."
        
    
    def fill_shapes_with_solid_color(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/FillingShapes/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = ShapeType
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)

        # Set the fill type to Solid
        fillType = FillType
        shp.getFillFormat().setFillType(fillType.Solid)

        # Set the color of the rectangle
        color = Color
        shp.getFillFormat().getSolidFillColor().setColor(color.YELLOW)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "RectShpSolid.pptx", save_format.Pptx)

        print "Filled shapes with Solid Color, please check the output file."

if __name__ == '__main__':        
    FillingShapes()
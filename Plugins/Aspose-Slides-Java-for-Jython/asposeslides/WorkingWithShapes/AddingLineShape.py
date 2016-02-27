from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType
from com.aspose.slides import LineStyle
from com.aspose.slides import LineDashStyle
from com.aspose.slides import LineArrowheadLength
from com.aspose.slides import LineArrowheadStyle
from com.aspose.slides import PresetColor
from com.aspose.slides import FillType
from java.awt import Color

class AddingLineShape:

    def __init__(self):
                
        # Adding Plain Line to Slide
        self.add_plain_line()

        # Adding Arrow Shaped Line to Slide
        self.add_arrow_line()
        
    def add_plain_line(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/AddingLineShape/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add an autoshape of type line
        shapeType = ShapeType
        sld.getShapes().addAutoShape(shapeType.Line, 50, 150, 300, 0)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "LineShape.pptx", save_format.Pptx)

        print "Added plain line to slide, please check the output file." 
        
    def add_arrow_line(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/AddingLineShape/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add an autoshape of type line
        shapeType = ShapeType
        shp = sld.getShapes().addAutoShape(shapeType.Line, 50, 150, 300, 0)

        # Apply some formatting on the line
        lineStyle = LineStyle
        shp.getLineFormat().setStyle(lineStyle.ThickBetweenThin)
        shp.getLineFormat().setWidth(10)

        lineDashStyle = LineDashStyle
        shp.getLineFormat().setDashStyle(lineDashStyle.DashDot)

        lineArrowheadLength = LineArrowheadLength
        lineArrowheadStyle = LineArrowheadStyle
        fillType = FillType
        color = Color
        presetColor = PresetColor

        shp.getLineFormat().setBeginArrowheadLength(lineArrowheadLength.Short)
        shp.getLineFormat().setBeginArrowheadStyle(lineArrowheadStyle.Oval)

        shp.getLineFormat().setEndArrowheadLength(lineArrowheadLength.Long)
        shp.getLineFormat().setEndArrowheadStyle(lineArrowheadStyle.Triangle)

        shp.getLineFormat().getFillFormat().setFillType(fillType.Solid)
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color(presetColor.Maroon))


        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "ArrowShape.pptx", save_format.Pptx)

        print "Added arrow shape line to slide, please check the output file."

if __name__ == '__main__':        
    AddingLineShape()
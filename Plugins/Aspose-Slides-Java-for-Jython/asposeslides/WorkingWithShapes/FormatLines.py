from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType
from com.aspose.slides import FillType
from com.aspose.slides import LineStyle
from com.aspose.slides import LineDashStyle
from com.aspose.slides import LineJoinStyle

from java.awt import Color

class FormatLines:

    def __init__(self):
        
        # Formatting the Lines of Shapes
        self.format_lines()

        # Formatting the Join Styles
        self.format_join_styles()
        
    def format_lines(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/FormatLines/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = ShapeType
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)

        # Set the fill color of the rectangle shape
        fillType = FillType
        color = Color
        shp.getFillFormat().setFillType(fillType.Solid)
        shp.getFillFormat().getSolidFillColor().setColor(color.WHITE)

        # Apply some formatting on the line of the rectangle

        lineStyle = LineStyle
        shp.getLineFormat().setStyle(lineStyle.ThickThin)
        shp.getLineFormat().setWidth(7)

        lineDashStyle = LineDashStyle
        shp.getLineFormat().setDashStyle(lineDashStyle.Dash)

        # set the color of the line of rectangle
        shp.getLineFormat().getFillFormat().setFillType(fillType.Solid)
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "RectShpLn.pptx", save_format.Pptx)

        print "Formatted lines, please check the output file."
        
    def format_join_styles(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/FormatLines/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add three autoshapes of rectangle type
        shape_type = ShapeType
        shp1 = sld.getShapes().addAutoShape(shape_type.Rectangle, 50, 100, 150, 75)
        shp2 = sld.getShapes().addAutoShape(shape_type.Rectangle, 300, 100, 150, 75)
        shp3 = sld.getShapes().addAutoShape(shape_type.Rectangle, 50, 250, 150, 75)

        # Set the fill color of the rectangle shape
        fill_type = FillType
        color = Color
        shp1.getFillFormat().setFillType(fill_type.Solid)
        shp1.getFillFormat().getSolidFillColor().setColor(color.BLACK)
        shp2.getFillFormat().setFillType(fill_type.Solid)
        shp2.getFillFormat().getSolidFillColor().setColor(color.BLACK)
        shp3.getFillFormat().setFillType(fill_type.Solid)
        shp3.getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Set the line width
        shp1.getLineFormat().setWidth(15)
        shp2.getLineFormat().setWidth(15)
        shp3.getLineFormat().setWidth (15)

        # Set the color of the line of rectangle
        shp1.getLineFormat().getFillFormat().setFillType(fill_type.Solid)
        shp1.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        shp2.getLineFormat().getFillFormat().setFillType(fill_type.Solid)
        shp2.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        shp3.getLineFormat().getFillFormat().setFillType(fill_type.Solid)
        shp3.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)

        # Set the Join Style
        line_join_style = LineJoinStyle
        shp1.getLineFormat().setJoinStyle(line_join_style.Miter)
        shp2.getLineFormat().setJoinStyle(line_join_style.Bevel)
        shp3.getLineFormat().setJoinStyle(line_join_style.Round)

        # Add text to each rectangle
        shp1.getTextFrame().setText ("This is Miter Join Style")
        shp2.getTextFrame().setText( "This is Bevel Join Style")
        shp3.getTextFrame().setText ("This is Round Join Style")

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "RectShpLnJoin.pptx", save_format.Pptx)

        print "Formatted join styles, please check the output file."

if __name__ == '__main__':        
    FormatLines()
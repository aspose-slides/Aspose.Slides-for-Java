__author__ = 'fahadadeel'
import jpype

class HelloWorld:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.Color=jpype.JPackage("java.awt.Color")

    def main(self):

         # Instantiate Presentation
        pres = self.Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shape_type = self.ShapeType
        slide_shapes = slide.getShapes()
        ashp = slide_shapes().addAutoShape(shape_type.Rectangle, 150, 75, 150, 50)

        # Add ITextFrame to the Rectangle
        ashp.addTextFrame("Hello World")

        # Change the text color to Black (which is White by default)
        fill_type = self.FillType()
        color = self.Color()
        ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType(fill_type.Solid)
        ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Change the line color of the rectangle to White
        ashp.getShapeStyle().getLineColor().setColor(color.WHITE)

        # Remove any fill formatting in the shape
        ashp.getFillFormat().setFillType(fill_type.NoFill)

        # Save the presentation to disk
        save_format = self.SaveFormat
        pres.save(self.dataDir + "HelloWorld.pptx", save_format.Pptx)

        print "Document has been saved, please check the output file."
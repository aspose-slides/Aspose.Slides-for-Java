__author__ = 'fahadadeel'
import jpype

class AddSmartArt:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.SmartArtLayoutType=jpype.JClass("com.aspose.slides.SmartArtLayoutType")


    def main(self):

        self.create_smartart_shape()


    def create_smartart_shape(self):

        # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add Smart Art Shape
        smartArtLayoutType = self.SmartArtLayoutType
        smart = slide.getShapes().addSmartArt(0, 0, 400, 400, smartArtLayoutType.BasicBlockList)

        # Write the presentation as a PPTX file
        saveFormat = self.SaveFormat
        pres.save(self.dataDir + "SimpleSmartArt.pptx", saveFormat.Pptx)

        print "Created smartart shape, please check the output file."
        
        
class FillFormat:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.SmartArtLayoutType=jpype.JClass("com.aspose.slides.SmartArtLayoutType")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")


    def main(self):

        self.create_smartart_shape()


    def create_smartart_shape(self):

        # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Adding SmartArt shape and nodes
        smartArtLayoutType = self.SmartArtLayoutType
        chevron = slide.getShapes().addSmartArt(10, 10, 800, 60, smartArtLayoutType.ClosedChevronProcess)
        node = chevron.getAllNodes().addNode()
        node.getTextFrame().setText("Some text")

        # Setting node fill color
        color = self.Color
        fillType = self.FillType
        item = node.getShapes().get_Item(0)
        item.getFillFormat().setFillType(fillType.Solid)
        item.getFillFormat().getSolidFillColor().setColor(color.RED)

        # Write the presentation as a PPTX file
        saveFormat = self.SaveFormat
        pres.save(dataDir + "FillFormat.pptx", saveFormat.Pptx)

        print "Set fill format for smartart node, please check the output file."
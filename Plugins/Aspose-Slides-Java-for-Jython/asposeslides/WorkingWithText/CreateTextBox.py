from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType


class CreateTextBox:

    def __init__(self):
        
        # Creating a TextBox on Slide
        self.create_textbox()

        # Creating a TextBox with Hyperlink
        self.create_textbox_with_hyperlink()
        
    def create_textbox(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithText/CreateTextBox/'    
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType=ShapeType
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 150, 50)

        # Add TextFrame to the Rectangle
        shp.addTextFrame(" ")

        # Accessing the text frame
        txt_frame = shp.getTextFrame()

        # Create the Paragraph object for text frame
        para = txt_frame.getParagraphs().get_Item(0)

        # Create Portion object for paragraph
        portion = para.getPortions().get_Item(0)

        # Set Text
        portion.setText("Aspose TextBox")

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "TextBox.pptx", save_format.Pptx)

        print "Created TextBox, please check the output file."
        
    def create_textbox_with_hyperlink(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithText/CreateTextBox/'    
        
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType=ShapeType
        pptxShape = sld.getShapes().addAutoShape(shapeType.Rectangle, 150, 150, 150, 50)

        # Cast the shape to AutoShape
        pptxAutoShape = pptxShape

        # Access ITextFrame associated with the AutoShape
        pptxAutoShape.addTextFrame("")

        text_frame = pptxAutoShape.getTextFrame()

        # Add some text to the frame
        text_frame.getParagraphs().get_Item(0).getPortions().get_Item(0).setText("Aspose.Slides")

        #Set Hyperlink for the portion text
        hypman = text_frame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getHyperlinkManager()
        hypman.setExternalHyperlinkClick("http://www.aspose.com")

        # Write the presentation as a PPTX file
        save_format =SaveFormat
        pres.save(dataDir + "hLinkPPTX.pptx", save_format.Pptx)

        print "Created TextBox with Hyperlink, please check the output file."


if __name__ == '__main__':        
    CreateTextBox()
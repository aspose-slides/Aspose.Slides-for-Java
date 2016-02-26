from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType
from com.aspose.slides import FillType
from com.aspose.slides import TextAutofitType
from com.aspose.slides import TextAnchorType
from com.aspose.slides import TextVerticalType
from java.awt import Color

class ManageText:

    def __init__(self):
        
        # Setting the AutofitType property of text frame
        self.set_autofittype_of_text()

        # Setting the anchor of TextFrame
        self.set_anchor_of_text()

        # Rotating the text
        self.rotate_text()
        
    def set_autofittype_of_text(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithText/ManageText/'    
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType=ShapeType
        ashp = slide.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 350, 350)

        # Add TextFrame to the Rectangle
        fillType=FillType
        ashp.addTextFrame(" ")
        ashp.getFillFormat().setFillType(fillType.NoFill)

        # Accessing the text frame
        txt_frame = ashp.getTextFrame()

        # Setting text autofit type
        textAutofitType=TextAutofitType
        txt_frame.getTextFrameFormat().setAutofitType(textAutofitType.Shape)

        # Create the Paragraph object for text frame
        para = txt_frame.getParagraphs().get_Item(0)

        # Create Portion object for paragraph
        color=Color
        portion = para.getPortions().get_Item(0)
        portion.setText("A quick brown fox jumps over the lazy dog. A quick brown fox jumps over the lazy dog.")
        portion.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        portion.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "formatText.pptx", save_format.Pptx)

        print "Set autofittype of text, please check the output file."
        
    def set_anchor_of_text(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithText/ManageText/'    
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType=ShapeType
        ashp = slide.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 350, 350)

        # Add TextFrame to the Rectangle
        fillType=FillType
        ashp.addTextFrame(" ")
        ashp.getFillFormat().setFillType(fillType.NoFill)

        # Accessing the text frame
        txt_frame = ashp.getTextFrame()

        # Setting text anchoring to bottom
        textAnchorType=TextAnchorType
        txt_frame.getTextFrameFormat().setAnchoringType(textAnchorType.Bottom)

        # Create the Paragraph object for text frame
        para = txt_frame.getParagraphs().get_Item(0)

        # Create Portion object for paragraph
        color=Color
        portion = para.getPortions().get_Item(0)
        portion.setText("A quick brown fox jumps over the lazy dog. A quick brown fox jumps over the lazy dog.")
        portion.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        portion.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "AnchorText.pptx", save_format.Pptx)

        print "Set anchor of text, please check the output file."
        
    def rotate_text(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithText/ManageText/'            
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType=ShapeType
        ashp = slide.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 350, 350)

        # Add TextFrame to the Rectangle
        fillType=FillType
        ashp.addTextFrame(" ")
        ashp.getFillFormat().setFillType(fillType.NoFill)

        # Accessing the text frame
        txt_frame = ashp.getTextFrame()

        # Setting text Vertical type
        textVerticalType=TextVerticalType
        txt_frame.getTextFrameFormat().setTextVerticalType(textVerticalType.Vertical270)

        # Create the Paragraph object for text frame
        para = txt_frame.getParagraphs().get_Item(0)

        # Create Portion object for paragraph
        portion = para.getPortions().get_Item(0)
        color=Color
        portion.setText("A quick brown fox jumps over the lazy dog. A quick brown fox jumps over the lazy dog.")
        portion.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        portion.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "VerticleText.pptx", save_format.Pptx)

        print "Done with text rotation, please check the output file."


if __name__ == '__main__':        
    ManageText()
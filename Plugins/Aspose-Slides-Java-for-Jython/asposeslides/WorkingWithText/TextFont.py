from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType
from com.aspose.slides import FillType
from com.aspose.slides import FontData
from com.aspose.slides import NullableBool
from com.aspose.slides import TextUnderlineType
from com.aspose.slides import LoadFormat
from com.aspose.slides import LoadOptions


from java.awt import Color


class TextFont:

    def __init__(self):
        
        # Managing Font Related Properties
        self.font_properties()

        # Managing Font Family of Text
        self.font_family_of_text()

        # Using Default Fonts for Rendering Presentation
        self.set_default_font_for_rendering()
        
    def font_properties(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithText/TextFont/'            
        # Create an instance of Presentation class
        pres = Presentation(dataDir + 'Welcome.pptx')

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Accessing the first and second placeholder in the slide and typecasting it as AutoShape
        tf1 = slide.getShapes().get_Item(0).getTextFrame()
        tf2 = slide.getShapes().get_Item(1).getTextFrame()

        # Accessing the first Paragraph
        para1 = tf1.getParagraphs().get_Item(0)
        para2 = tf2.getParagraphs().get_Item(0)

        # Accessing the first portion
        port1 = para1.getPortions().get_Item(0)
        port2 = para2.getPortions().get_Item(0)

        # Define fonts
        fd1 = FontData("Elephant")
        fd2 = FontData("Castellar")

        # Assign fonts to portion
        port1.getPortionFormat().setLatinFont(fd1)
        port2.getPortionFormat().setLatinFont(fd2)

        # Set font to Bold
        nullableBool=NullableBool
        port1.getPortionFormat().setFontBold(nullableBool.True)
        port2.getPortionFormat().setFontBold(nullableBool.True)

        # Set font to Italic
        port1.getPortionFormat().setFontItalic(nullableBool.True)
        port2.getPortionFormat().setFontItalic(nullableBool.True)

        # Set font color
        fillType=FillType
        color=Color
        port1.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        port1.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        port2.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        port2.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.GREEN)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "WelcomeFont.pptx", save_format.Pptx)

        print "Done with font properties, please check the output file."
        
    def font_family_of_text(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithText/TextFont/'            
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType=ShapeType
        ashp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 50, 200, 50)

        # Remove any fill style associated with the AutoShape
        fillType=FillType
        ashp.getFillFormat().setFillType(fillType.NoFill)

        # Access the TextFrame associated with the AutoShape
        tf = ashp.getTextFrame()
        tf.setText("Aspose TextBox")

        # Access the Portion associated with the TextFrame
        port = tf.getParagraphs().get_Item(0).getPortions().get_Item(0)

        # Set the Font for the Portion
        port.getPortionFormat().setLatinFont(FontData("Times New Roman"))

        # Set Bold property of the Font
        nullableBool=NullableBool
        port.getPortionFormat().setFontBold(nullableBool.True)

        # Set Italic property of the Font
        port.getPortionFormat().setFontItalic(nullableBool.True)

        # Set Underline property of the Font
        textUnderlineType=TextUnderlineType
        port.getPortionFormat().setFontUnderline(textUnderlineType.Single)

        # Set the Height of the Font
        port.getPortionFormat().setFontHeight(25)

        # Set the color of the Font
        color=Color
        port.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        port.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "FontFamilyOfText.pptx", save_format.Pptx)

        print "Done with font family for text, please check the output file."
        
        
    def set_default_font_for_rendering(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithText/TextFont/'            
        # Use load options to define the default regualr and asian fonts

        loadFormat = LoadFormat
        lo = LoadOptions(loadFormat.Auto)
        lo.setDefaultRegularFont("Wingdings")
        lo.setDefaultAsianFont("Wingdings")

        # Create an instance of Presentation class
        pres = Presentation(dataDir + 'input.pptx')

        # Generate PDF
        save_format = SaveFormat
        pres.save(dataDir + "output.pdf", save_format.Pdf)

        print "Done with font family for text, please check the output file."



if __name__ == '__main__':        
    TextFont()
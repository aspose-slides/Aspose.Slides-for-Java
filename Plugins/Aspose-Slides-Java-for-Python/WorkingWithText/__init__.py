__author__ = 'fahadadeel'
import jpype

class CreateTextBox:
    
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")

    def main(self):
        
        # Creating a TextBox on Slide
        self.create_textbox()

        # Creating a TextBox with Hyperlink
        self.create_textbox_with_hyperlink()
        
    def create_textbox(self):
               
        # Create an instance of Presentation class
        pres = self.Presentation

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = self.ShapeType
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
        save_format = self.SaveFormat
        pres.save(self.dataDir + "TextBox.pptx", save_format.Pptx)

        print "Created TextBox, please check the output file."
        
    def create_textbox_with_hyperlink(self):
        
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = self.ShapeType
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
        save_format = self.SaveFormat
        pres.save(self.dataDir + "hLinkPPTX.pptx", save_format.Pptx)

        print "Created TextBox with Hyperlink, please check the output file."
        
class ManageText:
    
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.TextAutofitType=jpype.JClass("com.aspose.slides.TextAutofitType")
        self.TextAnchorType=jpype.JClass("com.aspose.slides.TextAnchorType")
        self.TextVerticalType=jpype.JClass("com.aspose.slides.TextVerticalType")
        self.Color=jpype.JClass("java.awt.Color")

    def main(self):
        
        # Setting the AutofitType property of text frame
        self.set_autofittype_of_text()

        # Setting the anchor of TextFrame
        self.set_anchor_of_text()

        # Rotating the text
        self.rotate_text()
        
    def set_autofittype_of_text(self):
        
        # Create an instance of Presentation class
        pres = self.Presentation

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType=ShapeType
        ashp = slide.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 350, 350)

        # Add TextFrame to the Rectangle
        fillType = self.FillType
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
        color = self.Color
        portion = para.getPortions().get_Item(0)
        portion.setText("A quick brown fox jumps over the lazy dog. A quick brown fox jumps over the lazy dog.")
        portion.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        portion.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "formatText.pptx", save_format.Pptx)

        print "Set autofittype of text, please check the output file."
        
    def set_anchor_of_text(self):
        
        # Create an instance of Presentation class
        pres = self.Presentation

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType=ShapeType
        ashp = slide.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 350, 350)

        # Add TextFrame to the Rectangle
        fillType = self.FillType
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
        color = self.Color
        portion = para.getPortions().get_Item(0)
        portion.setText("A quick brown fox jumps over the lazy dog. A quick brown fox jumps over the lazy dog.")
        portion.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        portion.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "AnchorText.pptx", save_format.Pptx)

        print "Set anchor of text, please check the output file."
        
    def rotate_text(self):
        
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
        save_format = self.SaveFormat
        pres.save(self.dataDir + "VerticleText.pptx", save_format.Pptx)

        print "Done with text rotation, please check the output file."
        
class ReplaceText:
    
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

    def main(self):
                        
        # Create an instance of Presentation class
        pres = self.Presentation(self.dataDir + 'Welcome.pptx')

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Change the text of each placeholder
        shp = sld.getShapes().get_Item(0)
        shp.getTextFrame().setText("This is Placeholder")

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Welcome_PH.pptx", save_format.Pptx)

        print "Replaced text, please check the output file."
        
class ShadowEffects:
    
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.RectangleAlignment=jpype.JClass("com.aspose.slides.RectangleAlignment")
        self.Color=jpype.JClass("java.awt.Color")

    def main(self):
                
        # Create an instance of Presentation class
        pres = self.Presentation

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType=ShapeType
        shp = slide.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 150, 50)

        # Add TextFrame to the Rectangle
        shp.addTextFrame("Aspose TextBox")

        # Disable shape fill in case we want to get shadow of text
        fillType = self.FillType
        shp.getFillFormat().setFillType(fillType.NoFill)

        # Add outer shadow and set all necessary parameters
        shp.getEffectFormat().enableOuterShadowEffect()
        shadow = shp.getEffectFormat().getOuterShadowEffect()
        shadow.setBlurRadius(4.0)
        shadow.setDirection(45)
        shadow.setDistance(3)

        rectangleAlignment=RectangleAlignment

        color = self.Color

        shadow.setRectangleAlign(rectangleAlignment.TopLeft)
        shadow.getShadowColor().setColor(color.black)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "OutShadow.pptx", save_format.Pptx)

        print "Applied shadow effects on text, please check the output file."
        
class TextFont:
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.FontData=jpype.JClass("com.aspose.slides.FontData")
        self.NullableBool=jpype.JClass("com.aspose.slides.NullableBool")
        self.TextUnderlineType=jpype.JClass("com.aspose.slides.TextUnderlineType")
        self.LoadFormat=jpype.JClass("com.aspose.slides.LoadFormat")
        self.LoadOptions=jpype.JClass("com.aspose.slides.LoadOptions")
        self.Color=jpype.JClass("java.awt.Color")

    def main(self):
        
        # Managing Font Related Properties
        self.font_properties()

        # Managing Font Family of Text
        self.font_family_of_text()

        # Using Default Fonts for Rendering Presentation
        self.set_default_font_for_rendering()
        
    def font_properties(self):
        
        # Create an instance of Presentation class
        pres = self.Presentation(self.dataDir + 'Welcome.pptx')

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
        fd1 = self.FontData("Elephant")
        fd2 = self.FontData("Castellar")

        # Assign fonts to portion
        port1.getPortionFormat().setLatinFont(fd1)
        port2.getPortionFormat().setLatinFont(fd2)

        # Set font to Bold
        nullableBool = self.NullableBool
        port1.getPortionFormat().setFontBold(nullableBool.True)
        port2.getPortionFormat().setFontBold(nullableBool.True)

        # Set font to Italic
        port1.getPortionFormat().setFontItalic(nullableBool.True)
        port2.getPortionFormat().setFontItalic(nullableBool.True)

        # Set font color
        fillType = self.FillType
        color = self.Color
        port1.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        port1.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        port2.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        port2.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.GREEN)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "WelcomeFont.pptx", save_format.Pptx)

        print "Done with font properties, please check the output file."
        
    def font_family_of_text(self):
        
        # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType = self.ShapeType
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
        color = self.Color
        port.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        port.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "FontFamilyOfText.pptx", save_format.Pptx)

        print "Done with font family for text, please check the output file."
        
        
    def set_default_font_for_rendering(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithText/TextFont/'            
        # Use load options to define the default regualr and asian fonts

        loadFormat = LoadFormat
        lo = LoadOptions(loadFormat.Auto)
        lo.setDefaultRegularFont("Wingdings")
        lo.setDefaultAsianFont("Wingdings")

        # Create an instance of Presentation class
        pres = Presentation(self.dataDir + 'input.pptx')

        # Generate PDF
        save_format = self.SaveFormat
        pres.save(self.dataDir + "output.pdf", save_format.Pdf)

        print "Done with font family for text, please check the output file."
        
class WordArt:
    
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.RectangleAlignment=jpype.JClass("com.aspose.slides.RectangleAlignment")
        self.ColorType=jpype.JClass("com.aspose.slides.ColorType")
        self.SchemeColor=jpype.JClass("com.aspose.slides.SchemeColor")
        self.Color=jpype.JClass("java.awt.Color")

    def main(self):
                        
        # Create an instance of Presentation class
        pres = self.Presentation

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        shapeType = self.ShapeType
        fillType = self.FillType
        ashp = slide.getShapes().addAutoShape(shapeType.Rectangle, 150, 75, 400, 300)
        ashp.getFillFormat().setFillType(fillType.NoFill)

        # Add TextFrame to the Rectangle
        ashp.addTextFrame("Aspose TextBox")
        port = ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0)
        pf = port.getPortionFormat()
        pf.setFontHeight(50)

        # Enable InnerShadowEffect
        ef = pf.getEffectFormat()
        ef.enableInnerShadowEffect()

        # Set all necessary parameters
        ef.getInnerShadowEffect().setBlurRadius(8.0)
        ef.getInnerShadowEffect().setDirection(90)
        ef.getInnerShadowEffect().setDistance(6.0)
        ef.getInnerShadowEffect().getShadowColor().setB(189)

        # Set ColorType as Scheme
        colorType = self.ColorType
        ef.getInnerShadowEffect().getShadowColor().setColorType(colorType.Scheme)

        # Set Scheme Color
        schemeColor = self.SchemeColor
        ef.getInnerShadowEffect().getShadowColor().setSchemeColor(schemeColor.Accent1)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "WordArt.pptx", save_format.Pptx)

        print "Done with word art, please check the output file."
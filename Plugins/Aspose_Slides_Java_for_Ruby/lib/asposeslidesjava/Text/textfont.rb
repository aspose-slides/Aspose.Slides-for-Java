module Asposeslidesjava
  module TextFont
    def initialize()
        # Managing Font Related Properties
        font_properties()

        # Managing Font Family of Text
        font_family_of_text()

        # Using Default Fonts for Rendering Presentation
        set_default_font_for_rendering()
    end

    def font_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Welcome.pptx')

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

        # Define new fonts
        fd1 = Rjb::import('com.aspose.slides.FontData').new("Elephant")
        fd2 = Rjb::import('com.aspose.slides.FontData').new("Castellar")

        # Assign new fonts to portion
        port1.getPortionFormat().setLatinFont(fd1)
        port2.getPortionFormat().setLatinFont(fd2)

        # Set font to Bold
        port1.getPortionFormat().setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)
        port2.getPortionFormat().setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)

        # Set font to Italic
        port1.getPortionFormat().setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)
        port2.getPortionFormat().setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)

        # Set font color
        port1.getPortionFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        port1.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').BLUE)
        port2.getPortionFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        port2.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').GREEN)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "WelcomeFont.pptx", save_format.Pptx)

        puts "Done with font properties, please check the output file."
    end

    def font_family_of_text()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        ashp = sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 50, 50, 200, 50)

        # Remove any fill style associated with the AutoShape
        ashp.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').NoFill)

        # Access the TextFrame associated with the AutoShape
        tf = ashp.getTextFrame()
        tf.setText("Aspose TextBox")

        # Access the Portion associated with the TextFrame
        port = tf.getParagraphs().get_Item(0).getPortions().get_Item(0)

        # Set the Font for the Portion
        port.getPortionFormat().setLatinFont(Rjb::import('com.aspose.slides.FontData').new("Times New Roman"))

        # Set Bold property of the Font
        port.getPortionFormat().setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)

        # Set Italic property of the Font
        port.getPortionFormat().setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)

        # Set Underline property of the Font
        port.getPortionFormat().setFontUnderline(Rjb::import('com.aspose.slides.TextUnderlineType').Single)

        # Set the Height of the Font
        port.getPortionFormat().setFontHeight(25)

        # Set the color of the Font
        port.getPortionFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        port.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').BLUE)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "FontFamilyOfText.pptx", save_format.Pptx)

        puts "Done with font family for text, please check the output file."
    end

    def set_default_font_for_rendering()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Use load options to define the default regualr and asian fonts                               
        lo = Rjb::import('com.aspose.slides.LoadOptions').new(Rjb::import('com.aspose.slides.LoadFormat').Auto)                                           
        lo.setDefaultRegularFont("Wingdings")                                                         
        lo.setDefaultAsianFont("Wingdings") 

        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'input.pptx')
                                                                                                
        # Generate PDF 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "output.pdf", save_format.Pdf)

        puts "Done with font family for text, please check the output file."
    end
  end
end

module Asposeslidesjava
  module CreateTextBox
    def initialize()
        # Creating a TextBox on Slide
        create_textbox()

        # Creating a TextBox with Hyperlink
        create_textbox_with_hyperlink()
    end

    def create_textbox()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shp = sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 150, 75, 150, 50)

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
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "TextBox.pptx", save_format.Pptx)

        puts "Created TextBox, please check the output file."
    end

    def create_textbox_with_hyperlink()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        pptxShape = sld.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 150, 150, 150, 50)

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
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "hLinkPPTX.pptx", save_format.Pptx)

        puts "Created TextBox with Hyperlink, please check the output file."
    end
  end
end

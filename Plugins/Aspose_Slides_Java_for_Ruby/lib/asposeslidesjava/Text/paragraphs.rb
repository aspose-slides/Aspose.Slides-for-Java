module Asposeslidesjava
  module Paragraphs
    def initialize()
        # Managing Paragraphs Alignment
        paragraphs_alignment()

        # Managing Multiple Paragraphs having Multiple Portions
        multiple_paragraphs_having_muliple_portions()

        # Managing Paragraph Bullets
        paragraphs_bullets()

        # Managing Paragraph Indent
        paragraphs_indentation()

        # Managing Line Spacing of the paragraph
        line_spacing()
    end

    def paragraphs_alignment()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'leftalign.pptx')

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Accessing the first and second placeholder in the slide and typecasting it as AutoShape
        tf1 = slide.getShapes().get_Item(0).getTextFrame()
        tf2 = slide.getShapes().get_Item(1).getTextFrame()

        # Change the text in both placeholders
        tf1.setText("Center Align by Aspose")
        tf2.setText("Center Align by Aspose")

        # Getting the first paragraph of the placeholders
        para1 = tf1.getParagraphs().get_Item(0)
        para2 = tf2.getParagraphs().get_Item(0)

        # Aligning the text paragraph to center
        para1.getParagraphFormat().setAlignment(Rjb::import('com.aspose.slides.TextAlignment').Center)
        para2.getParagraphFormat().setAlignment(Rjb::import('com.aspose.slides.TextAlignment').Center)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Centeralign.pptx", save_format.Pptx)

        puts "Done with text alignment, please check the output file."
    end

    def multiple_paragraphs_having_muliple_portions()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add an AutoShape of Rectangle type
        ashp = slide.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 50, 150, 300, 150)

        # Access TextFrame of the AutoShape
        tf = ashp.getTextFrame()

        # Create Paragraphs and Portions with different text formats
        para0 = tf.getParagraphs().get_Item(0)
        port01 = Rjb::import('com.aspose.slides.Portion').new
        port02 = Rjb::import('com.aspose.slides.Portion').new
        para0.getPortions().add(port01)
        para0.getPortions().add(port02)

        para1 = Rjb::import('com.aspose.slides.Paragraph').new
        tf.getParagraphs().add(para1)
        port10 = Rjb::import('com.aspose.slides.Portion').new
        port11 = Rjb::import('com.aspose.slides.Portion').new
        port12 = Rjb::import('com.aspose.slides.Portion').new
        para1.getPortions().add(port10)
        para1.getPortions().add(port11)
        para1.getPortions().add(port12)

        para2 = Rjb::import('com.aspose.slides.Paragraph').new
        tf.getParagraphs().add(para2)
        port20 = Rjb::import('com.aspose.slides.Portion').new
        port21 = Rjb::import('com.aspose.slides.Portion').new
        port22 = Rjb::import('com.aspose.slides.Portion').new
        para2.getPortions().add(port20)
        para2.getPortions().add(port21)
        para2.getPortions().add(port22)

        i = 0
        for i in 0..2
           j = 0
           for j in 0..2
               tf.getParagraphs().get_Item(i).getPortions().get_Item(j).setText("Portion0#{j}")
               if j == 0
                   tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
                   tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').RED)
                   tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)
                   tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontHeight(15)
               #elseif j == 1
               #    tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
               #    tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').BLUE)
               #    tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)
               #    tf.getParagraphs().get_Item(i).getPortions().get_Item(j).getPortionFormat().setFontHeight(18)
               end
           end
        end   

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "multiParaPort.pptx", save_format.Pptx)

        puts "Done with multiple paragraphs, please check the output file."
    end

    def paragraphs_bullets()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Adding and accessing Autoshape
        shp = slide.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 200, 200, 400, 200)

        # Accessing the text frame of created autoshape
        txt_frm = shp.getTextFrame()

        # Removing the default exisiting paragraph
        txt_frm.getParagraphs().removeAt(0)

        # Creating a paragraph
        para = Rjb::import('com.aspose.slides.Paragraph').new

        # Setting paragraph bullet style and symbol
        para.getParagraphFormat().getBullet().setType(Rjb::import('com.aspose.slides.BulletType').Symbol)
        para.getParagraphFormat().getBullet().setChar(8226)

        # Setting paragraph text
        para.setText("Welcome to Aspose.Slides")

        # Setting bullet indent
        para.getParagraphFormat().setIndent(25)

        # Setting bullet color
        para.getParagraphFormat().getBullet().getColor().setColorType(Rjb::import('com.aspose.slides.ColorType').RGB)
        para.getParagraphFormat().getBullet().getColor().setColor(Rjb::import('java.awt.Color').BLACK)

        # set IsBulletHardColor to true to use own bullet color
        para.getParagraphFormat().getBullet().isBulletHardColor(Rjb::import('com.aspose.slides.NullableBool').True)

        # Setting Bullet Height
        para.getParagraphFormat().getBullet().setHeight(100)

        # Adding Paragraph to text frame
        txt_frm.getParagraphs().add(para)

        # Creating second paragraph
        para2 = Rjb::import('com.aspose.slides.Paragraph').new

        # Setting paragraph bullet type and style
        para2.getParagraphFormat().getBullet().setType(Rjb::import('com.aspose.slides.BulletType').Numbered)
        para2.getParagraphFormat().getBullet().setNumberedBulletStyle(Rjb::import('com.aspose.slides.NumberedBulletStyle').BulletCircleNumWDBlackPlain)

        # Adding paragraph text
        para2.setText("This is numbered bullet")

        # Setting bullet indent
        para2.getParagraphFormat().setIndent(25)

        para2.getParagraphFormat().getBullet().getColor().setColorType(Rjb::import('com.aspose.slides.ColorType').RGB)
        para2.getParagraphFormat().getBullet().getColor().setColor(Rjb::import('java.awt.Color').BLACK)

        # set IsBulletHardColor to true to use own bullet color
        para2.getParagraphFormat().getBullet().isBulletHardColor(Rjb::import('com.aspose.slides.NullableBool').True)

        # Setting Bullet Height
        para2.getParagraphFormat().getBullet().setHeight(100)

        # Adding Paragraph to text frame
        txt_frm.getParagraphs().add(para2)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Bullet.pptx", save_format.Pptx)

        puts "Done with Paragraphs bullet, please check the output file."
    end

    def paragraphs_indentation()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Add a Rectangle Shape
        rect = slide.getShapes().addAutoShape(Rjb::import('com.aspose.slides.ShapeType').Rectangle,100, 100, 500, 150)

        # Add TextFrame to the Rectangle
        tf = rect.addTextFrame("This is first line \nThis is second line \nThis is third line")

        # Set the text to fit the shape
        tf.getTextFrameFormat().setAutofitType(Rjb::import('com.aspose.slides.TextAutofitType').Shape)

        # Hide the lines of the Rectangle
        rect.getLineFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)

        # Get first Paragraph in the TextFrame and set its Indent
        para1 = tf.getParagraphs().get_Item(0)

        # Setting paragraph bullet style and symbol
        para1.getParagraphFormat().getBullet().setType(Rjb::import('com.aspose.slides.BulletType').Symbol)
        para1.getParagraphFormat().getBullet().setChar(8226)
        para1.getParagraphFormat().setAlignment(Rjb::import('com.aspose.slides.TextAlignment').Left)

        para1.getParagraphFormat().setDepth(2)
        para1.getParagraphFormat().setIndent(30)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "InOutDent.pptx", save_format.Pptx)

        puts "Done with paragraphs identation, please check the output file."
    end

    def line_spacing()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Text/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'Welcome.pptx')

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Access the TextFrame
        tf = slide.getShapes().get_Item(0).getTextFrame()

        # Access the Paragraph
        para = tf.getParagraphs().get_Item(0)

        # Set properties of Paragraph
        para.getParagraphFormat().setSpaceWithin(80)
        para.getParagraphFormat().setSpaceBefore(40)
        para.getParagraphFormat().setSpaceAfter(40)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "LineSpacing.pptx", save_format.Pptx)

        puts "Done with line spacing, please check the output file."
    end
  end
end

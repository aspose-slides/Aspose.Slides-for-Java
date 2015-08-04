module Asposeslidesjava
  module AddImage
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Tables/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Define columns with widths and rows with heights
        dbl_cols = [150,150,150,150]
        dbl_rows = [100,100,100,100,90]

        # Add table shape to slide
        tbl = sld.getShapes().addTable(50, 50, dbl_cols, dbl_rows)

        # Creating a Buffered Image object to hold the image file
        image = Rjb::import('javax.imageio.ImageIO').read(Rjb::import('java.io.File').new(data_dir + "aspose-logo.jpg"))
        imgx1 = pres.getImages().addImage(image)

        tbl.get_Item(0,0).getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Picture)
        tbl.get_Item(0,0).getFillFormat().getPictureFillFormat().setPictureFillMode(Rjb::import('com.aspose.slides.PictureFillMode').Stretch)
        tbl.get_Item(0,0).getFillFormat().getPictureFillFormat().getPicture().setImage(imgx1)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "AddImage.pptx", save_format.Pptx)

        puts "Added image, please check the output file."
    end
  end
end

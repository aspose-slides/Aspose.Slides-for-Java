module Asposeslidesjava
  module Background
    def initialize()
        # Setting the Background Color of a Master Slide
        set_background_color_of_master_slide()

        # Setting the Background Color of a Normal Slide
        set_background_color_of_normal_slide()

        # Setting the Slide Background to an Image
        set_image_as_background_color()
    end

    def set_background_color_of_master_slide()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Set the background color of the Master Slide to Forest Green
        pres.getMasters().get_Item(0).getBackground().setType(Rjb::import('com.aspose.slides.BackgroundType').OwnBackground)
        pres.getMasters().get_Item(0).getBackground().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        pres.getMasters().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').GREEN)

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "MasterBG.pptx", save_format.Pptx)

        puts "Set background color of master slide, please check the output file."
    end

    def set_background_color_of_normal_slide()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Set the background color of the Normal slide to Blue
        pres.getSlides().get_Item(0).getBackground().setType(Rjb::import('com.aspose.slides.BackgroundType').OwnBackground)
        pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        pres.getSlides().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').BLUE)

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "ContentBG.pptx", save_format.Pptx)

        puts "Set background color of normal slide, please check the output file."
    end

    def set_image_as_background_color()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Set the background with Image
        pres.getSlides().get_Item(0).getBackground().setType(Rjb::import('com.aspose.slides.BackgroundType').OwnBackground)
        pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Picture)
        pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().setPictureFillMode(Rjb::import('com.aspose.slides.PictureFillMode').Stretch)

        # Set the picture
        imgx = pres.getImages().addImage(Rjb::import('java.io.FileInputStream').new(Rjb::import('java.io.File').new(data_dir + 'night.jpg')))

        # Image imgx = pres.getImages().addImage(image);
        # Add image to presentation's images collection

        pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().getPicture().setImage(imgx)

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "ContentBG_Image.pptx", save_format.Pptx)

        puts "Set image as background, please check the output file."
    end
  end
end

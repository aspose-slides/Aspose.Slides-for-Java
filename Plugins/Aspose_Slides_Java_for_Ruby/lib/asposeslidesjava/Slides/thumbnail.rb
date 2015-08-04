module Asposeslidesjava
  module Thumbnail
    def initialize()
        # Generating a Thumbnail from a Slide
        create_thumbnail()

        # Generating a Thumbnail from a Slide with User Defined Dimensions
        create_thumbnail_custom_size()

        # Generating a Thumbnail from a Slide in Notes Slides View
        create_thumbnail_in_notes_slides_view()

        # Generating a Thumbnail of User Defined Window from a Slide
        create_thumbnail_of_user_defined_window()
    end 

    # Generating a Thumbnail from a Slide
    def create_thumbnail()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Access the first slide
        slide = pres.getSlides().get_Item(0)

        # Create a full scale image
        image = slide.getThumbnail()

        # Save the image to disk in JPEG format
        Rjb::import('javax.imageio.ImageIO').write(image, "jpeg", Rjb::import('java.io.File').new(data_dir + "ContentBG_tnail.jpg"))

        puts "Created thumbnail, please check the output file."
    end   

    # Generating a Thumbnail from a Slide with User Defined Dimensions
    def create_thumbnail_custom_size()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Access the first slide
        slide = pres.getSlides().get_Item(0)

        # User defined dimension
        desired_x = 1200
        desired_y = 800

        # Getting scaled value  of X and Y
        scale_x = (1.0 / pres.getSlideSize().getSize().getWidth()) * desired_x
        scale_y = (1.0 / pres.getSlideSize().getSize().getHeight()) * desired_y

        # Create a full scale image
        image = slide.getThumbnail(scale_x, scale_y)

        # Save the image to disk in JPEG format
        Rjb::import('javax.imageio.ImageIO').write(image, "jpeg", Rjb::import('java.io.File').new(data_dir + "ContentBG_tnail.jpg"))

        puts "Created thumbnail with custom size, please check the output file."
    end   

    # Generating a Thumbnail from a Slide in Notes Slides View
    def create_thumbnail_in_notes_slides_view()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Access the first slide
        slide = pres.getSlides().get_Item(0)

        # User defined dimension
        desired_x = 1200
        desired_y = 800

        # Getting scaled value  of X and Y
        scale_x = (1.0 / pres.getSlideSize().getSize().getWidth()) * desired_x
        scale_y = (1.0 / pres.getSlideSize().getSize().getHeight()) * desired_y

        # Create a full scale image
        image = slide.getNotesSlide().getThumbnail(scale_x, scale_y)

        # Save the image to disk in JPEG format
        Rjb::import('javax.imageio.ImageIO').write(image, "jpeg", Rjb::import('java.io.File').new(data_dir + "ContentBG_tnail.jpg"))

        puts "Created thumbnail in notes slides view, please check the output file."
    end   

    # Generating a Thumbnail of User Defined Window from a Slide
    def create_thumbnail_of_user_defined_window()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Access the first slide
        slide = pres.getSlides().get_Item(0)

        # Create a full scale image
        image = slide.getThumbnail(1,1)

        # Getting the image of desired window inside generated slide thumnbnail
        # BufferedImage window = image.getSubimage(windowX, windowY, windowsWidth, windowHeight);
        window_image = image.getSubimage(100, 100, 200, 200)

        # Save the image to disk in JPEG format
        Rjb::import('javax.imageio.ImageIO').write(image, "jpeg", Rjb::import('java.io.File').new(data_dir + "ContentBG_tnail.jpg"))

        puts "Created thumbnail of user defined window, please check the output file."
    end   
  end
end

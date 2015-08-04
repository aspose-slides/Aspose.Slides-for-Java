module Asposeslidesjava
  module Frame
    def initialize()
        # Adding Picture Frame to Slide
        add_picture_frame()

        # Adding Audio Frame to Slide
        add_audio_frame()

        # Adding Audio Frame to Slide
        add_video_frame()
    end

    def add_picture_frame()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Instantiate the Image class
        imgx = pres.getImages().addImage(Rjb::import('java.io.FileInputStream').new(Rjb::import('java.io.File').new(data_dir + "aspose-logo.jpg")))

        # Add Picture Frame with height and width equivalent of Picture
        sld.getShapes().addPictureFrame(Rjb::import('com.aspose.slides.ShapeType').Rectangle, 50, 150, imgx.getWidth(), imgx.getHeight(), imgx)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "RectPicFrame.pptx", save_format.Pptx)

        puts "Added picture frame to slide, please check the output file."
    end    

    def add_audio_frame()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Load the wav sound file to stram
        fstr = Rjb::import('java.io.FileInputStream').new(Rjb::import('java.io.File').new(data_dir + "Bass-Drum.wav"))
        
        # Add Audio Frame
        af = sld.getShapes().addAudioFrameEmbedded(50, 150, 100, 100, fstr)

        # Set Play Mode and Volume of the Audio
        af.setPlayMode(Rjb::import('com.aspose.slides.AudioPlayModePreset').Auto)
        af.setVolume(Rjb::import('com.aspose.slides.AudioVolumeMode').Loud)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "AudioFrameEmbed.pptx", save_format.Pptx)

        puts "Added audio frame to slide, please check the output file."
    end    

    def add_video_frame()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add Video Frame
        vf = sld.getShapes().addVideoFrame(50, 150, 300, 150, data_dir + "Wildlife.mp4")

        # Set Play Mode and Volume of the Video
        vf.setPlayMode(Rjb::import('com.aspose.slides.VideoPlayModePreset').Auto)
        vf.setVolume(Rjb::import('com.aspose.slides.AudioVolumeMode').Loud)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "VideoFrame.pptx", save_format.Pptx)

        puts "Added video frame to slide, please check the output file."
    end    
  end
end

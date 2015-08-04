module Asposeslidesjava
  module EmbedVideo
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Embedd vide inside presentation
        vid = pres.getVideos().addVideo(Rjb::import('java.io.FileInputStream').new(Rjb::import('java.io.File').new(data_dir + "Wildlife.mp4")))

        # Add Video Frame
        vf = sld.getShapes().addVideoFrame(50, 150, 300, 350, vid)

        # Set video to Video Frame
        vf.setEmbeddedVideo(vid)

        # Set Play Mode and Volume of the Video
        vf.setPlayMode(Rjb::import('com.aspose.slides.VideoPlayModePreset').Auto)
        vf.setVolume(Rjb::import('com.aspose.slides.AudioVolumeMode').Loud)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "VideoFrame.pptx", save_format.Pptx)

        puts "Embedded video frame in a slide, please check the output file."
    end
  end
end

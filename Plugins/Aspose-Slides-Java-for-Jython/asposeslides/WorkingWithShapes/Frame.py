from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType
from com.aspose.slides import AudioPlayModePreset
from com.aspose.slides import AudioVolumeMode
from com.aspose.slides import VideoPlayModePreset

from java.io import FileInputStream
from java.io import File

class Frame:

    def __init__(self):
        
        # Formatting the Lines of Shapes
        self.add_picture_frame()

        # Formatting the Join Styles
        self.add_audio_frame()
        
        # Adding Audio Frame to Slide
        self.add_audio_frame()
        
        self.add_video_frame()
        
    def add_picture_frame(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/Frame/'
        
         # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sId = pres.getSlides().get_Item(0)

        # Instantiate the Image class
        imgx = pres.getImages().addImage(FileInputStream(File(dataDir + "aspose-logo.jpg")))

        # Add Picture Frame with height and width equivalent of Picture
        shapeType = ShapeType
        sId.getShapes().addPictureFrame(shapeType.Rectangle, 50, 150, imgx.getWidth(), imgx.getHeight(), imgx)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "RectPicFrame.pptx", save_format.Pptx)

        print "Added picture frame to slide, please check the output file."
        
    def add_audio_frame(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/Frame/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sId = pres.getSlides().get_Item(0)

        # Load the wav sound file to stram
        fstr = FileInputStream(File(dataDir + "Bass-Drum.wav"))

        # Add Audio Frame
        af = sId.getShapes().addAudioFrameEmbedded(50, 150, 100, 100, fstr)

        # Set Play Mode and Volume of the Audio
        audioPlayModePreset = AudioPlayModePreset
        audioVolumeMode = AudioVolumeMode
        af.setPlayMode(audioPlayModePreset.Auto)
        af.setVolume(audioVolumeMode.Loud)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "AudioFrameEmbed.pptx", save_format.Pptx)

        print "Added audio frame to slide, please check the output file."
        
    def add_video_frame(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/Frame/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Get the first slide
        sId = pres.getSlides().get_Item(0)

        # Add Video Frame
        vf = sId.getShapes().addVideoFrame(50, 150, 300, 150, dataDir + "Wildlife.mp4")

        # Set Play Mode and Volume of the Video
        videoPlayModePreset = VideoPlayModePreset
        audioVolumeMode = AudioVolumeMode

        vf.setPlayMode(videoPlayModePreset.Auto)
        vf.setVolume(audioVolumeMode.Loud)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "VideoFrame.pptx", save_format.Pptx)

        print "Added video frame to slide, please check the output file."
        

if __name__ == '__main__':        
    Frame()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import BackgroundType
from com.aspose.slides import FillType
from com.aspose.slides import PictureFillMode
from java.awt import Color
from java.io import File
from java.io import FileInputStream 


class Background:

    def __init__(self):
                
        # Setting the Background Color of a Master Slide
        self.set_background_color_of_master_slide()

        # Setting the Background Color of a Normal Slide
        self.set_background_color_of_normal_slide()

        # Setting the Slide Background to an Image
        self.set_image_as_background_color()
        
    def set_background_color_of_master_slide(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/Background/'
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation()

        # Set the background color of the Master Slide to Forest Green
        backgroundType = BackgroundType
        fillType = FillType
        color = Color

        pres.getMasters().get_Item(0).getBackground().setType(backgroundType.OwnBackground)
        pres.getMasters().get_Item(0).getBackground().getFillFormat().setFillType(fillType.Solid)
        pres.getMasters().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(color.GREEN)

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "MasterBG.pptx", save_format.Pptx)

        print "Set background color of master slide, please check the output file."
        
    def set_background_color_of_normal_slide(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/Background/'
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation()

        # Set the background color of the Normal slide to Blue

        backgroundType = BackgroundType
        fillType = FillType
        color = Color

        pres.getSlides().get_Item(0).getBackground().setType(backgroundType.OwnBackground)
        pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(fillType.Solid)
        pres.getSlides().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(color.BLUE)

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "ContentBG.pptx", save_format.Pptx)

        print "Set background color of normal slide, please check the output file."
        
    def set_image_as_background_color(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/Background/'
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation()

        # Set the background with Image

        backgroundType = BackgroundType
        fillType = FillType
        pictureFillMode = PictureFillMode

        pres.getSlides().get_Item(0).getBackground().setType(backgroundType.OwnBackground)
        pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(fillType.Picture)
        pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().setPictureFillMode(pictureFillMode.Stretch)

        # Set the picture
        imgx = pres.getImages().addImage(FileInputStream(File(dataDir + 'night.jpg')))

        # Image imgx = pres.getImages().addImage(image)
        # Add image to presentation's images collection

        pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().getPicture().setImage(imgx)

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "ContentBG_Image.pptx", save_format.Pptx)

        print "Set image as background, please check the output file."


if __name__ == '__main__':        
    Background()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat

class ChangingPosition:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/ChangingPosition/'
        
       # Instantiate Presentation class that represents the presentation file
        pres = Presentation(dataDir + 'Aspose.pptx')

        # Get the slide whose position is to be changed
        slide = pres.getSlides().get_Item(0)

        # Set the position for the slide
        slide.setSlideNumber(2)

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "Aspose_Position.pptx", save_format.Pptx)

        print "Changes slide position, please check the output file."

if __name__ == '__main__':        
    ChangingPosition()
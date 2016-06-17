from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import XpsOptions

class Zoom:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/Zoom/'
        
        # Create an instance of Presentation class
        pres = Presentation()

        # Setting View Properties of Presentation
        pres.getViewProperties().getSlideViewProperties().setScale(50) # zoom value in percentages for slide view
        pres.getViewProperties().getNotesViewProperties().setScale(50) # .Scale = 50 //zoom value in percentages for notes view

        # Save the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "Zoom.pptx", save_format.Pptx)

        print "Set zoom value, please check the output file."

if __name__ == '__main__':        
    Zoom()
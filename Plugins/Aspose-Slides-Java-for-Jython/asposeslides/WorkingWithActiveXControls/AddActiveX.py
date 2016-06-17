from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import ControlType
from com.aspose.slides import SaveFormat

class AddActiveX:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithActiveXControls/'        
        # Create an instance of Presentation class
        pres = Presentation()

        # Adding the Media Player ActiveX control
        controlType = ControlType
        pres.getSlides().get_Item(0).getControls().addControl(controlType.WindowsMediaPlayer, 100, 100, 400, 400)

        # Access the Media Player ActiveX control and set the video path
        pres.getSlides().get_Item(0).getControls().get_Item(0).getProperties().set_Item("URL" ,  dataDir + "Wildlife.mp4")

        # Write the presentation as a PPTX file
        saveFormat = SaveFormat
        pres.save(dataDir + "AddActiveX.pptx", saveFormat.Pptx)

        print "Added ActiveX control, please check the output file."

if __name__ == '__main__':        
    AddActiveX()
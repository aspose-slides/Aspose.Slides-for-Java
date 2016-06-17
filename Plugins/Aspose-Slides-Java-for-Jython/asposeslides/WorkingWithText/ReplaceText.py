from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat

class ReplaceText:

    def __init__(self):
                
        dataDir = Settings.dataDir + 'WorkingWithText/ReplaceText/'    
        
        # Create an instance of Presentation class
        pres = Presentation(dataDir + 'Welcome.pptx')

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Change the text of each placeholder
        shp = sld.getShapes().get_Item(0)
        shp.getTextFrame().setText("This is Placeholder")

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "Welcome_PH.pptx", save_format.Pptx)

        print "Replaced text, please check the output file."


if __name__ == '__main__':        
    ReplaceText()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat

class Hyperlinks:

    def __init__(self):
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/Hyperlinks/'    
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation(dataDir + 'demo.pptx')

        # Removing the hyperlinks from presentation
        pres.getHyperlinkQueries().removeAllHyperlinks()

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "Hyperlinks.pptx", save_format.Pptx)

        print "Removed hyperlinks successfully, please check the output file."

if __name__ == '__main__':        
    Hyperlinks()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import XpsOptions

class PptToPptx:

    def __init__(self):
                        
         
        dataDir = Settings.dataDir + 'WorkingWithPresentation/PptToPptx/'
        
        # Instantiate a Presentation object that represents a PPTX file
        pres = Presentation(dataDir + "Presentation1.ppt")

        # Saving the PPTX presentation to PPTX format
        save_format = SaveFormat
        pres.save(dataDir + "Aspose.pptx", save_format.Pptx)

        print "Document has been converted, please check the output file."


if __name__ == '__main__':        
    PptToPptx()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat

class ConvertingToPdf:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/ConvertingToPdf/'
                
        # Instantiate a Presentation object that represents a PPTX file
        pres = Presentation(dataDir + "Aspose.pptx")

        # Saving the PPTX presentation to Pdf format
        save_format = SaveFormat
        pres.save(dataDir + "Aspose.pdf", save_format.Pdf)

        print "Document has been converted, please check the output file."


if __name__ == '__main__':        
    ConvertingToPdf()
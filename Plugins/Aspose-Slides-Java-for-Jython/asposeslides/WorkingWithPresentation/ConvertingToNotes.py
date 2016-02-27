from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat

class ConvertingToNotes:

    def __init__(self):
                
        # Converting Presentation to TIFF Notes
        self.convert_to_tiff_notes()

        # Converting Presentation to TIFF Notes
        self.convert_to_pdf_notes()
        
    def convert_to_tiff_notes(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/ConvertingToNotes/'
        
        # Instantiate a Presentation object that represents a PPTX file
        pres = Presentation(dataDir + "Aspose.pptx")

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "Notes.tiff", save_format.TiffNotes)

        print "Document has been converted, please check the output file."
    
    def convert_to_pdf_notes(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/ConvertingToNotes/'
        
        # Instantiate a Presentation object that represents a PPTX file
        pres = Presentation(dataDir + "Aspose.pptx")

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "Notes.pdf", save_format.pdf)

        print "Document has been converted, please check the output file."


if __name__ == '__main__':        
    ConvertingToNotes()
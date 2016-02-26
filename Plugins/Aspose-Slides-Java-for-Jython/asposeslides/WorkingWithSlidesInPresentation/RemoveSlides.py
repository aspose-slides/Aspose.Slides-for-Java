from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from java.io import FileOutputStream

class RemoveSlides:

    def __init__(self):
                
        # Using Slides Collection to Remove Slide by Index
        self.remove_slide_by_index()

        # Using Slides Collection to Remove Slide by ID
        self.remove_slide_by_id()
        
    def remove_slide_by_index(dataDir):
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/RemoveSlides/'    
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation(dataDir + 'Aspose.pptx')

        # Accessing a slide using its slide index
        slide = pres.getSlides().get_Item(0)

        # Removing a slide using its reference
        pres.getSlides().remove(slide)

        # Saving the presentation file
        save_format = SaveFormat
        pres.save(dataDir + "Modified.pptx", save_format.Pptx)

        print "Removed slide by Index, please check the output file."
        
    def remove_slide_by_id(dataDir):
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/RemoveSlides/'    
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation(dataDir + 'Aspose.pptx')

        # Removing a slide using its slide index
        pres.getSlides().removeAt(1)

        # Saving the presentation file
        save_format = SaveFormat
        pres.save(dataDir + "Modified.pptx", save_format.Pptx)

        print "Removed slide by ID, please check the output file."
        



if __name__ == '__main__':        
    RemoveSlides()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat

class AccessSlides:

    def __init__(self):
        
        # Formatting the Lines of Shapes
        self.get_slide_by_index()

        # Formatting the Join Styles
        self.get_slide_by_id()
        
    def get_slide_by_index(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/AccessSlides/'
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation(dataDir + 'Aspose.pptx')

        # Accessing a slide using its slide index
        slide = pres.getSlides().get_Item(0)

        print "Slide: "
        print slide
        
    def get_slide_by_id(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/AccessSlides/'
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation(dataDir + 'Aspose.pptx')

        # Getting Slide ID
        id = pres.getSlides().get_Item(0).getSlideId()

        # Accessing Slide by ID
        slide = pres.getSlideById(id)

        print "Slide: "
        print slide

if __name__ == '__main__':        
    AccessSlides()
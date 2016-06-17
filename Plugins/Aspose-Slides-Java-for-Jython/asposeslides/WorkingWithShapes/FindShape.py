from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import XpsOptions

class FindShape:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithShapes/FindShape/'
        
        # Create an instance of Presentation class
        pres = Presentation(dataDir + 'demo.pptx')

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        shape = self.find_shape(slide)

        print "Shape: " . shape
        
    def find_shape(slide, alttext):
        
         #Iterating through all shapes inside the slide

        i = 0
        slide_size = slide.getShapes().size()

        while i < slide_size:
            # If the alternative text of the slide matches with the required one then return the shape
            if (slide.getShapes().get_Item(i).getAlternativeText() == alttext):
                return slide.getShapes().get_Item(i)
            
            i+=1
        
        return nil


if __name__ == '__main__':        
    FindShape()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat

class AddSlides:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/AddSlides/'
        
       # Instantiate Presentation class that represents the presentation file
        pres =Presentation()

        # Instantiate SlideCollection calss
        slides = pres.getSlides()

        i = 0
        while i < pres.getLayoutSlides().size():

            # Add an empty slide to the Slides collection
            slides.addEmptySlide(pres.getLayoutSlides().get_Item(i))
            i+=1

        

        #Do some work on the newly added slide

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "EmptySlide.pptx", save_format.Pptx)

        print "Document has been created, please check the output file."

if __name__ == '__main__':        
    AddSlides()
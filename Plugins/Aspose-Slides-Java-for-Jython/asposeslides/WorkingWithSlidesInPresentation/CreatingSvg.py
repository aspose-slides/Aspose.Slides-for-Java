from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from java.io import FileOutputStream

class CreatingSvg:

    def __init__(self):
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/CreatingSvg/'    
        
        ## Instantiate Presentation class that represents the presentation file
        pres = Presentation(dataDir + 'demo.pptx')

        # Getting last slide index
        last_slide_position = pres.getSlides().size()

        #Iterating through every presentation slide and generating SVG image
        i = 0
        while i < last_slide_position:

            # Accessing Slides
            slide = pres.getSlides().get_Item(i)

            # Getting and saving the slide SVG image
            slide.writeAsSvg(FileOutputStream(dataDir + "SvgImage#{i}.svg"))

            i+=1

        print "Created SVG images, please check output files."


if __name__ == '__main__':        
    CreatingSvg()
from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import TransitionType

class Transitions:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/Transitions/'    
       
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation(dataDir + 'demo.pptx')

        transition_type = TransitionType

        # Apply circle type transition on slide 1
        pres.getSlides().get_Item(0).getSlideShowTransition().setType(transition_type.Circle)

        # Apply comb type transition on slide 2
        pres.getSlides().get_Item(1).getSlideShowTransition().setType(transition_type.Comb)

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "SimpleTransition.pptx", save_format.Pptx)

        print "Done with simple transition, please check the output file."


if __name__ == '__main__':        
    Transitions()
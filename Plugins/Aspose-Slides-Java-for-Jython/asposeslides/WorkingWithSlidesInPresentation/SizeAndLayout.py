from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import SlideSizeType
from com.aspose.slides import PdfOptions

class SizeAndLayout:

    def __init__(self):
       
        # Setting the Size and Type of a slide
        self.set_size_and_type()

        # Setting the page size when generating PDF
        self.set_page_size_for_pdf()
        
    def set_size_and_type(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/SizeAndLayout/'    
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation(dataDir + 'demo.pptx')
        aux_pres = Presentation()

        slide = pres.getSlides().get_Item(0)

        # Set the slide size of generated presentations to that of source
        aux_pres.getSlideSize().setType(pres.getSlideSize().getType())
        aux_pres.getSlideSize().setSize(pres.getSlideSize().getSize())

        # Clone required slide
        aux_pres.getSlides().addClone(pres.getSlides().get_Item(0))
        aux_pres.getSlides().removeAt(0)

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "Slide_Size_Type.pptx", save_format.Pptx)

        print "Set slide size and type, please check the output file."
        
    def set_page_size_for_pdf(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithSlidesInPresentation/SizeAndLayout/'    
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation()

        # Set SlideSize.Type Property
        slideSizeType = SlideSizeType
        pres.getSlideSize().setType(slideSizeType.A4Paper)

        # Set different properties of PDF Options
        opts = PdfOptions()
        opts.setSufficientResolution(600)

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "Export.pdf", save_format.Pdf, opts)

        print "Set page size for pdf, please check the output file."


if __name__ == '__main__':        
    SizeAndLayout()
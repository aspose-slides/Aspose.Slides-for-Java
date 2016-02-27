from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import TextAnchorType
from com.aspose.slides import FillType
from com.aspose.slides import TextVerticalType

from javax import ImageIO

from java.awt import Color

class AddImage:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithTables/AddImage/'    
        
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Define co lumns with widths and rows with heights
        dbl_cols = [150,150,150,150]
        dbl_rows = [100,100,100,100,90]

        # Add table shape to slide
        tbl = sld.getShapes().addTable(50, 50, dbl_cols, dbl_rows)

        # Creating a Buffered Image object to hold the image file
        imageIO = ImageIO()
        image = imageIO.read(File(dataDir + "aspose-logo.jpg"))
        imgx1 = pres.getImages().addImage(image)

        fillType=FillType()
        pictureFillMode=PictureFillMode()
        tbl.get_Item(0,0).getFillFormat().setFillType(fillType.Picture)
        tbl.get_Item(0,0).getFillFormat().getPictureFillFormat().setPictureFillMode(pictureFillMode.Stretch)
        tbl.get_Item(0,0).getFillFormat().getPictureFillFormat().getPicture().setImage(imgx1)

        # Write the presentation as a PPTX file
        save_format = SaveFormat()
        pres.save(dataDir + "AddImage.pptx", save_format.Pptx)

        print "Added image, please check the output file."


if __name__ == '__main__':        
    AddImage()
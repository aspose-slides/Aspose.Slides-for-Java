from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import FillType
from com.aspose.slides import SaveFormat
from java.awt import Color

class RemoveRowColumn:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithTables/RemoveRowColumn/'    

        pres = Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        col_width = [100, 50, 30]
        row_height = [30, 50, 30]

        table = slide.getShapes().addTable(100, 100, col_width, row_height)

        table.getRows().removeAt(1, False)
        table.getColumns().removeAt(1, False)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "RemoveRowColumn.pptx", save_format.Pptx)

        print "Removed Row & Column from table, please check the output file."
        
if __name__ == '__main__':        
    RemoveRowColumn()
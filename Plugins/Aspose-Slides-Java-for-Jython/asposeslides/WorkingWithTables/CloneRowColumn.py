from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import FillType
from com.aspose.slides import SaveFormat
from java.awt import Color

class CloneRowColumn:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithTables/CloneRowColumn/'    
        
        pres = Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Define columns with widths and rows with heights
        dbl_cols = [50, 50, 50]
        dbl_rows = [50, 30, 30, 30]

        # Add table shape to slide
        tbl = sld.getShapes().addTable(100, 50, dbl_cols, dbl_rows)

        fill_type = FillType
        color = Color

        # Set border format for each cell
        row = 0
        while (row < tbl.getRows().size()): 
            cell = 0
            while (cell < tbl.getRows().get_Item(row).size()): 
                tbl.getRows().get_Item(row).get_Item(cell).getBorderTop().getFillFormat().setFillType(fill_type.Solid)
                tbl.getRows().get_Item(row).get_Item(cell).getBorderTop().getFillFormat().getSolidFillColor().setColor(color.RED)
                tbl.getRows().get_Item(row).get_Item(cell).getBorderTop().setWidth(5)

                tbl.getRows().get_Item(row).get_Item(cell).getBorderBottom().getFillFormat().setFillType(fill_type.Solid)
                tbl.getRows().get_Item(row).get_Item(cell).getBorderBottom().getFillFormat().getSolidFillColor().setColor(color.RED)
                tbl.getRows().get_Item(row).get_Item(cell).getBorderBottom().setWidth(5)

                tbl.getRows().get_Item(row).get_Item(cell).getBorderLeft().getFillFormat().setFillType(fill_type.Solid)
                tbl.getRows().get_Item(row).get_Item(cell).getBorderLeft().getFillFormat().getSolidFillColor().setColor(color.RED)
                tbl.getRows().get_Item(row).get_Item(cell).getBorderLeft().setWidth(5)

                tbl.getRows().get_Item(row).get_Item(cell).getBorderRight().getFillFormat().setFillType(fill_type.Solid)
                tbl.getRows().get_Item(row).get_Item(cell).getBorderRight().getFillFormat().getSolidFillColor().setColor(color.RED)
                tbl.getRows().get_Item(row).get_Item(cell).getBorderRight().setWidth(5)

                cell += 1
            
            row += 1
        

        tbl.getColumns().get_Item(0).get_Item(0).getTextFrame().setText("00")
        tbl.getColumns().get_Item(0).get_Item(1).getTextFrame().setText("01")
        tbl.getColumns().get_Item(0).get_Item(2).getTextFrame().setText("02")
        tbl.getColumns().get_Item(0).get_Item(3).getTextFrame().setText("03")
        tbl.getColumns().get_Item(1).get_Item(0).getTextFrame().setText("10")
        tbl.getColumns().get_Item(2).get_Item(0).getTextFrame().setText("20")
        tbl.getColumns().get_Item(1).get_Item(1).getTextFrame().setText("11")
        tbl.getColumns().get_Item(2).get_Item(1).getTextFrame().setText("21")

        # AddClone adds a row in the end of the table
        tbl.getRows().addClone(tbl.getRows().get_Item(0) , False)

        # AddClone adds a column in the end of the table
        tbl.getColumns().addClone(tbl.getColumns().get_Item(0), False)

        # InsertClone adds a row at specific position in a table
        tbl.getRows().insertClone(2, tbl.getRows().get_Item(0), False)

        # InsertClone adds a row at specific position in a table
        tbl.getColumns().insertClone(2, tbl.getColumns().get_Item(0), False)

        # Write the presentation as a PPTX file
        save_format = SaveFormat
        pres.save(dataDir + "CloneRowColumn.pptx", save_format.Pptx)

        print "Cloned Row & Column from table, please check the output file."
        
if __name__ == '__main__':        
    CloneRowColumn()
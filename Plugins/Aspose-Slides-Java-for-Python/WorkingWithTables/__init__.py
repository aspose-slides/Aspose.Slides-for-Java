__author__ = 'fahadadeel'
import jpype

class AddImage:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.TextAnchorType=jpype.JClass("com.aspose.slides.TextAnchorType")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.TextVerticalType=jpype.JClass("com.aspose.slides.TextVerticalType")
        self.ImageIO=jpype.JClass("javax.ImageIO")
        self.Color=jpype.JClass("java.awt.Color")


    def main(self):

        pres = self.Presentation()

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
        save_format = SaveFormat
        pres.save(self.dataDir + "AddImage.pptx", save_format.Pptx)

        print "Added image, please check the output file."
        
        
class AlignText:
    
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.TextAnchorType=jpype.JClass("com.aspose.slides.TextAnchorType")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.TextVerticalType=jpype.JClass("com.aspose.slides.TextVerticalType")
        self.ImageIO=jpype.JClass("javax.ImageIO")
        self.Color=jpype.JClass("java.awt.Color")

    def main(self):
                
        pres = self.Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Define columns with widths and rows with heights
        dbl_cols = [120, 120, 120, 120]
        dbl_rows = [100, 100, 100, 100]

        # Add table shape to slide
        tbl = slide.getShapes().addTable(100, 50, dbl_cols, dbl_rows)

        # Add text to the merged cell
        tbl.getRows().get_Item(0).get_Item(1).getTextFrame().setText("10")
        tbl.getRows().get_Item(0).get_Item(2).getTextFrame().setText("20")
        tbl.getRows().get_Item(0).get_Item(3).getTextFrame().setText("30")

        # Accessing the text frame
        txt_frame = tbl.getRows().get_Item(0).get_Item(0).getTextFrame()

        # Create the Paragraph object for text frame
        para = txt_frame.getParagraphs().get_Item(0)

        # Create Portion object for paragraph

        fillType=FillType()
        color=Color()

        portion = para.getPortions().get_Item(0)
        portion.setText("Text here")
        portion.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        portion.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Aligning the text vertically
        textVerticalType=TextVerticalType()
        cell = tbl.getRows().get_Item(0).get_Item(0)
        textAnchorType=TextAnchorType()
        cell.setTextAnchorType(textAnchorType.Center)
        cell.setTextVerticalType(textVerticalType.Vertical270)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "AlignText.pptx", save_format.Pptx)

        print "Aligned Text, please check the output file."


class CloneRowColumn:
    
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.Color=jpype.JClass("java.awt.Color")

    def main(self):
             
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Define columns with widths and rows with heights
        dbl_cols = [50, 50, 50]
        dbl_rows = [50, 30, 30, 30]

        # Add table shape to slide
        tbl = sld.getShapes().addTable(100, 50, dbl_cols, dbl_rows)

        fill_type = self.FillType
        color = self.Color

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
        save_format = self.SaveFormat
        pres.save(self.dataDir + "CloneRowColumn.pptx", save_format.Pptx)

        print "Cloned Row & Column from table, please check the output file."
        
class CreateTable:
    
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.Color=jpype.JClass("java.awt.Color")

    def main(self):
                
        pres =  self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Define columns with widths and rows with heights
        dblCols = [50, 50, 50]
        dblRows = [50, 30, 30, 30, 30]

        # Add table shape to slide
        tbl = sld.getShapes().addTable(100, 50, dblCols, dblRows)

        fill_type =  self.FillType
        color =  self.Color

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

                cell+=1
            
            row+=1
        

        # Merge cells 1 & 2 of row 1
        tbl.mergeCells(tbl.getRows().get_Item(0).get_Item(0), tbl.getRows().get_Item(1).get_Item(0), False)

        # Add text to the merged cell
        tbl.getRows().get_Item(0).get_Item(0).getTextFrame().setText("Merged Cells")

        # Write the presentation as a PPTX file
        save_format =  SaveFormat
        pres.save(self.dataDir + "CreateTable.pptx", save_format.Pptx)

        print "Created table, please check the output file."
        
class RemoveRowColumn:
    
    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.Color=jpype.JClass("java.awt.Color")

    def main(self):
        
        pres = self.Presentation()

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        col_width = [100, 50, 30]
        row_height = [30, 50, 30]

        table = slide.getShapes().addTable(100, 100, col_width, row_height)

        table.getRows().removeAt(1, False)
        table.getColumns().removeAt(1, False)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "RemoveRowColumn.pptx", save_format.Pptx)

        print "Removed Row & Column from table, please check the output file."
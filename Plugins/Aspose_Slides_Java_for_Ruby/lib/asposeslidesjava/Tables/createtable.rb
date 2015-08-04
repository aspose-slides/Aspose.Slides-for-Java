module Asposeslidesjava
  module CreateTable
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Tables/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Define columns with widths and rows with heights
        dblCols = [50, 50, 50]
        dblRows = [50, 30, 30, 30, 30]

        # Add table shape to slide
        tbl = sld.getShapes().addTable(100, 50, dblCols, dblRows)

        fill_type = Rjb::import('com.aspose.slides.FillType')    
        color = Rjb::import('java.awt.Color')    

        # Set border format for each cell
        row = 0
        while row < tbl.getRows().size()
            cell = 0
            while cell < tbl.getRows().get_Item(row).size()
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
                
                cell +=1
            end
            row +=1    
        end

        # Merge cells 1 & 2 of row 1
        tbl.mergeCells(tbl.getRows().get_Item(0).get_Item(0), tbl.getRows().get_Item(1).get_Item(0), false)

        # Add text to the merged cell
        tbl.getRows().get_Item(0).get_Item(0).getTextFrame().setText("Merged Cells")

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "CreateTable.pptx", save_format.Pptx)

        puts "Created table, please check the output file."
    end
  end
end

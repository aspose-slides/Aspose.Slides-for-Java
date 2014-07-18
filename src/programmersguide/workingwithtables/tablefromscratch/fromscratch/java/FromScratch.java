/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtables.tablefromscratch.fromscratch.java;

import com.aspose.slides.*;

import java.awt.*;

public class FromScratch
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtables/tablefromscratch/fromscratch/data/";

        //Instantiate Presentation class that represents PPTX file
        Presentation pres = new Presentation();

        //Access first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Define columns with widths and rows with heights
        double[] dblCols = { 50, 50, 50 };
        double[] dblRows = { 50, 30, 30, 30, 30 };

        //Add table shape to slide
        ITable tbl = sld.getShapes().addTable(100, 50, dblCols, dblRows);

        //Set border format for each cell
        for(int row = 0; row < tbl.getRows().size(); row++)
        {
            for (int cell = 0; cell < tbl.getRows().get_Item(row).size(); cell++)
            {
                tbl.getRows().get_Item(row).get_Item(cell).getBorderTop().getFillFormat().setFillType(FillType.Solid);
                tbl.getRows().get_Item(row).get_Item(cell).getBorderTop().getFillFormat().getSolidFillColor().setColor(Color.RED);
                tbl.getRows().get_Item(row).get_Item(cell).getBorderTop().setWidth(5);

                tbl.getRows().get_Item(row).get_Item(cell).getBorderBottom().getFillFormat().setFillType(FillType.Solid);
                tbl.getRows().get_Item(row).get_Item(cell).getBorderBottom().getFillFormat().getSolidFillColor().setColor(Color.RED);
                tbl.getRows().get_Item(row).get_Item(cell).getBorderBottom().setWidth(5);

                tbl.getRows().get_Item(row).get_Item(cell).getBorderLeft().getFillFormat().setFillType(FillType.Solid);
                tbl.getRows().get_Item(row).get_Item(cell).getBorderLeft().getFillFormat().getSolidFillColor().setColor(Color.RED);
                tbl.getRows().get_Item(row).get_Item(cell).getBorderLeft().setWidth(5);

                tbl.getRows().get_Item(row).get_Item(cell).getBorderRight().getFillFormat().setFillType(FillType.Solid);
                tbl.getRows().get_Item(row).get_Item(cell).getBorderRight().getFillFormat().getSolidFillColor().setColor(Color.RED);
                tbl.getRows().get_Item(row).get_Item(cell).getBorderRight().setWidth(5);
            }
        }
        //Merge cells 1 & 2 of row 1
        tbl.mergeCells(tbl.getRows().get_Item(0).get_Item(0), tbl.getRows().get_Item(1).get_Item(0), false);

        //Add text to the merged cell
        tbl.getRows().get_Item(0).get_Item(0).getTextFrame().setText("Merged Cells");

        //Save PPTX to Disk
        pres.save(dataDir+ "table.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}





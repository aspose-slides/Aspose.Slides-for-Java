package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class CreateATableFromScratchInASlide
{
    public static void main(String[] args)
    {

        //ExStart:CreateATableFromScratchInASlide

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();
        final String outPath = RunExamples.getOutPath();

        // Instantiate Presentation class that represents PPTX file
        Presentation pres = new Presentation();
        try
        {
            // Access first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Define columns with widths and rows with heights
            double[] dblCols = {50, 50, 50};
            double[] dblRows = {50, 30, 30, 30, 30};

            // Add table shape to slide
            ITable tbl = sld.getShapes().addTable(100, 50, dblCols, dblRows);

            // Set border format for each cell
            for (int row = 0; row < tbl.getRows().size(); row++)
            {
                for (int cell = 0; cell < tbl.getRows().get_Item(row).size(); cell++)
                {
                    tbl.get_Item(cell, row).getCellFormat().getBorderTop().getFillFormat().setFillType(FillType.Solid);
                    tbl.get_Item(cell, row).getCellFormat().getBorderTop().getFillFormat().getSolidFillColor().setColor(Color.RED);
                    tbl.get_Item(cell, row).getCellFormat().getBorderTop().setWidth(5);

                    tbl.get_Item(cell, row).getCellFormat().getBorderBottom().getFillFormat().setFillType((FillType.Solid));
                    tbl.get_Item(cell, row).getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor().setColor(Color.RED);
                    tbl.get_Item(cell, row).getCellFormat().getBorderBottom().setWidth(5);

                    tbl.get_Item(cell, row).getCellFormat().getBorderLeft().getFillFormat().setFillType(FillType.Solid);
                    tbl.get_Item(cell, row).getCellFormat().getBorderLeft().getFillFormat().getSolidFillColor().setColor(Color.RED);
                    tbl.get_Item(cell, row).getCellFormat().getBorderLeft().setWidth(5);

                    tbl.get_Item(cell, row).getCellFormat().getBorderRight().getFillFormat().setFillType(FillType.Solid);
                    tbl.get_Item(cell, row).getCellFormat().getBorderRight().getFillFormat().getSolidFillColor().setColor(Color.RED);
                    tbl.get_Item(cell, row).getCellFormat().getBorderRight().setWidth(5);
                }
            }
            // Merge cells 1 & 2 of row 1
            tbl.mergeCells(tbl.get_Item(0, 0), tbl.get_Item(1, 1), false);

            // Add text to the merged cell
            tbl.get_Item(0, 0).getTextFrame().setText("Merged Cells");

            // Save PPTX to Disk
            pres.save(outPath + "table.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CreateATableFromScratchInASlide


    }
}


package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;





public class CellSplit
{
    public static void main(String[] args)
    {
        //ExStart:CellSplit
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();

        // Instantiate Presentation class that represents PPTX file
        Presentation presentation = new Presentation();
        try
        {
            // Access first slide
            ISlide slide = presentation.getSlides().get_Item(0);

            // Define columns with widths and rows with heights
            double[] dblCols = {70, 70, 70, 70};
            double[] dblRows = {70, 70, 70, 70};

            // Add table shape to slide
            ITable table = slide.getShapes().addTable(100, 50, dblCols, dblRows);

            // Set border format for each cell
            for (IRow row : table.getRows())
            {
                for (ICell cell : (Iterable<ICell>) row)
                {
                    cell.getCellFormat().getBorderTop().getFillFormat().setFillType(FillType.Solid);
                    cell.getCellFormat().getBorderTop().getFillFormat().getSolidFillColor().setColor(Color.RED);
                    cell.getCellFormat().getBorderTop().setWidth(5);


                    cell.getCellFormat().getBorderBottom().getFillFormat().setFillType(FillType.Solid);
                    cell.getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor().setColor(Color.RED);
                    cell.getCellFormat().getBorderBottom().setWidth(5);

                    cell.getCellFormat().getBorderLeft().getFillFormat().setFillType(FillType.Solid);
                    cell.getCellFormat().getBorderLeft().getFillFormat().getSolidFillColor().setColor(Color.RED);
                    cell.getCellFormat().getBorderLeft().setWidth(5);

                    cell.getCellFormat().getBorderRight().getFillFormat().setFillType(FillType.Solid);
                    cell.getCellFormat().getBorderRight().getFillFormat().getSolidFillColor().setColor(Color.RED);
                    cell.getCellFormat().getBorderRight().setWidth(5);

                }
            }

            // Merging cells (1, 1) x (2, 1)
            table.mergeCells(table.get_Item(1, 1), table.get_Item(2, 1), false);

            // Merging cells (1, 2) x (2, 2)
            table.mergeCells(table.get_Item(1, 2), table.get_Item(2, 2), false);

            // split cell (1, 1). 
            table.get_Item(1, 1).splitByWidth(table.get_Item(2, 1).getWidth() / 2);

            //Write PPTX to Disk
            presentation.save(dataDir + "CellSplit_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:CellSplit
    }
}



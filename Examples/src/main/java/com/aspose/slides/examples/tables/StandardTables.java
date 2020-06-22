package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class StandardTables
{
    public static void main(String[] args)
    {
        //ExStart:StandardTables
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();

        // Instantiate Presentation class that represents PPTX file
        Presentation pres = new Presentation();
        try
        {

            // Access first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Define columns with widths and rows with heights
            double[] dblCols = {70, 70, 70, 70};
            double[] dblRows = {70, 70, 70, 70};

            // Add table shape to slide
            ITable tbl = sld.getShapes().addTable(100, 50, dblCols, dblRows);

            // Set border format for each cell
            for (IRow row : tbl.getRows())
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

            //Write PPTX to Disk
            pres.save(dataDir + "StandardTables_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:StandardTables
    }
}



package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class GetEffectiveValuesOfTable
{
    public static void main(String[] args)
    {

        //ExStart:GetEffectiveValuesOfTable

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();

        Presentation pres = new Presentation(dataDir + "pres.pptx");
        try
        {
            ITable tbl = (ITable) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            ITableFormatEffectiveData tableFormatEffective = tbl.getTableFormat().getEffective();
            IRowFormatEffectiveData rowFormatEffective = tbl.getRows().get_Item(0).getRowFormat().getEffective();
            IColumnFormatEffectiveData columnFormatEffective = tbl.getColumns().get_Item(0).getColumnFormat().getEffective();
            ICellFormatEffectiveData cellFormatEffective = tbl.get_Item(0, 0).getCellFormat().getEffective();

            IFillFormatEffectiveData tableFillFormatEffective = tableFormatEffective.getFillFormat();
            IFillFormatEffectiveData rowFillFormatEffective = rowFormatEffective.getFillFormat();
            IFillFormatEffectiveData columnFillFormatEffective = columnFormatEffective.getFillFormat();
            IFillFormatEffectiveData cellFillFormatEffective = cellFormatEffective.getFillFormat();

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetEffectiveValuesOfTable

    }
}


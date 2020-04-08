package com.aspose.slides.examples.Slides.Table;

import com.aspose.slides.ICellFormatEffectiveData;
import com.aspose.slides.IColumnFormatEffectiveData;
import com.aspose.slides.IFillFormatEffectiveData;
import com.aspose.slides.IRowFormatEffectiveData;
import com.aspose.slides.ITable;
import com.aspose.slides.ITableFormatEffectiveData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;


public class GetEffectiveValuesOfTable {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetEffectiveValuesOfTable.class);

        //ExStart:GetEffectiveValuesOfTable
        //Instantiate Presentation class object
        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        try {
            ITable tbl = (ITable) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            ITableFormatEffectiveData tableFormatEffective = tbl.getTableFormat().getEffective();
            IRowFormatEffectiveData rowFormatEffective = tbl.getRows().get_Item(0).getRowFormat().getEffective();
            IColumnFormatEffectiveData columnFormatEffective = tbl.getColumns().get_Item(0).getColumnFormat().getEffective();
            ICellFormatEffectiveData cellFormatEffective = tbl.get_Item(0, 0).getCellFormat().getEffective();

            IFillFormatEffectiveData tableFillFormatEffective = tableFormatEffective.getFillFormat();
            IFillFormatEffectiveData rowFillFormatEffective = rowFormatEffective.getFillFormat();
            IFillFormatEffectiveData columnFillFormatEffective = columnFormatEffective.getFillFormat();
            IFillFormatEffectiveData cellFillFormatEffective = cellFormatEffective.getFillFormat();
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetEffectiveValuesOfTable
    }
}

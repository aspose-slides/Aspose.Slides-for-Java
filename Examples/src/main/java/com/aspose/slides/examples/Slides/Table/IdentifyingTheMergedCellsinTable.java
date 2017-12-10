package com.aspose.slides.examples.Slides.Table;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ICell;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class IdentifyingTheMergedCellsinTable {

	public static void main(String[] args) {
                
                //ExStart:IdentifyingTheMergedCellsinTable

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(IdentifyingTheMergedCellsinTable.class);

		Presentation pres = null;
try
{
    pres = new Presentation(dataDir+"SomePresentationWithTable.pptx");

    ITable table = (ITable)pres.getSlides().get_Item(0).getShapes().get_Item(0); // assuming that Slide#0.Shape#0 is a table
    for (int i = 0; i < table.getRows().size(); i++)
    {
        for (int j = 0; j < table.getColumns().size(); j++)
        {
            ICell currentCell = table.getRows().get_Item(i).get_Item(j);
            if (currentCell.isMergedCell())
            {
 System.out.println("Cell " + i + ";" + j +" is a part of merged cell with RowSpan=" + currentCell.getRowSpan() +
                    " and ColSpan=" + currentCell.getColSpan() + " starting from Cell " + currentCell.getFirstRowIndex() +
                    ";" + currentCell.getFirstColumnIndex() + ".");
            }
        }

    }
} finally {
    if (pres != null) {
        pres.dispose();
        pres = null;
    }
}

                        //ExEnd:IdentifyingTheMergedCellsinTable


                
	}

}

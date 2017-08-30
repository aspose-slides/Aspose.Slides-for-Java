package com.aspose.slides.examples.Slides.Table;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class CloneARowOrColumnInATable {

	public static void main(String[] args) {
		//ExStart:CloneARowOrColumnInATable

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CloneARowOrColumnInATable.class);
		
		// Instantiate Presentation class that represents PPTX file
		Presentation pres = new Presentation();

		// Access first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Define columns with widths and rows with heights
		double[] dblCols = { 50, 50, 50 };
		double[] dblRows = { 50, 30, 30, 30 };

		// Add table shape to slide
		ITable tbl = sld.getShapes().addTable(100, 50, dblCols, dblRows);

		// Set border format for each cell
		for (int row = 0; row < tbl.getRows().size(); row++) {
			for (int cell = 0; cell < tbl.getRows().get_Item(row).size(); cell++) {
				tbl.getRows().get_Item(row).get_Item(cell).getBorderTop().getFillFormat().setFillType(FillType.Solid);
				tbl.getRows().get_Item(row).get_Item(cell).getBorderTop().getFillFormat().getSolidFillColor()
						.setColor(Color.RED);
				tbl.getRows().get_Item(row).get_Item(cell).getBorderTop().setWidth(5);

				tbl.getRows().get_Item(row).get_Item(cell).getBorderBottom().getFillFormat()
						.setFillType(FillType.Solid);
				tbl.getRows().get_Item(row).get_Item(cell).getBorderBottom().getFillFormat().getSolidFillColor()
						.setColor(Color.RED);
				tbl.getRows().get_Item(row).get_Item(cell).getBorderBottom().setWidth(5);

				tbl.getRows().get_Item(row).get_Item(cell).getBorderLeft().getFillFormat().setFillType(FillType.Solid);
				tbl.getRows().get_Item(row).get_Item(cell).getBorderLeft().getFillFormat().getSolidFillColor()
						.setColor(Color.RED);
				tbl.getRows().get_Item(row).get_Item(cell).getBorderLeft().setWidth(5);

				tbl.getRows().get_Item(row).get_Item(cell).getBorderRight().getFillFormat().setFillType(FillType.Solid);
				tbl.getRows().get_Item(row).get_Item(cell).getBorderRight().getFillFormat().getSolidFillColor()
						.setColor(Color.RED);
				tbl.getRows().get_Item(row).get_Item(cell).getBorderRight().setWidth(5);
			}
		}

		tbl.getColumns().get_Item(0).get_Item(0).getTextFrame().setText("00");
		tbl.getColumns().get_Item(0).get_Item(1).getTextFrame().setText("01");
		tbl.getColumns().get_Item(0).get_Item(2).getTextFrame().setText("02");
		tbl.getColumns().get_Item(0).get_Item(3).getTextFrame().setText("03");
		tbl.getColumns().get_Item(1).get_Item(0).getTextFrame().setText("10");
		tbl.getColumns().get_Item(2).get_Item(0).getTextFrame().setText("20");
		tbl.getColumns().get_Item(1).get_Item(1).getTextFrame().setText("11");
		tbl.getColumns().get_Item(2).get_Item(1).getTextFrame().setText("21");

		// AddClone adds a row in the end of the table
		tbl.getRows().addClone(tbl.getRows().get_Item(0), false);

		// AddClone adds a column in the end of the table
		tbl.getColumns().addClone(tbl.getColumns().get_Item(0), false);

		// InsertClone adds a row at specific position in a table
		tbl.getRows().insertClone(2, tbl.getRows().get_Item(0), false);

		// InsertClone adds a row at specific position in a table
		tbl.getColumns().insertClone(2, tbl.getColumns().get_Item(0), false);

		// Save PPTX to Disk
		pres.save(dataDir + "Cloning.pptx", SaveFormat.Pptx);
	//ExEnd:CloneARowOrColumnInATable

	}

}

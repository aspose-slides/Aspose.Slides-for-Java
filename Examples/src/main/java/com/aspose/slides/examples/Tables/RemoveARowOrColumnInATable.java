/** 
 * Copyright 2001-2016 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.slides.examples.tables;

import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class RemoveARowOrColumnInATable {

	public static void main(String[] args) {
		// ExStart:

		Presentation pres = new Presentation();

		ISlide slide = pres.getSlides().get_Item(0);
		double[] colWidth = { 100, 50, 30 };
		double[] rowHeight = { 30, 50, 30 };

		ITable table = slide.getShapes().addTable(100, 100, colWidth, rowHeight);

		table.getRows().removeAt(1, false);
		table.getColumns().removeAt(1, false);

		pres.save("TestTable.pptx", SaveFormat.Pptx);

		// ExEnd:

	}

}

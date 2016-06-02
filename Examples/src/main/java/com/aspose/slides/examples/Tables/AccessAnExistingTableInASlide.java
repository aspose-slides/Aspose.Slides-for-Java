/** 
 * Copyright 2001-2016 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.slides.examples.tables;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AccessAnExistingTableInSlide {

	public static void main(String[] args) {

		// ExStart:

		// Instantiate Presentation class that represents PPTX
		Presentation pres = new Presentation("table.pptx");

		// Access the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Initialize null TableEx
		ITable tbl = null;

		// Iterate through the shapes and set a reference to the table found
		for (IShape shp : sld.getShapes())
			if (shp instanceof ITable)
				tbl = (ITable) shp;

		// Set the text of the first column of second row
		tbl.getRows().get_Item(0).get_Item(1).getTextFrame().setText("New");

		// Save the PPTX to Disk
		pres.save("table1.pptx", SaveFormat.Pptx);

		// ExEnd:
	}

}

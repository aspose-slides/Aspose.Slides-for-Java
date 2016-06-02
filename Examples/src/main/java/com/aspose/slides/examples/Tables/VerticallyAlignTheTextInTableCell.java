/** 
 * Copyright 2001-2016 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.slides.examples.tables;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.ICell;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TextAnchorType;
import com.aspose.slides.TextVerticalType;

public class VerticallyAlignTheTextInTableCell {

	public static void main(String[] args) {

		// ExStart:

		// Create an instance of Presentation class
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Define columns with widths and rows with heights
		double[] dblCols = { 120, 120, 120, 120 };
		double[] dblRows = { 100, 100, 100, 100 };

		// Add table shape to slide
		ITable tbl = slide.getShapes().addTable(100, 50, dblCols, dblRows);

		// Add text to the merged cell
		tbl.getRows().get_Item(0).get_Item(1).getTextFrame().setText("10");
		tbl.getRows().get_Item(0).get_Item(2).getTextFrame().setText("20");
		tbl.getRows().get_Item(0).get_Item(3).getTextFrame().setText("30");

		// Accessing the text frame
		ITextFrame txtFrame = tbl.getRows().get_Item(0).get_Item(0).getTextFrame();

		// Create the Paragraph object for text frame
		IParagraph para = txtFrame.getParagraphs().get_Item(0);

		// Create Portion object for paragraph
		IPortion portion = para.getPortions().get_Item(0);
		portion.setText("Text here");
		portion.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
		portion.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);

		// Aligning the text vertically
		ICell cell = tbl.getRows().get_Item(0).get_Item(0);
		cell.setTextAnchorType(TextAnchorType.Center);
		cell.setTextVerticalType(TextVerticalType.Vertical270);

		// Save Presentation
		pres.save("TableCellVertical.pptx", SaveFormat.Pptx);

		// ExEnd:

	}

}

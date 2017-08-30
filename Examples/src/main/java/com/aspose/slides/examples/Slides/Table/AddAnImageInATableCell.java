package com.aspose.slides.examples.Slides.Table;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.FillType;
import com.aspose.slides.IPPImage;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.PictureFillMode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddAnImageInATableCell {

	public static void main(String[] args) throws IOException {
	//ExStart:AddAnImageInATableCell
		
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddAnImageInATableCell.class);
		
		// Instantiate Presentation class Object
		Presentation pres = new Presentation();

		// Access first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Define columns with widths and rows with heights
		double[] dblCols = { 150, 150, 150, 150 };
		double[] dblRows = { 100, 100, 100, 100, 90 };

		// Add table shape to slide
		ITable tbl = sld.getShapes().addTable(50, 50, dblCols, dblRows);

		// Creating a Buffered Image object to hold the image file
		BufferedImage image = null;

		image = ImageIO.read(new File(dataDir + "image.jpg"));
		IPPImage imgx1 = pres.getImages().addImage(image);

		tbl.get_Item(0, 0).getFillFormat().setFillType(FillType.Picture);
		tbl.get_Item(0, 0).getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Stretch);
		tbl.get_Item(0, 0).getFillFormat().getPictureFillFormat().getPicture().setImage(imgx1);

		// Save PPTX to Disk
		pres.save(dataDir + "table.pptx", SaveFormat.Pptx);
	//ExEnd:AddAnImageInATableCell
	}

}

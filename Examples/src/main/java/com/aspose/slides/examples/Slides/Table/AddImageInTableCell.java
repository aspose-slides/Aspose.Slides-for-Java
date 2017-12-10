package com.aspose.slides.examples.Slides.Table;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IPPImage;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.PictureFillMode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AddImageInTableCell {

	public static void main(String[] args) {
                
              //ExStart:AddImageInTableCell

		// The path to the documents directory.
 String dataDir = Utils.getDataDir(AddImageInTableCell.class);

  //Instantiate Presentation class object
   Presentation pres = new Presentation();

   //Access first slide
   ISlide sld = pres.getSlides().get_Item(0);

   //Define columns with widths and rows with heights
   double[] dblCols = { 150, 150, 150, 150 };
   double[] dblRows = { 100, 100, 100, 100, 90 };

   //Add table shape to slide
   ITable tbl = sld.getShapes().addTable(50, 50, dblCols, dblRows);

   //Creating an Image object to hold the image file
   IPPImage imgx = null;
   try {
           imgx = pres.getImages().addImage(new FileInputStream(new File("aspose1.jpg")));
   } catch (IOException e) {
   }

   //Create an IPPImage object using the bitmap object
   IPPImage imgx1 = pres.getImages().addImage(imgx);

   //Add image to first table cell
   tbl.get_Item(0, 0).getFillFormat().setFillType(FillType.Picture);
   tbl.get_Item(0, 0).getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Stretch);
   tbl.get_Item(0, 0).getFillFormat().getPictureFillFormat().setCropRight(-30f);
   tbl.get_Item(0, 0).getFillFormat().getPictureFillFormat().setCropLeft(-30f);
   tbl.get_Item(0, 0).getFillFormat().getPictureFillFormat().setCropBottom(-30f);
   tbl.get_Item(0, 0).getFillFormat().getPictureFillFormat().setCropTop(-30f);
   tbl.get_Item(0, 0).getFillFormat().getPictureFillFormat().getPicture().setImage(imgx);

   //Save PPTX to Disk
   pres.save("D:\\Data\\table.pptx", SaveFormat.Pptx);
//ExEnd:AddImageInTableCell


                
	}

}

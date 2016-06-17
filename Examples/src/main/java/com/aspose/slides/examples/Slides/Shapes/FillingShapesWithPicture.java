package com.aspose.slides.examples.Slides.Shapes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.aspose.slides.FillType;
import com.aspose.slides.IPPImage;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.PictureFillMode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class FillingShapesWithPicture {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FillingShapesWithPicture.class);

		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add AutoShape of rectangle type
		IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 75, 150);

		// Set the fill type to Picture
		shp.getFillFormat().setFillType(FillType.Picture);

		// Set the picture fill mode
		shp.getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Tile);

		// Set the picture
		IPPImage imgx = null;
		try {
			imgx = pres.getImages().addImage(new FileInputStream(new File("aspose1.jpg")));
		} catch (IOException e) {
		}

		shp.getFillFormat().getPictureFillFormat().getPicture().setImage(imgx);

		// Write the PPTX file to disk
		pres.save(dataDir + "RectShpPic.pptx", SaveFormat.Pptx);

	}

}

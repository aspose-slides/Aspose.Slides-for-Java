package com.aspose.slides.examples.Slides.Shapes;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class FillingShapesWithSolidColor {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FillingShapesWithSolidColor.class);

		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add AutoShape of rectangle type
		IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 75, 150);

		// Set the fill type to Solid
		shp.getFillFormat().setFillType(FillType.Solid);

		// Set the color of the rectangle
		shp.getFillFormat().getSolidFillColor().setColor(Color.YELLOW);

		// Write the PPTX file to disk
		pres.save(dataDir + "RectShpSolid.pptx", SaveFormat.Pptx);

	}

}

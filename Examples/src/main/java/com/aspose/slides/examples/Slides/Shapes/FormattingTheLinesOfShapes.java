package com.aspose.slides.examples.Slides.Shapes;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.LineDashStyle;
import com.aspose.slides.LineStyle;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class FormattingTheLinesOfShapes {

	public static void main(String[] args) {
	//ExStart:FormattingTheLinesOfShapes

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FormattingTheLinesOfShapes.class);

		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add AutoShape of rectangle type
		IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 150, 75);

		// Set the fill color of the rectangle shape
		shp.getFillFormat().setFillType(FillType.Solid);
		shp.getFillFormat().getSolidFillColor().setColor(Color.WHITE);

		// Apply some formatting on the line of the rectangle
		shp.getLineFormat().setStyle(LineStyle.ThickThin);
		shp.getLineFormat().setWidth(7);
		shp.getLineFormat().setDashStyle(LineDashStyle.Dash);

		// set the color of the line of rectangle
		shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
		shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);

		// Write the PPTX file to disk
		pres.save(dataDir + "RectShpLn.pptx", SaveFormat.Pptx);
//ExEnd:FormattingTheLinesOfShapes


	}

}

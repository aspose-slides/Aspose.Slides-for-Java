package com.aspose.slides.examples.Slides.Shapes;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class FillingShapesWithPattern {

	public static void main(String[] args) {


	// The path to the documents directory.
		String dataDir = Utils.getDataDir(FillingShapesWithPattern.class);

	//ExStart:FillingShapesWithPattern

		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add AutoShape of rectangle type
		IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 75, 150);

		// Set the fill type to Pattern
		shp.getFillFormat().setFillType(FillType.Pattern);

		// Set the pattern style
		shp.getFillFormat().getPatternFormat().setPatternStyle(PatternStyle.Trellis);

		// Set the pattern back and fore colors
		shp.getFillFormat().getPatternFormat().getBackColor().setColor(Color.LIGHT_GRAY);
		shp.getFillFormat().getPatternFormat().getForeColor().setColor(Color.YELLOW);

		// Write the PPTX file to disk
		pres.save(dataDir + "RectShpPatt.pptx", SaveFormat.Pptx);
	
//ExEnd:FillingShapesWithPattern

	}

}

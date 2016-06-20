package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class ChangingOrderOfShapes {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ChangingOrderOfShapes.class);
		Presentation presentation1 = new Presentation();
		ISlide slide = presentation1.getSlides().get_Item(0);
		IAutoShape shp3 = slide.getShapes().addAutoShape(ShapeType.Rectangle, 200, 365, 400, 150);
		shp3.getFillFormat().setFillType(FillType.NoFill);
		shp3.addTextFrame(" ");
		ITextFrame txtFrame = shp3.getTextFrame();
		IParagraph para = txtFrame.getParagraphs().get_Item(0);
		IPortion portion = para.getPortions().get_Item(0);
		portion.setText("Watermark Text Watermark Text Watermark Text");
		shp3 = slide.getShapes().addAutoShape(ShapeType.Triangle, 200, 365, 400, 150);
		slide.getShapes().reorder(1, shp3);
		;
		presentation1.save(dataDir + "sample_output.pptx", SaveFormat.Pptx);

	}

}

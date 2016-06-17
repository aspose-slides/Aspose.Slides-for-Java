package com.aspose.slides.examples.Slides.Shapes;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class SettingTheAlternativeTextPropertyOfShapes {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTheAlternativeTextPropertyOfShapes.class);
		Presentation presentation1 = new Presentation();
		ISlide slide = presentation1.getSlides().get_Item(0);
		IAutoShape shp = slide.getShapes().addAutoShape(ShapeType.Rectangle, 50, 40, 150, 50);
		IAutoShape shp1 = slide.getShapes().addAutoShape(ShapeType.Moon, 160, 40, 150, 50);
		shp.getFillFormat().setFillType(FillType.Solid);
		shp.getFillFormat().getSolidFillColor().setColor(Color.GRAY);
		for (int i = 0; i < slide.getShapes().size(); i++) {
			if (slide.getShapes().get_Item(i) instanceof IAutoShape) {
				IAutoShape ashp = (IAutoShape) slide.getShapes().get_Item(i);
				ashp.setAlternativeText("User Defind");
			}
		}
		presentation1.save(dataDir + "sample_output.pptx", SaveFormat.Pptx);

	}

}

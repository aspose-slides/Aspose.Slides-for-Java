package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class HidingTheShapesFromSlide {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(HidingTheShapesFromSlide.class);
		Presentation presentation1 = new Presentation();
		ISlide slide = presentation1.getSlides().get_Item(0);
		for (int i = 0; i < slide.getShapes().size(); i++) {
			IAutoShape ashp = (IAutoShape) slide.getShapes().get_Item(i);
			ashp.setHidden(true);
		}
		presentation1.save(dataDir + "sample_output.pptx", SaveFormat.Pptx);

	}

}

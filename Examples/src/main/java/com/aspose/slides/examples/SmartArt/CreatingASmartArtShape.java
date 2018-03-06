package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.Utils;

public class CreatingASmartArtShape {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CreatingASmartArtShape.class);
            //ExStart:CreatingASmartArtShape
		// Instantiate Presentation Class
		Presentation pres = new Presentation();

		// Get first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Add Smart Art Shape
		ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.BasicBlockList);

		// Saving presentation
		pres.save(dataDir + "SimpleSmartArt.pptx", SaveFormat.Pptx);
            //ExEnd:CreatingASmartArtShape

	}

}

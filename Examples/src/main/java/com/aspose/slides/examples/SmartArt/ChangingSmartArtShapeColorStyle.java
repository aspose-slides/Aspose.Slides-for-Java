package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtColorType;
import com.aspose.slides.examples.Utils;

public class ChangingSmartArtShapeColorStyle {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ChangingSmartArtShapeColorStyle.class);
                  // ExStart:ChangingSmartArtShapeColorStyle
		// Instantiate Presentation Class
		Presentation pres = new Presentation(dataDir + "SimpleSmartArt.pptx");

		// Get first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Traverse through every shape inside first slide
		for (IShape shape : slide.getShapes()) {
			// Check if shape is of SmartArt type
			if (shape instanceof ISmartArt) {
				// Typecast shape to SmartArtEx
				ISmartArt smart = (ISmartArt) shape;

				// Checking SmartArt color type
				if (smart.getColorStyle() == SmartArtColorType.ColoredFillAccent1) {
					// Changing SmartArt color type
					smart.setColorStyle(SmartArtColorType.ColorfulAccentColors);
				}
			}
		}
		// Saving presentation
		pres.save(dataDir + "ChangeSmartArtColorStyle.pptx", SaveFormat.Pptx);

	//ExEnd:ChangingSmartArtShapeColorStyle
         }

}

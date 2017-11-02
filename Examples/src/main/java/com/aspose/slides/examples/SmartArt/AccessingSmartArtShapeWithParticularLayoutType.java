package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.Utils;

public class AccessingSmartArtShapeWithParticularLayoutType {

	public static void main(String[] args) {
                   //ExEnd:AccessingSmartArtShapeWithParticularLayoutType
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AccessingSmartArtShapeWithParticularLayoutType.class);

		// Instantiate Presentation Class
		Presentation pres = new Presentation(dataDir + "SmartArtNode.pptx");

		// Get first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Traverse through every shape inside first slide
		for (IShape shape : slide.getShapes()) {
			// Check if shape is of SmartArt type
			if (shape instanceof ISmartArt) {
				// Typecast shape to SmartArtEx
				ISmartArt smart = (ISmartArt) shape;

				// Checking SmartArt Layout
				if (smart.getLayout() == SmartArtLayoutType.BasicBlockList) {
					System.out.print("Do some thing here....");
				}

			}
		}

		// Saving presentation
		pres.save(dataDir + "SimpleSmartArt.pptx", SaveFormat.Pptx);

	//ExEnd:AccessingSmartArtShapeWithParticularLayoutType
          }

}

package com.aspose.slides.examples.Slides.Rendering;

import java.io.FileOutputStream;
import java.io.IOException;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class GeneratingSVGImageFromSlide {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(GeneratingSVGImageFromSlide.class);

		// Instantiate a Presentation object that represents a PPTX file
		Presentation pres = new Presentation(dataDir + "ThumbnailFromSlide.pptx");

		// Getting last slide index
		int lastSlidePosition = pres.getSlides().size();
		ISlide slide = null;

		// Iterating through every presentation slide and generating SVG image
		for (int i = 0; i < lastSlidePosition; i++) {
			// Accessing Slides
			slide = pres.getSlides().get_Item(i);

			// Getting and saving the slide SVG image
			try {
				slide.writeAsSvg(new FileOutputStream(dataDir + "SvgImage" + i + ".svg"));
			} catch (IOException e) {
			}

		}
	}

}

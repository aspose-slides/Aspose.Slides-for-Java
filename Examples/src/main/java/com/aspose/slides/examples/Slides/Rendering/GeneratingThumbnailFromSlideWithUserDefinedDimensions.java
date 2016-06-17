package com.aspose.slides.examples.Slides.Rendering;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class GeneratingThumbnailFromSlideWithUserDefinedDimensions {

	public static void main(String[] args) {
		 
		// The path to the documents directory.
	    String dataDir = Utils.getDataDir(GeneratingThumbnailFromSlideWithUserDefinedDimensions.class);

		// Instantiate a Presentation class that represents the presentation file
		Presentation pres = new Presentation(dataDir + "ThumbnailWithUserDefinedDimensions.pptx");

		// Access the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// User defined dimension
		int desiredX = 1200;
		int desiredY = 800;

		// Getting scaled value of X and Y
		float ScaleX = (float) (1.0 / pres.getSlideSize().getSize().getWidth())
				* desiredX;
		float ScaleY = (float) (1.0 / pres.getSlideSize().getSize().getHeight())
				* desiredY;

		// Create a full scale image
		BufferedImage image = sld.getThumbnail(ScaleX, ScaleY);

		// Save the image to disk in JPEG format
		try {
			ImageIO.write(image, "jpeg", new File(dataDir + "ContentBG_tnail.jpg"));
		} catch (IOException e) {
		}

	}
}

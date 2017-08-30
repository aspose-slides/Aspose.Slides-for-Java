package com.aspose.slides.examples.Slides.Shapes;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.aspose.slides.Presentation;
import com.aspose.slides.ShapeThumbnailBounds;
import com.aspose.slides.examples.Utils;

public class GeneratingAThumbnailFromASlideWithUserDefinedScalingFactor {

	public static void main(String[] args) {
//ExStart:GeneratingAThumbnailFromASlideWithUserDefinedScalingFactor

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(GeneratingAThumbnailFromASlideWithUserDefinedScalingFactor.class);

		// Instantiate a Presentation class that represents the presentation file
		Presentation p = new Presentation(dataDir + "Thumbnail.pptx");

		// Create a full scale image
		BufferedImage image = p.getSlides().get_Item(0).getShapes().get_Item(0).getThumbnail(ShapeThumbnailBounds.Shape, 1, 1);
		try {
			// Save the image to disk in PNG format
			ImageIO.write(image, "jpeg", new File(dataDir + "ContentBG_tnail.jpg"));
		} catch (Exception e) {
		}

//ExEnd:GeneratingAThumbnailFromASlideWithUserDefinedScalingFactor
	}

}

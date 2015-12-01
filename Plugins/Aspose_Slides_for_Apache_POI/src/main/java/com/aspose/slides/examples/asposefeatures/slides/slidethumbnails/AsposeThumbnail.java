package com.aspose.slides.examples.asposefeatures.slides.slidethumbnails;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AsposeThumbnail
{
    public static void main(String[] args) throws Exception
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeThumbnail.class);
	
	// Instantiate a Presentation class that represents the PPTX file
	Presentation pres = new Presentation(dataDir + "presentation.pptx");

	// Access the first slide
	ISlide sld = pres.getSlides().get_Item(0);

	// Create a full scale image
	BufferedImage image = sld.getThumbnail(1f, 1f);

	// Save the image to disk in JPEG format
	ImageIO.write(image, "jpeg", new File(dataDir + "AsposeThumbnail.jpg"));

	// Printing the status
	System.out.println("Thumbnail created successfully!");
    }
}

package com.aspose.slides.examples.Slides.Background;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.aspose.slides.BackgroundType;
import com.aspose.slides.FillType;
import com.aspose.slides.IPPImage;
import com.aspose.slides.PictureFillMode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingTheImageAsBackgroundToSlides {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTheImageAsBackgroundToSlides.class);

		// Instantiate the Presentation class that represents the presentation file
		Presentation pres = new Presentation();

		// Set the background with Image
		pres.getSlides().get_Item(0).getBackground().setType(BackgroundType.OwnBackground);
		pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(FillType.Picture);
		pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat()
				.setPictureFillMode(PictureFillMode.Stretch);

		// Set the picture
		IPPImage imgx = null;
		try {
			imgx = pres.getImages().addImage(new FileInputStream(new File("Desert.jpg")));

		} catch (IOException e) {
		}

		// Add image to presentation's images collection
		pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().getPicture().setImage(imgx);

		// Write the presentation to disk
		pres.save(dataDir + "ContentBG_Img.pptx", SaveFormat.Pptx);

	}

}

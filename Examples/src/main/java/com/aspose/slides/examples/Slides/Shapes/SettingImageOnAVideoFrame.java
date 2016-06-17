package com.aspose.slides.examples.Slides.Shapes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.aspose.slides.IPPImage;
import com.aspose.slides.ISlide;
import com.aspose.slides.IVideoFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingImageOnAVideoFrame {

	public static void main(String[] args) throws FileNotFoundException {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingImageOnAVideoFrame.class);
		// Create an instance of Presentation class
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add Video Frame
		IVideoFrame vf = sld.getShapes().addVideoFrame(50, 150, 300, 150, dataDir + "Wildlife.mp4");

		// Set Image
		IPPImage img = null;
		img = pres.getImages().addImage(new FileInputStream(new File(dataDir + "Sample.jpg")));
		vf.getPictureFormat().getPicture().setImage(img);

		// Write the PPTX file to disk
		pres.save(dataDir + "Test.pptx", SaveFormat.Pptx);
	}

}

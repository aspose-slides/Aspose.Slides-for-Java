package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.AudioVolumeMode;
import com.aspose.slides.ISlide;
import com.aspose.slides.IVideoFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.VideoPlayModePreset;
import com.aspose.slides.examples.Utils;

public class AddingVideoFramesToSlides {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingVideoFramesToSlides.class);

		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add Video Frame
		IVideoFrame vf = sld.getShapes().addVideoFrame(50, 150, 300, 150, dataDir + "Wildlife.mp4");

		// Set Play Mode and Volume of the Video
		vf.setPlayMode(VideoPlayModePreset.Auto);
		vf.setVolume(AudioVolumeMode.Loud);

		// Write the PPTX file to disk
		pres.save(dataDir + "VideoFrame.pptx", SaveFormat.Pptx);

	}

}

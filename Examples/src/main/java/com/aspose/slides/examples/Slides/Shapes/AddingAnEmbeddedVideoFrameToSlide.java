package com.aspose.slides.examples.Slides.Shapes;

import java.io.File;
import java.io.FileInputStream;

import com.aspose.slides.AudioVolumeMode;
import com.aspose.slides.ISlide;
import com.aspose.slides.IVideo;
import com.aspose.slides.IVideoFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.VideoPlayModePreset;
import com.aspose.slides.examples.Utils;

public class AddingAnEmbeddedVideoFrameToSlide {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingAnEmbeddedVideoFrameToSlide.class);

		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		try {
			// Embed video inside presentation
			IVideo vid = pres.getVideos().addVideo(new FileInputStream(new File(dataDir + "Wildlife.mp4")));

			// Add Video Frame
			IVideoFrame vf = sld.getShapes().addVideoFrame(50, 150, 300, 350, vid);

			// Set video to Video Frame
			vf.setEmbeddedVideo(vid);

			// Set Play Mode and Volume of the Video
			vf.setPlayMode(VideoPlayModePreset.Auto);
			vf.setVolume(AudioVolumeMode.Loud);

			// Write the PPTX file to disk
			pres.save(dataDir + "VideoFrame.pptx", SaveFormat.Pptx);
		} catch (Exception e) {
		}

	}

}

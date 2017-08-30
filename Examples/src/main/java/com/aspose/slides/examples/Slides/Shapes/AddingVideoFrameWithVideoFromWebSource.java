package com.aspose.slides.examples.Slides.Shapes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.aspose.slides.IVideoFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.VideoPlayModePreset;
import com.aspose.slides.examples.Utils;

public class AddingVideoFrameWithVideoFromWebSource {

	public static void main(String[] args) {

//ExStart:AddingVideoFrameWithVideoFromWebSource
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingVideoFrameWithVideoFromWebSource.class);

		Presentation pres = new Presentation();
		addVideoFromYouTube(pres, "Tj75Arhq5ho");
		pres.save(dataDir + "out.pptx", SaveFormat.Pptx);
	}

	private static void addVideoFromYouTube(Presentation pres, String videoID) {
		// add videoFrame
		IVideoFrame videoFrame = pres.getSlides().get_Item(0).getShapes().addVideoFrame(10, 10, 427, 240, "https://www.youtube.com/embed/" + videoID);
		videoFrame.setPlayMode(VideoPlayModePreset.Auto);

		// load thumbnail
		String thumbnailUri = "http://img.youtube.com/vi/" + videoID + "/hqdefault.jpg";
		URL url;

		try {
			url = new URL(thumbnailUri);
			videoFrame.getPictureFormat().getPicture().setImage(pres.getImages().addImage(url.openStream()));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//ExEnd:AddingVideoFrameWithVideoFromWebSource
	}
}
package com.aspose.slides.examples.Slides.Media;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.IVideoFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.VideoFrame;
import com.aspose.slides.examples.Utils;

public class ExtractingVideoFromASlide {

	public static void main(String[] args) throws IOException {
		
		// The path to the documents directory.
	    String dataDir = Utils.getDataDir(ExtractingVideoFromASlide.class);
	    
		Presentation template = new Presentation(dataDir + "VideoSample.pptx");

		for (ISlide slide : template.getSlides()) {
			for (IShape shape : template.getSlides().get_Item(0).getShapes()) {
				if (shape instanceof VideoFrame) {
					IVideoFrame vf = (IVideoFrame) shape;
					String type = vf.getEmbeddedVideo().getContentType();
					int ss = type.lastIndexOf('-');
					byte[] buffer = vf.getEmbeddedVideo().getBinaryData();
					
					//Get File Extension
					int charIndex = type.indexOf("/");
					type = type.substring(charIndex + 1);
					
					FileOutputStream fop = new FileOutputStream(dataDir + "testing2." + type);
					fop.write(buffer);
					fop.flush();
					fop.close();
				}
			}
		}
	}

}

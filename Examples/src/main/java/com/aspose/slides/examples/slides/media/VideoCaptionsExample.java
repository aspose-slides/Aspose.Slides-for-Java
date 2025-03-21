package com.aspose.slides.examples.slides.media;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class VideoCaptionsExample 
{
    public static void main(String[] args)
    {
        String mediaFile = RunExamples.getDataDir_Slides_Presentations_Media() + "sample_bunny.mp4";
        String trackFile = RunExamples.getDataDir_Slides_Presentations_Media() + "bunny.vtt";
        String outCaption = RunExamples.getOutPath() + "Caption_out.vtt";
        String outAddPath = RunExamples.getOutPath() + "VideoCaptionAdd_out.pptx";
        String outRemovePath = RunExamples.getOutPath() + "VideoCaptionRemove_out.pptx";

        //ExStart:VideoCaptionsExample
        // Add captions to a VideoFrame
        Presentation pres = new Presentation();
        try {
            IVideo video = pres.getVideos().addVideo(Files.readAllBytes(Paths.get(mediaFile)));
            IVideoFrame videoFrame = pres.getSlides().get_Item(0).getShapes().addVideoFrame(0, 0, 100, 100, video);

            // Adds the new captions track from file
            videoFrame.getCaptionTracks().add("New track", trackFile);

            pres.save(outAddPath, SaveFormat.Pptx);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pres != null) pres.dispose();
        }

        // Extract captions from a VideoFrame
        Presentation pres1 = new Presentation(outAddPath);
        try {
            IVideoFrame videoFrame = (IVideoFrame) pres1.getSlides().get_Item(0).getShapes().get_Item(0);
            if (videoFrame != null) {
                for (ICaptions captionTrack : videoFrame.getCaptionTracks()) {
                    // Extracts the captions binary data and saves theme to the file
                    FileOutputStream fos = new FileOutputStream(outCaption);
                    fos.write(captionTrack.getBinaryData());
                    fos.close();
                }

                // Removes all captions from the VideoFrame
                videoFrame.getCaptionTracks().clear();

                pres1.save(outRemovePath, SaveFormat.Pptx);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if (pres1 != null) pres1.dispose();
        }
        //ExEnd:VideoCaptionsExample
    }
}

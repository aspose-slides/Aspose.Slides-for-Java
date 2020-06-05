package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class EmbeddedVideoFrame
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //ExStart:EmbeddedVideoFrame
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();
        String videoDir = RunExamples.getDataDir_Video();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();
        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Embedd vide inside presentation
            IVideo vid = pres.getVideos().addVideo(new FileInputStream(videoDir + "Wildlife.mp4"));

            // Add Video Frame
            IVideoFrame vf = sld.getShapes().addVideoFrame(50, 150, 300, 350, vid);

            // Set video to Video Frame
            vf.setEmbeddedVideo(vid);

            // Set Play Mode and Volume of the Video
            vf.setPlayMode(VideoPlayModePreset.Auto);
            vf.setVolume(AudioVolumeMode.Loud);

            // Write the PPTX file to disk
            pres.save(dataDir + "VideoFrame_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:EmbeddedVideoFrame
    }
}

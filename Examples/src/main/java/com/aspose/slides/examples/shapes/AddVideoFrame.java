package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class AddVideoFrame
{
    public static void main(String[] args)
    {
        //ExStart:AddVideoFrame
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate PrseetationEx class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add Video Frame
            IVideoFrame vf = sld.getShapes().addVideoFrame(50, 150, 300, 150, dataDir + "video1.avi");

            // Set Play Mode and Volume of the Video
            vf.setPlayMode(VideoPlayModePreset.Auto);
            vf.setVolume(AudioVolumeMode.Loud);

            //Write the PPTX file to disk
            pres.save(dataDir + "VideoFrame_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddVideoFrame
    }
}

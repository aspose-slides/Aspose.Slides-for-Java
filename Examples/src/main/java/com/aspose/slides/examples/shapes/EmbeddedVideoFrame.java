/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

import java.io.File;
import java.io.FileInputStream;

public class EmbeddedVideoFrame
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(EmbeddedVideoFrame.class);

        //Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();

//Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        try{
        //Embedd video inside presentation
            IVideo vid = pres.getVideos().addVideo(new FileInputStream(new File(dataDir+ "Wildlife.mp4")));

        //Add Video Frame
            IVideoFrame vf = sld.getShapes().addVideoFrame(50, 150, 300, 350, vid);

        //Set video to Video Frame
            vf.setEmbeddedVideo(vid);

        //Set Play Mode and Volume of the Video
            vf.setPlayMode (VideoPlayModePreset.Auto);
            vf.setVolume(AudioVolumeMode.Loud);

        //Write the PPTX file to disk
            pres.save(dataDir+ "VideoFrame.pptx", SaveFormat.Pptx);
        }
        catch(Exception e){}
        System.out.println("Program executed successfully");
        
    }
}





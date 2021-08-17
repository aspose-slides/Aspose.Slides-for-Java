package com.aspose.slides.examples.presentations.conversion;/*
 * Copyright (c) 2009-2021 Aspose Pty Ltd. All Rights Reserved.
 */

import com.aspose.slides.GifOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;

public class ConvertToGif
{
    //ExStart:ConvertToGif
    public static void main(String[] args)
    {
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Conversion();

        // The path to output file
        String outPath = RunExamples.getOutPath() + "ConvertToGif.gif";

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "ConvertToGif.pptx");
        try {
            GifOptions gifOptions = new GifOptions();
            gifOptions.setFrameSize(new Dimension(540, 480)); // the size of the resulted GIF
            gifOptions.setDefaultDelay(1500); // how long each slide will be showed until it will be changed to the next one
            gifOptions.setTransitionFps(60); // increase FPS to better transition animation quality
            // Save the presentation to Gif
            presentation.save(outPath, SaveFormat.Gif, gifOptions);
        } finally {
            if (presentation != null) presentation.dispose();
        }
    }
    //ExEnd:ConvertToGif
}

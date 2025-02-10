package com.aspose.slides.examples.slides.media;

import com.aspose.slides.IAudio;
import com.aspose.slides.IAudioFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TrimmingTimeAudioExample
{
    public static void main(String[] args) throws IOException
    {
        String mediaFile = RunExamples.getDataDir_Slides_Presentations_Media() + "audio.m4a";
        String outPath = RunExamples.getOutPath() + "AudioFrameTrim_out.pptx";

        //ExStart:TrimmingTimeAudioExample
        Presentation pres = new Presentation();
        try {
            // Add Audio Frame
            IAudio audio = pres.getAudios().addAudio(Files.readAllBytes(Paths.get(mediaFile)));
            IAudioFrame audioFrame = pres.getSlides().get_Item(0).getShapes().addAudioFrameEmbedded(50, 50, 100, 100, audio);
            // Set the start trimming time 0.5 seconds
            audioFrame.setTrimFromStart(500f);
            // Set the end trimming time 1 seconds
            audioFrame.setTrimFromEnd(1000f);
            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:TrimmingTimeAudioExample
    }
}

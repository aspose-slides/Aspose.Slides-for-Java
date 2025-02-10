package com.aspose.slides.examples.slides.media;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FadeInOutDurationAudioExample
{
    public static void main(String[] args) throws IOException
    {
        String mediaFile = RunExamples.getDataDir_Slides_Presentations_Media() + "audio.m4a";
        String outPath = RunExamples.getOutPath() + "AudioFrameFade_out.pptx";

        //ExStart:FadeInOutDurationAudioExample
        Presentation pres = new Presentation();
        try {
            // Add Audio Frame
            IAudio audio = pres.getAudios().addAudio(Files.readAllBytes(Paths.get(mediaFile)));
            IAudioFrame audioFrame = pres.getSlides().get_Item(0).getShapes().addAudioFrameEmbedded(50, 50, 100, 100, audio);
            // Set the duration of the starting fade for 200ms
            audioFrame.setFadeInDuration(200f);
            // Set the duration of the ending fade for 500ms
            audioFrame.setFadeOutDuration(500f);
            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FadeInOutDurationAudioExample
    }
}

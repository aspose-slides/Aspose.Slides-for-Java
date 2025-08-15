package com.aspose.slides.examples.slides.media;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AudioCaptionsExample 
{
    public static void main(String[] args)
    {
        String mediaFile = RunExamples.getDataDir_Slides_Presentations_Media() + "audio.mp3";
        String trackFile = RunExamples.getDataDir_Slides_Presentations_Media() + "bunny.vtt";
        String outCaption = RunExamples.getOutPath() + "AudioCaption_out.vtt";
        String outAddPath = RunExamples.getOutPath() + "AudioCaptionAdd_out.pptx";
        String outRemovePath = RunExamples.getOutPath() + "AudioCaptionRemove_out.pptx";

        //ExStart:AudioCaptionsExample
        // Add captions to a VideoFrame
        Presentation pres = new Presentation();
        try {
            IAudio audio = pres.getAudios().addAudio(new FileInputStream(mediaFile), LoadingStreamBehavior.KeepLocked);
            IAudioFrame audioFrame = pres.getSlides().get_Item(0).getShapes().addAudioFrameEmbedded(10, 10, 50, 50, audio);

            // Adds the new captions track from file
            audioFrame.getCaptionTracks().add("New track", trackFile);

            pres.save(outAddPath, SaveFormat.Pptx);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pres != null) pres.dispose();
        }

        // Extract captions from a VideoFrame
        Presentation pres1 = new Presentation(outAddPath);
        try {
            IAudioFrame audioFrame = (IAudioFrame)pres1.getSlides().get_Item(0).getShapes().get_Item(0);
            if (audioFrame != null)
            {
                for (ICaptions captionTrack : audioFrame.getCaptionTracks())
                {
                    // Extracts the captions binary data and saves theme to the file
                    FileOutputStream fos = new FileOutputStream(outCaption);
                    fos.write(captionTrack.getBinaryData());
                    fos.close();
                }

                // Removes all captions from the VideoFrame
                audioFrame.getCaptionTracks().clear();

                pres1.save(outRemovePath, SaveFormat.Pptx);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pres1 != null) pres1.dispose();
        }
        //ExEnd:AudioCaptionsExample
    }
}

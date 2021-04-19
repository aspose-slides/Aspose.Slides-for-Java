package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class AddAudioFrame
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //ExStart:AddAudioFrame
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Load the wav sound file to stram
            FileInputStream fstr = new FileInputStream(dataDir + "sampleaudio.wav");

            // Add Audio Frame
            IAudioFrame audioFrame = sld.getShapes().addAudioFrameEmbedded(50, 150, 100, 100, fstr);

            // Set Audio to play across the slides
            audioFrame.setPlayAcrossSlides(true);

            // Set Audio to automatically rewind to start after playing
            audioFrame.setRewindAudio(true);

            // Set Play Mode and Volume of the Audio
            audioFrame.setPlayMode(AudioPlayModePreset.Auto);
            audioFrame.setVolume(AudioVolumeMode.Loud);

            //Write the PPTX file to disk
            pres.save(dataDir + "AudioFrameEmbed_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddAudioFrame
    }
}

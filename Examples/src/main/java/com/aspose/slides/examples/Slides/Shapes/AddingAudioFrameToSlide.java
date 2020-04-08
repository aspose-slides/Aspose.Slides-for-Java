package com.aspose.slides.examples.Slides.Shapes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.aspose.slides.AudioPlayModePreset;
import com.aspose.slides.AudioVolumeMode;
import com.aspose.slides.IAudioFrame;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddingAudioFrameToSlide {

    public static void main(String[] args) throws FileNotFoundException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddingAudioFrameToSlide.class);

        //ExStart:AddingAudioFrameToSlide
        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();
        try {
            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Load the wav sound file to stream
            FileInputStream fstr = new FileInputStream(new File(dataDir + "audio.wav"));
            // Add Audio Frame
            IAudioFrame af = sld.getShapes().addAudioFrameEmbedded(50, 150, 100, 100, fstr);

            // Set Play Mode and Volume of the Audio
            af.setPlayMode(AudioPlayModePreset.Auto);
            af.setVolume(AudioVolumeMode.Loud);

            // Write the PPTX file to disk
            pres.save(dataDir + "AudioFrameEmbed.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddingAudioFrameToSlide
    }

}

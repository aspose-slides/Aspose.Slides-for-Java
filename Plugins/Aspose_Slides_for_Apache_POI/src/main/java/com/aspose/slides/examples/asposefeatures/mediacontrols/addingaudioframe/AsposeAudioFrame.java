package com.aspose.slides.examples.asposefeatures.mediacontrols.addingaudioframe;

import java.io.File;
import java.io.FileInputStream;

import com.aspose.slides.AudioPlayModePreset;
import com.aspose.slides.AudioVolumeMode;
import com.aspose.slides.IAudioFrame;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeAudioFrame
{
    public static void main(String[] args) throws Exception
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeAudioFrame.class);
	
	// Instantiate Prsentation class that represents the PPTX
	Presentation pres = new Presentation();

	// Get the first slide
	ISlide sld = pres.getSlides().get_Item(0);

	// Load the wav sound file to stram
	FileInputStream fstr = new FileInputStream(new File(dataDir + "Bass-Drum.wav"));

	// Add Audio Frame
	IAudioFrame af = sld.getShapes().addAudioFrameEmbedded(50, 150, 100, 100, fstr);

	// Set Play Mode and Volume of the Audio
	af.setPlayMode(AudioPlayModePreset.Auto);
	af.setVolume(AudioVolumeMode.Loud);

	// Write the PPTX file to disk
	pres.save(dataDir + "AsposeAudio.pptx", SaveFormat.Pptx);

	System.out.println("Audio Control Added.");
    }
}
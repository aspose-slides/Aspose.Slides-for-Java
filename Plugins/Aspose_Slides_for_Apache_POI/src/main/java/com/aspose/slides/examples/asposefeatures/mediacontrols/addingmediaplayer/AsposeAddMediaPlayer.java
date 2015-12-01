package com.aspose.slides.examples.asposefeatures.mediacontrols.addingmediaplayer;

import com.aspose.slides.ControlType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeAddMediaPlayer
{
    public static void main(String[] args)
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeAddMediaPlayer.class);
	
	// =================================================
	// Create empty presentation instance
	Presentation newPptx = new Presentation();

	// Adding the Media Player ActiveX control
	newPptx.getSlides().get_Item(0).getControls()
		.addControl(ControlType.WindowsMediaPlayer, 50, 50, 550, 300);

	// Access the Media Player ActiveX control and set the video path
	newPptx.getSlides().get_Item(0).getControls().get_Item(0).getProperties()
		.set_Item("URL", "Wildlife.wmv");

	// Save the Presentation
	newPptx.save(dataDir + "AsposeMediaPlayer.pptx", SaveFormat.Pptx);

	System.out.println("Media Player Added.");
    }
}
package com.aspose.slides.examples.ActiveXControls;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class LinkingVideoWithMediaPlayerActiveXControl {

	public static void main(String[] args) {

		// The path to the documents directory.
		//ExStart:LinkingVideoWithMediaPlayerActiveXControl
                String dataDir = Utils.getDataDir(LinkingVideoWithMediaPlayerActiveXControl.class);

		// Accessing the presentation with ActiveX controls
		Presentation pres = new Presentation(dataDir + "template.pptx");

		// Create empty presentation instance
		Presentation newPptx = new Presentation();

		// Remove default slide
		newPptx.getSlides().removeAt(0);

		// Clone slide with Media Player ActiveX Control
		newPptx.getSlides().insertClone(0, pres.getSlides().get_Item(0));

		// Access the Media Player ActiveX control and set the video path
		newPptx.getSlides().get_Item(0).getControls().get_Item(0).getProperties().set_Item("URL", "Wildlife.wmv");

		// Save the Presentation
		newPptx.save(dataDir + "Output.pptx", SaveFormat.Pptx);

              //ExEnd:LinkingVideoWithMediaPlayerActiveXControl	
}

}

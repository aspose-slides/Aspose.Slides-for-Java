package com.aspose.slides.examples.Text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class UsingCustomFonts {

	public static void main(String[] args) {
               
 
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(UsingCustomFonts.class);

//ExStart:UsingCustomFonts

		String[] _fontDir = new String[] { "Sample Fonts" };

		// Load the custom font directory fonts
		FontsLoader.loadExternalFonts(_fontDir);

		// Do Some work and perform presentation/slides rendering
		Presentation presentation = new Presentation(dataDir + "DemoFile.pptx");

		// Save the presentation
		presentation.save(dataDir + "output.pptx", SaveFormat.Pptx);

		// Clear Font Cache
		FontsLoader.clearCache();
          
     //ExEnd:UsingCustomFonts

	}

}

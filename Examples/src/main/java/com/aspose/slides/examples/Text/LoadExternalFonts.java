package com.aspose.slides.examples.Text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class LoadExternalFonts {

	public static void main(String[] args) {
            // ExStart:LoadExternalFont
		// The path to the documents directory.
		
         String dataDir = Utils.getDataDir(LoadExternalFonts.class);

	// loading presentation uses SomeFont which is not installed on the system
         final Presentation pres = new Presentation("pres.pptx");
try
{
    // load SomeFont from file into the byte array
    byte[] fontData = File.readAllBytes("fonts\\SomeFont.ttf");
    // load font represented as byte array
    FontsLoader.loadExternalFont(fontData);
    // font SomeFont will be available during the rendering or other operations
         }
        finally { ((IDisposable)pres).dispose(); }
              // ExStart:LoadExternalFont
	
}

}

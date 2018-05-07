package com.aspose.slides.examples.Text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
import com.aspose.slides.ms.System.IDisposable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LoadExternalFonts {

	public static void main(String[] args) throws IOException {
            

		// The path to the documents directory.
		
         String dataDir = Utils.getDataDir(LoadExternalFonts.class);

//ExStart:LoadExternalFonts

	// loading presentation uses SomeFont which is not installed on the system
         final Presentation pres = new Presentation("pres.pptx");
try
{
    // load SomeFont from file into the byte array
         Path path = Paths.get("path/to/file");
    byte[] fontData = Files.readAllBytes(path);
    // load font represented as byte array
    FontsLoader.loadExternalFont(fontData);
    // font SomeFont will be available during the rendering or other operations
         }
        finally { ((IDisposable)pres).dispose(); }
           
   //ExEnd:LoadExternalFonts
	
}

}

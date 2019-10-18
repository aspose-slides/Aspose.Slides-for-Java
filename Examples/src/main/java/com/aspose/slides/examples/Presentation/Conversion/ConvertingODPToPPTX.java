

package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class ConvertingODPToPPTX {

    
    public static void main(String[] args) {
            
                //ExStart:ConvertingODPToPPTX

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ConvertingODPToPPTX.class);

		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "AccessOpenDoc.odp");
		
                
		// Save the presentation to PDF
		pres.save(dataDir + "AccessOpenDoc.pptx", SaveFormat.Pptx);
            //ExEnd:ConvertingODPToPPTX

	}
}

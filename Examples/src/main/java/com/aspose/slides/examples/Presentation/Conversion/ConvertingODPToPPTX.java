package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class ConvertingODPToPPTX {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingODPToPPTX.class);

        //ExStart:ConvertingODPToPPTX
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "AccessOpenDoc.odp");
        try {
            // Save the presentation to PDF
            pres.save(dataDir + "AccessOpenDoc.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingODPToPPTX
    }
}

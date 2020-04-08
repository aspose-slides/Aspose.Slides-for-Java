package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToTIFFWithDefaultSize {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToTIFFWithDefaultSize.class);

        //ExStart:ConvertingPresentationToTIFFWithDefaultSize
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "demo.pptx");
        try {
            // Saving the presentation to TIFF document
            pres.save(dataDir + "demo.tiff", SaveFormat.Tiff);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToTIFFWithDefaultSize
    }

}

package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToXPSWithoutXpsOptions {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToXPSWithoutXpsOptions.class);

        //ExStart:ConvertingPresentationToXPSWithoutXpsOptions
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "demo.pptx");
        try {
            // Saving the presentation to XPS document
            pres.save(dataDir + "demo.xps", SaveFormat.Xps);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToXPSWithoutXpsOptions
    }

}

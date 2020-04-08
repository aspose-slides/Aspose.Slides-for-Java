package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ModifyingBuiltInProperties {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ModifyingBuiltInProperties.class);

        //ExStart:ModifyingBuiltInProperties
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try {
            // Create a reference to IDocumentProperties object associated with Presentation
            IDocumentProperties dp = pres.getDocumentProperties();

            // Set the built-in properties
            dp.setAuthor("Aspose.Slides for Java");
            dp.setTitle("Modifying Presentation Properties");
            dp.setSubject("Aspose Subject");
            dp.setComments("Aspose Description");
            dp.setManager("Aspose Manager");

            // Save your presentation to a file
            pres.save(dataDir + "DocProps.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ModifyingBuiltInProperties
    }

}

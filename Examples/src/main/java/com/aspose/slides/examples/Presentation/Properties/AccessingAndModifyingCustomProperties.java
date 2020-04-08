package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AccessingAndModifyingCustomProperties {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessingAndModifyingCustomProperties.class);

        //ExStart:AccessingAndModifyingCustomProperties
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try {
            // Create a reference to DocumentProperties object associated with Presentation
            IDocumentProperties dp = pres.getDocumentProperties();

            // Access and modify custom properties
            for (int i = 0; i < dp.getCountOfCustomProperties(); i++) {
                // Display names and values of custom properties
                System.out.println("Custom Property Name : " + dp.getCustomPropertyName(i));
                System.out.println("Custom Property Value : " + dp.get_Item(dp.getCustomPropertyName(i)));

                // Modify values of custom properties
                dp.set_Item(dp.getCustomPropertyName(i), "New Value " + (i + 1));
            }
            // Save your presentation to a file
            pres.save(dataDir + "CustomDemoModified.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AccessingAndModifyingCustomProperties
    }

}

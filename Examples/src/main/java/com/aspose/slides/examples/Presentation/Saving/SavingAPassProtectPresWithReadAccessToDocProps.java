package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class SavingAPassProtectPresWithReadAccessToDocProps {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SavingAPassProtectPresWithReadAccessToDocProps.class);

        //ExStart:SavingAPassProtectPresWithReadAccessToDocProps
        // Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();
        try {
            // ....do some work here.....

            // Setting access to document properties in password protected mode
            pres.getProtectionManager().setEncryptDocumentProperties(false);

            // Setting Password
            pres.getProtectionManager().encrypt("pass");

            // Save your presentation to a file
            pres.save(dataDir + "demoPassDocument.pptx", com.aspose.slides.SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SavingAPassProtectPresWithReadAccessToDocProps
    }

}

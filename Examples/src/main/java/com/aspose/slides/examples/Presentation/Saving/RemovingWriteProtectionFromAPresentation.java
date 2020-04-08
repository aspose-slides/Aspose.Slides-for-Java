package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class RemovingWriteProtectionFromAPresentation {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RemovingWriteProtectionFromAPresentation.class);

        //ExStart:RemovingWriteProtectionFromAPresentation
        // Opening the presentation file
        Presentation pres = new Presentation(dataDir + "demoWriteProtected.pptx");
        try {
            // Checking if presentation is write protected
            if (pres.getProtectionManager().isWriteProtected())
                // Removing Write protection
                pres.getProtectionManager().removeWriteProtection();

            // Saving presentation
            pres.save(dataDir + "newDemo.pptx", com.aspose.slides.SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RemovingWriteProtectionFromAPresentation
    }

}

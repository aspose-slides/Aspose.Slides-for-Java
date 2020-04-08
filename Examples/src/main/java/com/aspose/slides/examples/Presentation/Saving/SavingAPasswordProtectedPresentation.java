package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class SavingAPasswordProtectedPresentation {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SavingAPasswordProtectedPresentation.class);

        //ExStart:SavingAPasswordProtectedPresentation
        // Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();
        try {
            // ....do some work here.....

            // Setting Password
            pres.getProtectionManager().encrypt("pass");

            // Save your presentation to a file
            pres.save(dataDir + "demoPass.pptx", com.aspose.slides.SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SavingAPasswordProtectedPresentation
    }

}
package com.aspose.slides.examples.Presentation.Creation;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingDefaultZoomValueForPresentation {

    public static final void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SettingDefaultZoomValueForPresentation.class);

        //ExStart:SettingDefaultZoomValueForPresentation
        // Create an instance of Presentation class
        Presentation pres = new Presentation();
        try {
            // Setting View Properties of Presentation
            pres.getViewProperties().getSlideViewProperties().setScale(50); //zoom value in percentages for slide view
            pres.getViewProperties().getNotesViewProperties().setScale(50); //zoom value in percentages for notes view

            // Write the presentation as a PPTX file
            pres.save(dataDir + "Zoom.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SettingDefaultZoomValueForPresentation
    }

}

package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.LoadFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.Utils;

public class DetectionMicrosoftPowerPoint95presentations {

    public static final void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DetectionMicrosoftPowerPoint95presentations.class);

        //ExStart:DetectionMicrosoftPowerPoint95presentations
        //Code snippet to check whether the presentation format is old Microsoft PowerPoint 95
        boolean isOldFormat = PresentationFactory.getInstance().getPresentationInfo(dataDir + "PowerPoint95.ppt").getLoadFormat() == LoadFormat.Ppt95;
        //ExEnd:DetectionMicrosoftPowerPoint95presentations
    }
}

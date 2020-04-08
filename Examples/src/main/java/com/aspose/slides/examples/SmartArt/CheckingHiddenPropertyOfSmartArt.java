package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.Utils;

public class CheckingHiddenPropertyOfSmartArt {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CheckingHiddenPropertyOfSmartArt.class);

        //ExStart:CheckingHiddenPropertyOfSmartArt
        // Instantiate Presentation class that represents the PPTX file
        Presentation pres = new Presentation();
        try {
            // Add SmartArt RadialCycle
            ISmartArt smart = pres.getSlides().get_Item(0).getShapes().addSmartArt(10, 10, 400, 300, SmartArtLayoutType.RadialCycle);

            // Add node on SmartArt
            ISmartArtNode node = smart.getAllNodes().addNode();

            // Check isHidden property
            boolean hidden = node.isHidden(); // returns true

            if (hidden) {
                // do some actions or notifications
            }

            // Saving Presentation
            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CheckingHiddenPropertyOfSmartArt
    }

}

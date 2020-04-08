package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.Utils;


public class OrganizationChart {
    public static void main(String[] args) {

        String dataDir = Utils.getDataDir(OrganizationChart.class);

        //ExStart:OrganizationChart
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation();
        try {
            ISmartArt smartArt = pres.getSlides().get_Item(0).getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.PictureOrganizationChart);
            pres.save(dataDir + "OrganizationChart.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:OrganizationChart
    }

}
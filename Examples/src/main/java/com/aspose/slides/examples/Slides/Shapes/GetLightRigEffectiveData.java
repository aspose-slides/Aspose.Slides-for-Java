package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IThreeDFormatEffectiveData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;


public class GetLightRigEffectiveData {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetLightRigEffectiveData.class);

        //ExStart:GetLightRigEffectiveData
        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        try {
            IThreeDFormatEffectiveData threeDEffectiveData = pres.getSlides().get_Item(0).getShapes().get_Item(0).getThreeDFormat().getEffective();

            System.out.println("= Effective light rig properties =");
            System.out.println("Type: " + threeDEffectiveData.getLightRig().getLightType());
            System.out.println("Direction: " + threeDEffectiveData.getLightRig().getDirection());
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetLightRigEffectiveData
    }

}

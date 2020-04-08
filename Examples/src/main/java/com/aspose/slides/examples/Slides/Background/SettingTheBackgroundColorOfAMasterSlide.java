package com.aspose.slides.examples.Slides.Background;

import java.awt.Color;

import com.aspose.slides.BackgroundType;
import com.aspose.slides.FillType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingTheBackgroundColorOfAMasterSlide {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SettingTheBackgroundColorOfAMasterSlide.class);

        //ExStart:SettingTheBackgroundColorOfAMasterSlide
        // Instantiate the Presentation class that represents the presentation file
        Presentation pres = new Presentation();
        try {
            // Set the background color of the Master ISlide to Forest Green
            pres.getMasters().get_Item(0).getBackground().setType(BackgroundType.OwnBackground);
            pres.getMasters().get_Item(0).getBackground().getFillFormat().setFillType(FillType.Solid);
            pres.getMasters().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(Color.GREEN);

            // Write the presentation to disk
            pres.save(dataDir + "MasterBG.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SettingTheBackgroundColorOfAMasterSlide
    }

}

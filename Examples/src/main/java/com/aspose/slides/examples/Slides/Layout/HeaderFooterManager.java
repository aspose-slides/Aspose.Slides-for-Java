package com.aspose.slides.examples.Slides.Layout;

import com.aspose.slides.IBaseSlideHeaderFooterManager;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class HeaderFooterManager {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(HeaderFooterManager.class);

        //ExStart:HeaderFooterManager
        // Instantiate Presentation class that represents the presentation file
        Presentation presentation = new Presentation(dataDir + "presentation.ppt");
        try {
            IBaseSlideHeaderFooterManager headerFooterManager = presentation.getSlides().get_Item(0).getHeaderFooterManager();
            if (!headerFooterManager.isFooterVisible()) // Method isFooterVisible is used for indicating that a slide footer placeholder is not present.
            {
                headerFooterManager.setFooterVisibility(true); // Method setFooterVisibility is used for making a slide footer placeholder visible.
            }
            if (!headerFooterManager.isSlideNumberVisible()) // Method isSlideNumberVisible is used for indicating that a slide page number placeholder is not present.
            {
                headerFooterManager.setSlideNumberVisibility(true); // Method setSlideNumberVisibility is used for making a slide page number placeholder visible.
            }
            if (!headerFooterManager.isDateTimeVisible()) // Method isDateTimeVisible is used for indicating that a slide date-time placeholder is not present.
            {
                headerFooterManager.setDateTimeVisibility(true); // Method setFooterVisibility is used for making a slide date-time placeholder visible.
            }
            headerFooterManager.setFooterText("Footer text"); // Method setFooterText is used for setting text to slide footer placeholder.
            headerFooterManager.setDateTimeText("Date and time text"); // Method setDateTimeText is used for setting text to slide date-time placeholder.
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:HeaderFooterManager
    }

}

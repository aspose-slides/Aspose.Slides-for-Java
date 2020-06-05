package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.IBaseSlideHeaderFooterManager;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class HeaderFooterManager
{
    public static void main(String[] args)
    {
        //ExStart:HeaderFooterManager
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Layout();
        Presentation presentation = new Presentation(dataDir + "presentation.ppt");
        try
        {
            IBaseSlideHeaderFooterManager headerFooterManager = presentation.getSlides().get_Item(0).getHeaderFooterManager();
            if (!headerFooterManager.isFooterVisible()) // Property IsFooterVisible is used for indicating that a slide footer placeholder is not present.
            {
                headerFooterManager.setFooterVisibility(true); // Method SetFooterVisibility is used for making a slide footer placeholder visible.
            }
            if (!headerFooterManager.isSlideNumberVisible()) // Property IsSlideNumberVisible is used for indicating that a slide page number placeholder is not present.
            {
                headerFooterManager.setSlideNumberVisibility(true); // Method SetSlideNumberVisibility is used for making a slide page number placeholder visible.
            }
            if (!headerFooterManager.isDateTimeVisible()) // Property IsDateTimeVisible is used for indicating that a slide date-time placeholder is not present.
            {
                headerFooterManager.setDateTimeVisibility(true); // Method SetFooterVisibility is used for making a slide date-time placeholder visible.
            }
            headerFooterManager.setFooterText("Footer text"); // Method SetFooterText is used for setting text to slide footer placeholder.
            headerFooterManager.setDateTimeText("Date and time text"); // Method SetDateTimeText is used for setting text to slide date-time placeholder.


            presentation.save(dataDir + "Presentation.ppt", SaveFormat.Ppt);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }

        //ExEnd:HeaderFooterManager
    }
}

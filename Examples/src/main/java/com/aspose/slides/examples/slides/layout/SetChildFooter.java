package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.IMasterSlideHeaderFooterManager;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;





public class SetChildFooter
{
    public static void main(String[] args)
    {
        //ExStart:SetChildFooter
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Layout();
        Presentation presentation = new Presentation(dataDir + "presentation.ppt");
        try
        {
            IMasterSlideHeaderFooterManager headerFooterManager = presentation.getMasters().get_Item(0).getHeaderFooterManager();
            headerFooterManager.setFooterAndChildFootersVisibility(true); // Method SetFooterAndChildFootersVisibility is used for making a master slide and all child footer placeholders visible.
            headerFooterManager.setSlideNumberAndChildSlideNumbersVisibility(true); // Method SetSlideNumberAndChildSlideNumbersVisibility is used for making a master slide and all child page number placeholders visible.
            headerFooterManager.setDateTimeAndChildDateTimesVisibility(true); // Method SetDateTimeAndChildDateTimesVisibility is used for making a master slide and all child date-time placeholders visible.

            headerFooterManager.setFooterAndChildFootersText("Footer text"); // Method SetFooterAndChildFootersText is used for setting text to master slide and all child footer placeholders.
            headerFooterManager.setDateTimeAndChildDateTimesText("Date and time text"); // Method SetDateTimeAndChildDateTimesText is used for setting text to master slide and all child date-time placeholders.
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }

        //ExEnd:SetChildFooter
    }
}

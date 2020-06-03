package com.aspose.slides.examples.slides.notes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class HeaderAndFooterInNotesSlide
{
    public static void main(String[] args)
    {
        //ExStart:HeaderAndFooterInNotesSlide
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Notes();
        Presentation presentation = new Presentation(dataDir + "presentation.pptx");
        try
        {
            // Change Header and Footer settings for notes master and all notes slides
            IMasterNotesSlide masterNotesSlide = presentation.getMasterNotesSlideManager().getMasterNotesSlide();
            if (masterNotesSlide != null)
            {
                IMasterNotesSlideHeaderFooterManager headerFooterManager = masterNotesSlide.getHeaderFooterManager();

                headerFooterManager.setHeaderAndChildHeadersVisibility(true); // make the master notes slide and all child Footer placeholders visible
                headerFooterManager.setFooterAndChildFootersVisibility(true); // make the master notes slide and all child Header placeholders visible
                headerFooterManager.setSlideNumberAndChildSlideNumbersVisibility(true); // make the master notes slide and all child SlideNumber placeholders visible
                headerFooterManager.setDateTimeAndChildDateTimesVisibility(true); // make the master notes slide and all child Date and time placeholders visible

                headerFooterManager.setHeaderAndChildHeadersText("Header text"); // set text to master notes slide and all child Header placeholders
                headerFooterManager.setFooterAndChildFootersText("Footer text"); // set text to master notes slide and all child Footer placeholders
                headerFooterManager.setDateTimeAndChildDateTimesText("Date and time text"); // set text to master notes slide and all child Date and time placeholders
            }

            // Change Header and Footer settings for first notes slide only
            INotesSlide notesSlide = presentation.getSlides().get_Item(0).getNotesSlideManager().getNotesSlide();
            if (notesSlide != null)
            {
                INotesSlideHeaderFooterManager headerFooterManager = notesSlide.getHeaderFooterManager();
                if (!headerFooterManager.isHeaderVisible())
                    headerFooterManager.setHeaderVisibility(true); // make this notes slide Header placeholder visible

                if (!headerFooterManager.isFooterVisible())
                    headerFooterManager.setFooterVisibility(true); // make this notes slide Footer placeholder visible

                if (!headerFooterManager.isSlideNumberVisible())
                    headerFooterManager.setSlideNumberVisibility(true); // make this notes slide SlideNumber placeholder visible

                if (!headerFooterManager.isDateTimeVisible())
                    headerFooterManager.setDateTimeVisibility(true); // make this notes slide Date-time placeholder visible

                headerFooterManager.setHeaderText("New header text"); // set text to notes slide Header placeholder
                headerFooterManager.setFooterText("New footer text"); // set text to notes slide Footer placeholder
                headerFooterManager.setDateTimeText("New date and time text"); // set text to notes slide Date-time placeholder
            }
            presentation.save(dataDir + "testresult.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }

    }

    //ExEnd:HeaderAndFooterInNotesSlide
}

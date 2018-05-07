package com.aspose.slides.examples.Slides.Notes;

import com.aspose.slides.IMasterNotesSlide;
import com.aspose.slides.IMasterNotesSlideHeaderFooterManager;
import com.aspose.slides.INotesSlide;
import com.aspose.slides.INotesSlideHeaderFooterManager;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class HeaderAndFooterInNotesSlide {
    
public static void main(String[] args) {

  
String dataDir = Utils.getDataDir(HeaderAndFooterInNotesSlide.class);

//ExStart:HeaderAndFooterInNotesSlide

Presentation presentation = new Presentation("presentation.pptx");
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

presentation.save("result.ppt",SaveFormat.Ppt);
}
presentation.dispose();

//ExEnd:HeaderAndFooterInNotesSlide
}
}
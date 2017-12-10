package com.aspose.slides.examples.Slides.Layout;

import com.aspose.slides.IMasterSlideHeaderFooterManager;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SetChildFooterVisible {

	public static void main(String[] args) {
   
         //ExStart:SetChildFooterVisible
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SetChildFooterVisible.class);
               Presentation presentation = new Presentation("presentation.ppt");
try{
    IMasterSlideHeaderFooterManager headerFooterManager = presentation.getMasters().get_Item(0).getHeaderFooterManager();
    headerFooterManager.setFooterAndChildFootersVisibility(true); // Method setFooterAndChildFootersVisibility is used for making a master slide and all child footer placeholders visible.
    headerFooterManager.setSlideNumberAndChildSlideNumbersVisibility(true); // Method setSlideNumberAndChildSlideNumbersVisibility is used for making a master slide and all child page number placeholders visible.
    headerFooterManager.setDateTimeAndChildDateTimesVisibility(true); // Method setDateTimeAndChildDateTimesVisibility is used for making a master slide and all child date-time placeholders visible.

    headerFooterManager.setFooterAndChildFootersText("Footer text"); // Method setFooterAndChildFootersText is used for setting text to master slide and all child footer placeholders.
    headerFooterManager.setDateTimeAndChildDateTimesText("Date and time text"); // Method setDateTimeAndChildDateTimesText is used for setting text to master slide and all child date-time placeholders.
}
finally 
  {
    presentation.dispose();
  }

                  //ExEnd:SetChildFooterVisible
}

}

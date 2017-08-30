package com.aspose.slides.examples.Slides.Background;

import java.awt.Color;

import com.aspose.slides.BackgroundType;
import com.aspose.slides.FillType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingTheBackgroundColorOfANormalSlide {

	public static void main(String[] args) {
		
//ExStart:SettingTheBackgroundColorOfANormalSlide
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTheBackgroundColorOfANormalSlide.class);
		
		// Instantiate the PFresentation class that represents the presentation file
		Presentation pres = new Presentation(dataDir + "MasterBG.pptx");

		// Set the background color of the first ISlide to Blue
		pres.getSlides().get_Item(0).getBackground().setType(BackgroundType.OwnBackground);
		pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(FillType.Solid);
		pres.getSlides().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(Color.BLUE);

		pres.save(dataDir + "ContentBG.pptx", SaveFormat.Pptx);
//ExEnd:SettingTheBackgroundColorOfANormalSlide

	}

}

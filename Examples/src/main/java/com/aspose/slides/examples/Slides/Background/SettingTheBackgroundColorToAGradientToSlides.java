package com.aspose.slides.examples.Slides.Background;

import com.aspose.slides.BackgroundType;
import com.aspose.slides.FillType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TileFlip;
import com.aspose.slides.examples.Utils;

public class SettingTheBackgroundColorToAGradientToSlides {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTheBackgroundColorToAGradientToSlides.class);

		// Instantiate the Presentation class that represents the presentation file
		Presentation pres = new Presentation(dataDir + "MasterBG.pptx");

		// Apply Gradient effect to the Background
		pres.getSlides().get_Item(0).getBackground().setType(BackgroundType.OwnBackground);
		pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(FillType.Gradient);
		pres.getSlides().get_Item(0).getBackground().getFillFormat().getGradientFormat().setTileFlip(TileFlip.FlipBoth);

		// Write the presentation to disk
		pres.save(dataDir + "ContentBG_Grad.pptx", SaveFormat.Pptx);

	}
}

package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.Utils;

public class ChangingLayoutTypeOfAnySmartArt {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ChangingLayoutTypeOfAnySmartArt.class);

		// Instantiate Presentation class that represents the PPTX file
		Presentation pres = new Presentation();

		// Add SmartArt BasicBlockList
		ISmartArt smart = pres.getSlides().get_Item(0).getShapes().addSmartArt(10, 10, 400, 300, SmartArtLayoutType.BasicBlockList);

		// Change LayoutType to BasicProcess
		smart.setLayout(SmartArtLayoutType.BasicProcess);

		// Saving Presentation
		pres.save(dataDir + "output.pptx", SaveFormat.Pptx);

	}

}

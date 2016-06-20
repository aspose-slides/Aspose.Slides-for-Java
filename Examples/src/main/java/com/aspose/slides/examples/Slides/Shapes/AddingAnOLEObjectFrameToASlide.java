package com.aspose.slides.examples.Slides.Shapes;

import java.io.File;
import java.io.FileInputStream;

import com.aspose.slides.IOleObjectFrame;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddingAnOLEObjectFrameToASlide {

	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingAnOLEObjectFrameToASlide.class);

		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		// Access the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Load an Excel file to Array of Bytes
		File file = new File(dataDir + "book1.xlsx");
		int length = (int) file.length();
		FileInputStream fstro = new FileInputStream(file);
		byte[] buf = new byte[length];
		fstro.read(buf, 0, length);

		// Add an Ole Object Frame shape
		IOleObjectFrame oof = sld.getShapes().addOleObjectFrame((float) 0, (float) 0, (float) pres.getSlideSize().getSize().getWidth(), (float) pres.getSlideSize().getSize().getHeight(),
				"Excel.Sheet.8", buf);

		// Write the PPTX to disk
		pres.save(dataDir + "OleEmbed.pptx", SaveFormat.Pptx);

	}

}

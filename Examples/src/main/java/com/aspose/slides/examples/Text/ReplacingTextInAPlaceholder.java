package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ReplacingTextInAPlaceholder {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReplacingTextInAPlaceholder.class);

		// Instantiate Presentation class that represents PPTX
		Presentation pres = new Presentation(dataDir + "welcome.pptx");

		// Access first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Iterate through shapes to find the placeholder
		for (IShape shp : sld.getShapes())
			if (shp.getPlaceholder() != null) {
				// Change the text of each placeholder
				((IAutoShape) shp).getTextFrame().setText("This is Placeholder");
			}

		// Save the PPTX to Disk
		pres.save(dataDir + "welcome_PH.pptx", SaveFormat.Pptx);

	}

}

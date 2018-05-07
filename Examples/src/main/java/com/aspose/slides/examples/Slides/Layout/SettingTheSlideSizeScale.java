package com.aspose.slides.examples.Slides.Layout;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideSizeScaleType;
import com.aspose.slides.SlideSizeType;
import com.aspose.slides.examples.Utils;

public class SettingTheSlideSizeScale {

	public static void main(String[] args) {
   
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTheSlideSizeScale .class);

         //ExStart:SettingTheSlideSizeScale

		// Instantiate Presentation objects that represent presentation files
		Presentation presentation = new Presentation(dataDir + "demo.pptx");
		Presentation auxPresentation = new Presentation(dataDir+"demo.pptx");

		ISlide slide = presentation.getSlides().get_Item(0);

		Presentation pres = new Presentation("presentation.ppt");
              try {
              pres.getSlideSize().setSize(540, 720, SlideSizeScaleType.EnsureFit); // Method SetSize is used for set slide size with scale content to ensure fit
              pres.getSlideSize().setSize(SlideSizeType.A4Paper, SlideSizeScaleType.Maximize); // Method SetSize is used for set slide size with maximize size of content
} 
    finally {
    pres.dispose();
}
		// Save Presentation to disk
		auxPresentation.save(dataDir + "size.pptx", SaveFormat.Pptx);

                  //ExEnd:SettingTheSlideSizeScale
}

}

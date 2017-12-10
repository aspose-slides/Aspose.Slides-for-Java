package com.aspose.slides.examples.Slides.Layout;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideSizeScaleType;
import com.aspose.slides.SlideSizeType;
import com.aspose.slides.examples.Utils;

public class SettingTheSizeAndTypeOfASlide1 {

	public static void main(String[] args) {
            //ExStart:SettingTheSizeAndTypeOfASlide

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTheSizeAndTypeOfASlide1.class);

		// Instantiate Presentation objects that represent presentation files
		Presentation presentation = new Presentation(dataDir + "demo.pptx");
		Presentation auxPresentation = new Presentation();

		ISlide slide = presentation.getSlides().get_Item(0);

		// Set the slide size of generated presentations to that of source
		
                auxPresentation.getSlideSize().setSize(540, 720, SlideSizeScaleType.EnsureFit);
                //getType());
		 auxPresentation.getSlideSize().setSize(SlideSizeType.A4Paper, SlideSizeScaleType.Maximize);

		// Clone required slide
		auxPresentation.getSlides().addClone(presentation.getSlides().get_Item(0));
		auxPresentation.getSlides().removeAt(0);

		// Save Presentation to disk
		auxPresentation.save(dataDir + "size.pptx", SaveFormat.Pptx);

	            //ExEnd:SettingTheSizeAndTypeOfASlide

}

}

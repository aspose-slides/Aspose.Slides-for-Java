package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.IMasterSlide;
import com.aspose.slides.IMasterSlideCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class CloneASlideWithMasterSlideFromOnePresentationToAnother {

	public static void main(String[] args) {
		
		// The path to the documents directory.


             String dataDir = Utils.getDataDir(CloneASlideWithMasterSlideFromOnePresentationToAnother.class);

	//ExStart:CloneASlideWithMasterSlideFromOnePresentationToAnother
		
		// Instantiate Presentation class to load the source presentation file
		Presentation srcPres = new Presentation(dataDir + "Presentation.pptx");

		// Instantiate Presentation class for destination presentation (where slide is to be cloned)
		Presentation destPres = new Presentation();

		// Instantiate ISlide from the collection of slides in source presentation along with master slide
		ISlide sourceSlide = srcPres.getSlides().get_Item(0);

		// Clone the desired master slide from the source presentation to the collection of masters in the destination presentation
		IMasterSlideCollection masters = destPres.getMasters();
		IMasterSlide SourceMaster = sourceSlide.getLayoutSlide().getMasterSlide();

		IMasterSlide iSlide = masters.addClone(SourceMaster);

		ISlideCollection slds = destPres.getSlides();
		slds.addClone(sourceSlide, iSlide, true);

		// Save the destination presentation to disk
		destPres.save(dataDir + "helloworld_dest3.pptx", SaveFormat.Pptx);
           
          //ExEnd:CloneASlideWithMasterSlideFromOnePresentationToAnother
	
}

}

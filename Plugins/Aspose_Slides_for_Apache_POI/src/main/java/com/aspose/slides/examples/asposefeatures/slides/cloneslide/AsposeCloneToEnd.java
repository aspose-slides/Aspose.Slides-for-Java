package com.aspose.slides.examples.asposefeatures.slides.cloneslide;

import com.aspose.slides.Presentation;
import com.aspose.slides.ISlideCollection;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeCloneToEnd
{
    public static void main(String[] args)
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeCloneToEnd.class);
	
	// Instantiate Presentation class that represents a PPTX file
	Presentation pres = new Presentation(dataDir + "presentation.pptx");

	// Clone the desired slide to the end of the collection of slides in the
	// same PPTX
	ISlideCollection slds = pres.getSlides();
	slds.addClone(pres.getSlides().get_Item(0));

	// Write the modified pptx to disk
	pres.save(dataDir + "AsposeClone.pptx", SaveFormat.Pptx);

	// Printing the status
	System.out.println("Slide cloned successfully!");
    }
}
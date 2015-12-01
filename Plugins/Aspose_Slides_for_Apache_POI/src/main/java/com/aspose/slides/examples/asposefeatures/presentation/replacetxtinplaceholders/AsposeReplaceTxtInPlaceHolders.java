package com.aspose.slides.examples.asposefeatures.presentation.replacetxtinplaceholders;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeReplaceTxtInPlaceHolders
{
    public static void main(String[] args)
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeReplaceTxtInPlaceHolders.class);
	
	// Instantiate Presentation class that represents PPTX
	Presentation pres = new Presentation(dataDir + "demo.pptx");

	// Access first slide
	ISlide slide = pres.getSlides().get_Item(0);

	IShape shape = null;

	// Iterate through the shapes and set a reference to the table found
	for (int i = 0; i < slide.getShapes().size(); i++)
	{
	    shape = slide.getShapes().get_Item(i);
	    if (shape.getPlaceholder() != null)
	    {
		// Change the text of each placeholder
		((IAutoShape) shape).getTextFrame().setText("This is Placeholder");
	    }
	}

	// Write the PPTX to Disk
	pres.save(dataDir + "AsposeReplaceTxt.pptx", SaveFormat.Pptx);

	// Status
	System.out.println("Process completed successfully.");
    }
}

package com.aspose.slides.examples.Presentation.Conversion;

import java.awt.geom.Dimension2D;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideSizeType;
import com.aspose.slides.examples.Utils;

public class SaveToPDFNotesWithCustomSlideSize {

	public static void main(String[] args) {
		
		// The path to the documents directory.
        	String dataDir = Utils.getDataDir(SaveToPDFNotesWithCustomSlideSize.class);
        
		// Instantiate a Presentation object to load source file
		Presentation presentation = new Presentation(dataDir + "demo.pptx");

		// Instantiate Presentation object
		Presentation auxPresentation = new Presentation();

		// Loading slide for cloning
		ISlide slide = presentation.getSlides().get_Item(0);

		// Cloning slide to Presentation at position 0 or first
		auxPresentation.getSlides().insertClone(0, slide);

		// Set slide size type
		auxPresentation.getSlideSize().setType(SlideSizeType.Custom);

		// Setting custom slide size
		Dimension2D dimension = presentation.getSlideSize().getSize();
		dimension.setSize(612F, 792F);
		auxPresentation.getSlideSize().setSize(dimension);

		// Save Presentation to disk
		auxPresentation.save(dataDir + "testPDFnotes.pdf", SaveFormat.PdfNotes);

	}

}

package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IHyperlinkManager;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class CreatingTextBoxWithHyperlink {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CreatingTextBoxWithHyperlink.class);

		// Instantiate Presentation class that represents PPTX
		Presentation pres = new Presentation();

		// Access first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Add an AutoShape of Rectangle Type
		IShape pptxShape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 150, 150, 150, 50);

		// Cast the shape to AutoShape
		IAutoShape pptxAutoShape = (IAutoShape) pptxShape;

		// Access ITextFrame associated with the AutoShape
		pptxAutoShape.addTextFrame("");

		ITextFrame ITextFrame = pptxAutoShape.getTextFrame();

		// Add some text to the frame
		ITextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).setText("Aspose.Slides");

		// Set Hyperlink for the portion text
		IHyperlinkManager hypMan = ITextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getHyperlinkManager();
		hypMan.setExternalHyperlinkClick("http://www.aspose.com");

		// Save the PPTX to Disk
		pres.save(dataDir + "hLinkPPTX.pptx", SaveFormat.Pptx);

	}

}

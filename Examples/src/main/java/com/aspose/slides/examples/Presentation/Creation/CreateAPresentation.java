package com.aspose.slides.examples.Presentation.Creation;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class CreateAPresentation {

	public static final void main(String[] args) {
		
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateAPresentation.class);
        
		// Instantiate Presentation
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = (ISlide) pres.getSlides().get_Item(0);

		// Add an AutoShape of Rectangle type
		IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

		// Add ITextFrame to the Rectangle
		ashp.addTextFrame("Hello World");

		// Change the text color to Black (which is White by default)
		ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat()
				.setFillType(FillType.Solid);
		ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat()
				.getSolidFillColor().setColor(java.awt.Color.BLACK);

		// Change the line color of the rectangle to White
		ashp.getShapeStyle().getLineColor().setColor(java.awt.Color.WHITE);

		// Remove any fill formatting in the shape
		ashp.getFillFormat().setFillType(FillType.NoFill);

		// Save the presentation to disk
		pres.save(dataDir + "HelloWorld.pptx", com.aspose.slides.SaveFormat.Pptx);

	}
}

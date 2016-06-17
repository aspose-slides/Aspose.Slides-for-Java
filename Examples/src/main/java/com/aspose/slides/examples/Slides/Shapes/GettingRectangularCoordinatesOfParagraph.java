package com.aspose.slides.examples.Slides.Shapes;

import java.awt.geom.Rectangle2D;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class GettingRectangularCoordinatesOfParagraph {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(GettingRectangularCoordinatesOfParagraph.class);

		// Paragragh bounds in rectangle
		Presentation pres = new Presentation(dataDir + "HelloWorld.pptx");
		IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);
		ITextFrame textFrame = (ITextFrame) shape.getTextFrame();
		Rectangle2D.Float rect = ((IParagraph) textFrame.getParagraphs().get_Item(0)).getRect();
		System.out.println("X: " + rect.x + " Y: " + rect.y + " Width: " + rect.width + " Height: " + rect.height);

	}

}

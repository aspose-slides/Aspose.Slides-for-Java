package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IInnerShadow;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class ApplyingInnerShadow {

	public static void main(String[] args) {
//ExStart:ApplyingInnerShadow

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ApplyingInnerShadow.class);

		// Create an instance of Presentation class
		Presentation Pres = new Presentation();

		// Get first slide
		ISlide Slide = Pres.getSlides().get_Item(0);

		// Add an AutoShape of Rectangle type
		IAutoShape aShp = Slide.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

		// Add TextFrame to the Rectangle
		aShp.addTextFrame("Aspose TextBox");

		// Enable shape fill in case we want to get shadow of text.
		aShp.getFillFormat().setFillType(FillType.Solid);
		aShp.getFillFormat().getSolidFillColor().setColor(Color.gray);

		// Add inner shadow and set all necessary parameters
		aShp.getEffectFormat().enableInnerShadowEffect();
		IInnerShadow Shadow = aShp.getEffectFormat().getInnerShadowEffect();
		Shadow.setBlurRadius(50);
		Shadow.setDirection(0);
		Shadow.setDistance(0);
		Shadow.getShadowColor().setColor(Color.BLUE);

		// Write the presentation to disk
		Pres.save(dataDir + "ShadowPres.pptx", SaveFormat.Pptx);
//ExEnd:ApplyingInnerShadow

	}

}

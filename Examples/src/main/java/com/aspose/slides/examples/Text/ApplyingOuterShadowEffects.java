package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IOuterShadow;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.RectangleAlignment;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class ApplyingOuterShadowEffects {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ApplyingOuterShadowEffects.class);
               //ExStart: ApplyingOuterShadowEffects
		// Create an instance of Presentation class
		Presentation Pres = new Presentation();

		// Get first slide
		ISlide Slide = Pres.getSlides().get_Item(0);

		// Add an AutoShape of Rectangle type
		IAutoShape aShp = Slide.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

		// Add TextFrame to the Rectangle
		aShp.addTextFrame("Aspose TextBox");

		// Disable shape fill in case we want to get shadow of text
		aShp.getFillFormat().setFillType(FillType.NoFill);

		// Add outer shadow and set all necessary parameters
		aShp.getEffectFormat().enableOuterShadowEffect();
		IOuterShadow Shadow = aShp.getEffectFormat().getOuterShadowEffect();
		Shadow.setBlurRadius(4.0);
		Shadow.setDirection(45);
		Shadow.setDistance(3);
		Shadow.setRectangleAlign(RectangleAlignment.TopLeft);
		Shadow.getShadowColor().setColor(Color.black);

		// Write the presentation to disk
		Pres.save(dataDir + "OutShadow.pptx", SaveFormat.Pptx);
               //ExEnd:ApplyingOuterShadowEffects

	}

}

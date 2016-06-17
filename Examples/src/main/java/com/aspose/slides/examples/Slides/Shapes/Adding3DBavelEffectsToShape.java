package com.aspose.slides.examples.Slides.Shapes;

import java.awt.Color;

import com.aspose.slides.BevelPresetType;
import com.aspose.slides.CameraPresetType;
import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ILineFillFormat;
import com.aspose.slides.ISlide;
import com.aspose.slides.LightRigPresetType;
import com.aspose.slides.LightingDirection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class Adding3DBavelEffectsToShape {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(Adding3DBavelEffectsToShape.class);

		// Create an instance of Presentation class
		Presentation pres = new Presentation();
		ISlide slide = pres.getSlides().get_Item(0);

		// Add a shape on slide
		IAutoShape shape = slide.getShapes().addAutoShape(ShapeType.Ellipse, 30, 30, 100, 100);
		shape.getFillFormat().setFillType(FillType.Solid);
		shape.getFillFormat().getSolidFillColor().setColor(Color.GREEN);
		ILineFillFormat format = shape.getLineFormat().getFillFormat();
		format.setFillType(FillType.Solid);
		format.getSolidFillColor().setColor(Color.ORANGE);
		shape.getLineFormat().setWidth(2.0);

		// Set ThreeDFormat properties of shape
		shape.getThreeDFormat().setDepth(4);
		shape.getThreeDFormat().getBevelTop().setBevelType(BevelPresetType.Circle);
		shape.getThreeDFormat().getBevelTop().setHeight(6);
		shape.getThreeDFormat().getBevelTop().setWidth(6);
		shape.getThreeDFormat().getCamera().setCameraType(CameraPresetType.OrthographicFront);
		shape.getThreeDFormat().getLightRig().setLightType(LightRigPresetType.ThreePt);
		shape.getThreeDFormat().getLightRig().setDirection(LightingDirection.Top);

		// Write the presentation as a PPTX file
		pres.save(dataDir + "Bavel.pptx", SaveFormat.Pptx);

	}

}

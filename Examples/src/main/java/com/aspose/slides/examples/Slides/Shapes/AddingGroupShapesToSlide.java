package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IGroupShape;
import com.aspose.slides.IShapeCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.NullableBool;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeFrame;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class AddingGroupShapesToSlide {

	public static void main(String[] args) {
	//ExStart:AddingGroupShapesToSlide

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingGroupShapesToSlide.class);

		// Instantiate Presentation class
		Presentation pres = new Presentation();

		// Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Accessing the shape collection of slides
		IShapeCollection slideShapes = sld.getShapes();

		// Adding a group shape to the slide
		IGroupShape groupShape = slideShapes.addGroupShape();

		// Adding shapes inside Added group shape
		groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 300, 100, 100, 100);
		groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 500, 100, 100, 100);
		groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 300, 300, 100, 100);
		groupShape.getShapes().addAutoShape(ShapeType.Rectangle, 500, 300, 100, 100);

		// Adding group shape frame
		groupShape.setFrame(new ShapeFrame(100, 300, 500, 40, NullableBool.False, NullableBool.False, 0));

		// Write the PPTX file to disk
		pres.save(dataDir + "GroupShape.pptx", SaveFormat.Pptx);
	//ExEnd:AddingGroupShapesToSlide

	}

}

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

public class AddStretchOffsetForImageFill {

	public static void main(String[] args) {
	//ExStart:AddStretchOffsetForImageFill

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddStretchOffsetForImageFill.class);


Presentation presentation = new Presentation();
try {
// Get the first slide of presentation
ISlide slide = presentation.getSlides().get_Item(0);
 
// Add an AutoShape of Rectangle type
IAutoShape aShape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 300, 300);
 
// Create image
BufferedImage img = ImageIO.read(new File("image.png"));
IPPImage imgEx = presentation.getImages().addImage(img);
 
// Set shape's fill type
aShape.getFillFormat().setFillType(FillType.Picture);
 
// Set shape's picture fill mode
aShape.getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Stretch);
 
// Set image to fill the shape
aShape.getFillFormat().getPictureFillFormat().getPicture().setImage(imgEx);
 
// Specify image offsets from the corresponding edge of the shape's bounding box
aShape.getFillFormat().getPictureFillFormat().setStretchOffsetLeft(25f);
aShape.getFillFormat().getPictureFillFormat().setStretchOffsetRight(25f);
aShape.getFillFormat().getPictureFillFormat().setStretchOffsetTop(-20f);
aShape.getFillFormat().getPictureFillFormat().setStretchOffsetBottom(-10f);
 
// Save created presentation
presentation.save(dataDir +"StretchOffsetExample_out.pptx", SaveFormat.Pptx);
} finally {
presentation.dispose();
}

	//ExEnd:AddStretchOffsetForImageFill

	}

}

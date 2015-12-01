package com.aspose.slides.examples.asposefeatures.smartart.addnodes;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArt;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.SmartArtNode;
import com.aspose.slides.SmartArtNodeCollection;
import com.aspose.slides.examples.Utils;

public class AsposeAddSmartArtNodes
{
    public static void main(String[] args)
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeAddSmartArtNodes.class);
        
	// ==================
	// Adding Smart Art
	// ==================

	// Load the desired the presentation
	Presentation pres = new Presentation(dataDir + "AsposeSmartArt.pptx");

	// Traverse through every shape inside first slide
	for (IShape shape : pres.getSlides().get_Item(0).getShapes())
	{

	    // Check if shape is of SmartArt type
	    if (shape instanceof SmartArt)
	    {

		// Typecast shape to SmartArt
		SmartArt smart = (SmartArt) shape;

		// Adding a new SmartArt Node
		SmartArtNode TemNode = (SmartArtNode) smart.getAllNodes().addNode();

		// Adding text
		TemNode.getTextFrame().setText("Test");

		// Adding new child node in parent node. It will be added in the
		// end of collection
		SmartArtNode newNode = (SmartArtNode) TemNode.getChildNodes().addNode();

		// Adding text
		newNode.getTextFrame().setText("New Node Added");
	    }
	}

	// Saving Presentation
	pres.save(dataDir + "AsposeAddSmartArtNode.pptx", SaveFormat.Pptx);

	// =========================================
	// Adding Smart Art to Specific Location
	// =========================================

	// Creating a presentation instance
	Presentation pres1 = new Presentation();

	// Access the presentation slide
	ISlide slide = pres1.getSlides().get_Item(0);

	// Add Smart Art IShape
	ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400,
		SmartArtLayoutType.StackedList);

	// Accessing the SmartArt node at index 0
	ISmartArtNode node = smart.getAllNodes().get_Item(0);

	// Adding new child node at position 2 in parent node
	SmartArtNode chNode = (SmartArtNode) ((SmartArtNodeCollection) node.getChildNodes())
		.addNodeByPosition(2);

	// Add Text
	chNode.getTextFrame().setText("Sample Text Added");

	// Save Presentation
	pres1.save(dataDir + "AsposeAddSmartArtNodeByPosition.pptx", SaveFormat.Pptx);
        
	System.out.println("Smart Art added and to specific location.");
    }
}

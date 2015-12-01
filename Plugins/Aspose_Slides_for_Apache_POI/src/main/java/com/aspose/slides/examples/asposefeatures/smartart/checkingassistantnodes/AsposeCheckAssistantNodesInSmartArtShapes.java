package com.aspose.slides.examples.asposefeatures.smartart.checkingassistantnodes;

import com.aspose.slides.IShape;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArt;
import com.aspose.slides.examples.Utils;

public class AsposeCheckAssistantNodesInSmartArtShapes
{
    public static void main(String[] args)
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeCheckAssistantNodesInSmartArtShapes.class);

	// Creating a presentation instance
	Presentation pres = new Presentation(dataDir + "presentation.pptx");

	// Traverse through every shape inside first slide
	for (IShape shape : pres.getSlides().get_Item(0).getShapes())
	{
	    // Check if shape is of SmartArt type
	    if (shape instanceof ISmartArt)
	    {
		// Typecast shape to SmartArtEx
		ISmartArt smart = (SmartArt) shape;

		// Traversing through all nodes of SmartArt shape
		for (int i = 0; i < smart.getAllNodes().size(); i++)
		{
		    ISmartArtNode node = smart.getAllNodes().get_Item(i);

		    String tc = node.getTextFrame().getText();

		    // Check if node is Assistant node
		    if (node.isAssistant())
		    {
			System.out.println(tc + " - true");
			// Setting Assistant node to false and making it normal
			// node
			node.setAssistant(false);
		    }
		    else
		    {
			System.out.println(tc + " - false");
		    }
		}
	    }
	}
	// Save Presentation
	pres.save(dataDir + "AsposeChangeAssitantNode.pptx", SaveFormat.Pptx);
        
	System.out.println("AsposeChangeAssitantNode Saved.");
    }
}

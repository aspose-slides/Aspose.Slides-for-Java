package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.Utils;

public class ChangingTextOnSmartArtNode {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ChangingTextOnSmartArtNode.class);

		// Instantiate Presentation class that represents the PPTX file
		Presentation pres = new Presentation();

		// Add SmartArt BasicCycle
		ISmartArt smart = pres.getSlides().get_Item(0).getShapes().addSmartArt(10, 10, 400, 300, SmartArtLayoutType.BasicCycle);

		// Obtain the reference of a node by using its Index
		ISmartArtNode node = smart.getNodes().get_Item(1); // select second root node

		// Setting the text of the TextFrame
		node.getTextFrame().setText("Second root node");

		// Saving Presentation
		pres.save(dataDir + "output.pptx", SaveFormat.Pptx);

	}

}

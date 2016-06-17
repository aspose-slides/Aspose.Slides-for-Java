/** 
 * Copyright 2001-2016 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.SmartArtNode;
import com.aspose.slides.SmartArtNodeCollection;

public class AccessingSmartArtShapeChildNodeAtSpecificPosition {

	public static void main(String[] args) {
		// ExStart:

		// Instantiate the presentation
		Presentation pres = new Presentation();

		// Accessing the first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Adding the SmartArt shape in first slide
		ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.StackedList);

		// Accessing the SmartArt node at index 0
		ISmartArtNode node = smart.getAllNodes().get_Item(0);

		// Accessing the child node at position 1 in parent node
		int position = 1;
		SmartArtNode chNode = (SmartArtNode) ((SmartArtNodeCollection) node.getChildNodes())
				.getNodeByPosition(position);

		// Printing the SmartArt child node parameters
		System.out.print("Text = " + chNode.getTextFrame().getText() + ",  Level = " + chNode.getLevel()
				+ ", Position = " + chNode.getPosition());

		// ExEnd:

	}

}

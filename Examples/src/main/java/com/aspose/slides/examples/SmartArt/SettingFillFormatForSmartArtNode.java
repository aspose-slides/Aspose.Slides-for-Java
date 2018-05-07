package com.aspose.slides.examples.SmartArt;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingFillFormatForSmartArtNode {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingFillFormatForSmartArtNode.class);
               
     //ExStart:SettingFillFormatForSmartArtNode

		// Instantiate the presentation
		Presentation pres = new Presentation();

		// Accessing the slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Adding SmartArt shape and nodes
		ISmartArt chevron = slide.getShapes().addSmartArt(10, 10, 800, 60, com.aspose.slides.SmartArtLayoutType.ClosedChevronProcess);
		ISmartArtNode node = chevron.getAllNodes().addNode();
		node.getTextFrame().setText("Some text");

		// Setting node fill color
		for (IShape item : node.getShapes()) {
			item.getFillFormat().setFillType(FillType.Solid);
			item.getFillFormat().getSolidFillColor().setColor(Color.RED);
		}

		// Save the presentation
		pres.save(dataDir + "TestSmart.pptx", SaveFormat.Pptx);
           
 //ExEnd:SettingFillFormatForSmartArtNode
	
         }

}

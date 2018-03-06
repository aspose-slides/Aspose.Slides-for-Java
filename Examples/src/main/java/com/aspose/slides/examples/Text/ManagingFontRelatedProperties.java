package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.FontData;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.NullableBool;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TextAlignment;
import com.aspose.slides.examples.Utils;

public class ManagingFontRelatedProperties {

	public static void main(String[] args) {
                //ExStart:ManagingFontRelatedProperties
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ManagingFontRelatedProperties.class);

		// Instantiate a Presentation object that represents a PPTX file
		Presentation pres = new Presentation(dataDir + "FontProperties.pptx");

		// Accessing a slide using its slide position
		ISlide slide = pres.getSlides().get_Item(0);

		// Accessing the first and second placeholder in the slide and typecasting it as AutoShape
		ITextFrame tf1 = ((IAutoShape) slide.getShapes().get_Item(0)).getTextFrame();
		ITextFrame tf2 = ((IAutoShape) slide.getShapes().get_Item(1)).getTextFrame();

		// Accessing the first Paragraph
		IParagraph para1 = tf1.getParagraphs().get_Item(0);
		IParagraph para2 = tf2.getParagraphs().get_Item(0);

		// Justify the paragraph
		para2.getParagraphFormat().setAlignment(TextAlignment.JustifyLow);

		// Accessing the first portion
		IPortion port1 = para1.getPortions().get_Item(0);
		IPortion port2 = para2.getPortions().get_Item(0);

		// Define new fonts
		FontData fd1 = new FontData("Elephant");
		FontData fd2 = new FontData("Castellar");

		// Assign new fonts to portion
		port1.getPortionFormat().setLatinFont(fd1);
		port2.getPortionFormat().setLatinFont(fd2);

		// Set font to Bold
		port1.getPortionFormat().setFontBold(NullableBool.True);
		port2.getPortionFormat().setFontBold(NullableBool.True);

		// Set font to Italic
		port1.getPortionFormat().setFontItalic(NullableBool.True);
		port2.getPortionFormat().setFontItalic(NullableBool.True);

		// Set font color
		port1.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
		port1.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
		port2.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
		port2.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.GREEN);

		// Save the PPTX to disk
		pres.save(dataDir + "WelcomeFont.pptx", SaveFormat.Pptx);
                //ExEnd:ManagingFontRelatedProperties
	}

}

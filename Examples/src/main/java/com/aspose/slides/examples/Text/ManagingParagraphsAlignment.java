package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TextAlignment;
import com.aspose.slides.examples.Utils;

public class ManagingParagraphsAlignment {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ManagingParagraphsAlignment.class);
               //ExStart:ManagingParagraphsAlignment
		// Instantiate a Presentation object that represents a PPTX file
		Presentation pres = new Presentation(dataDir + "ParagraphsAlignment.pptx");

		// Accessing first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Accessing the first and second placeholder in the slide and typecasting it as AutoShape
		ITextFrame tf1 = ((IAutoShape) slide.getShapes().get_Item(0)).getTextFrame();
		ITextFrame tf2 = ((IAutoShape) slide.getShapes().get_Item(1)).getTextFrame();

		// Change the text in both Placeholders
		tf1.setText("Center Align by Aspose");
		tf2.setText("Center Align by Aspose");

		// Getting the first paragraph of the Placeholders
		IParagraph para1 = tf1.getParagraphs().get_Item(0);
		IParagraph para2 = tf2.getParagraphs().get_Item(0);

		// Aligning the text paragraph to center
		para1.getParagraphFormat().setAlignment(TextAlignment.Center);
		para2.getParagraphFormat().setAlignment(TextAlignment.Center);

		// Writing the presentation as a PPTX file
		pres.save(dataDir + "Centeralign.pptx", SaveFormat.Pptx);
              //ExEnd:ManagingParagraphsAlignment
	}

}

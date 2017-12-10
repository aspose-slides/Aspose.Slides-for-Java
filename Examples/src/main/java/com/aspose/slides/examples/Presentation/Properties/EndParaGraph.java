package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.BulletType;
import com.aspose.slides.ColorType;
import com.aspose.slides.FontData;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.NumberedBulletStyle;
import com.aspose.slides.Paragraph;
import com.aspose.slides.Portion;
import com.aspose.slides.PortionFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class EndParaGraph {

	public static void main(String[] args) {

		 // The path to the documents directory.
		 String dataDir = Utils.getDataDir(EndParaGraph.class);
                //ExStart:EndParaGraph
		// Instantiate a Presentation class that represents a PPTX file
		Presentation p=new Presentation(dataDir+"ppt.pptx");
                ISlide slide = p.getSlides().get_Item(0);
                IAutoShape shape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 0, 0, 100, 100);
                Paragraph para1 = new Paragraph();
                para1.getPortions().add(new Portion("Sample Text"));
                Paragraph para2 = new Paragraph();
                para2.getPortions().add(new Portion("Sample Text2"));
                PortionFormat endParagraphPortionFormat = new PortionFormat();
                endParagraphPortionFormat.setFontHeight(40);
                endParagraphPortionFormat.setLatinFont(new FontData("Times New Roman"));
                para2.setEndParagraphPortionFormat(endParagraphPortionFormat);
                shape.getTextFrame().getParagraphs().add(para1);
                shape.getTextFrame().getParagraphs().add(para2);
                 p.save(dataDir+"result.pptx",SaveFormat.Pptx);
          }
               //ExEnd:EndParaGraph
	}



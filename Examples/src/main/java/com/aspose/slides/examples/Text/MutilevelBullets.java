package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.BulletType;
import com.aspose.slides.ColorType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.NumberedBulletStyle;
import com.aspose.slides.Paragraph;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.FillType;
import com.aspose.slides.examples.Utils;

public class MutilevelBullets {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(MutilevelBullets.class);
               //ExStart:MutilevelBullets 
		// Instantiate a Presentation class that represents a PPTX file
		Presentation pres = new Presentation();

		// Accessing first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Adding and accessing Autoshape
		IAutoShape aShp = slide.getShapes().addAutoShape(ShapeType.Rectangle, 200, 200, 400, 200);

		// Accessing the text frame of created autoshape
		ITextFrame txtFrm = aShp.addTextFrame("");

		// Removing the default exisiting paragraph
		txtFrm.getParagraphs().clear();

		// Creating first paragraph
		Paragraph para1 = new Paragraph();
		// Setting paragraph bullet style and symbol
		para1.setText("Content");
                para1.getParagraphFormat().getBullet().setType(BulletType.Symbol);
		para1.getParagraphFormat().getBullet().setChar((char) 8226);
                para1.getParagraphFormat().getDefaultPortionFormat().getFillFormat().setFillType ((byte)FillType.Solid);
                para1.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
                //Setting bullet level
                para1.getParagraphFormat().setDepth ((short)0);
                
		// Creating second paragraph
		Paragraph para2 = new Paragraph();
		// Setting paragraph bullet style and symbol
		para2.setText("Second level");
                para2.getParagraphFormat().getBullet().setType(BulletType.Symbol);
		para2.getParagraphFormat().getBullet().setChar('-');
                para2.getParagraphFormat().getDefaultPortionFormat().getFillFormat().setFillType ((byte)FillType.Solid);
                para2.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
                //Setting bullet level
                para2.getParagraphFormat().setDepth ((short)1);

		// Creating third paragraph
		Paragraph para3 = new Paragraph();
		// Setting paragraph bullet style and symbol
		para3.setText("Third level");
                para3.getParagraphFormat().getBullet().setType(BulletType.Symbol);
		para3.getParagraphFormat().getBullet().setChar((char) 8226);
                para3.getParagraphFormat().getDefaultPortionFormat().getFillFormat().setFillType ((byte)FillType.Solid);
                para3.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
                //Setting bullet level
                para3.getParagraphFormat().setDepth ((short)2);

		// Creating fourth paragraph
		Paragraph para4 = new Paragraph();
		// Setting paragraph bullet style and symbol
		para4.setText("Fourth Level");
                para4.getParagraphFormat().getBullet().setType(BulletType.Symbol);
		para4.getParagraphFormat().getBullet().setChar('-');
                para4.getParagraphFormat().getDefaultPortionFormat().getFillFormat().setFillType ((byte)FillType.Solid);
                para4.getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
                //Setting bullet level
                para4.getParagraphFormat().setDepth ((short)3);
                                
		// Adding Paragraph to text frame
		txtFrm.getParagraphs().add(para1);
		txtFrm.getParagraphs().add(para2);
		txtFrm.getParagraphs().add(para3);
		txtFrm.getParagraphs().add(para4);

		// saving the presentation as a PPTX file
		pres.save(dataDir + "MultilevelBullet.pptx", SaveFormat.Pptx);
               //ExEnd:MutilevelBullets 
	}

}

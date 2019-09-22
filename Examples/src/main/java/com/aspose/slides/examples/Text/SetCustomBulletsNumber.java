

package com.aspose.slides.examples.Text;

import com.aspose.slides.AutoShape;
import com.aspose.slides.BulletType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IShapeCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Paragraph;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;


public class SetCustomBulletsNumber {

    public static void main(String[] args) {

        //ExStart:SetCustomBulletsNumber 
        
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetCustomBulletsNumber.class);
        
        Presentation presentation = new Presentation();
        
        try
        {
                 // Accessing first slide
		ISlide slide = presentation.getSlides().get_Item(0);

		// Adding and accessing Autoshape
		IAutoShape aShp = slide.getShapes().addAutoShape(ShapeType.Rectangle, 200, 200, 400, 200);

		// Accessing the text frame of created autoshape
		ITextFrame txtFrm = aShp.addTextFrame("");

		// Removing the default exisiting paragraph
		txtFrm.getParagraphs().clear();
            
                // First list
                Paragraph paragraph1 = new Paragraph();
                paragraph1.setText("bullet 2");
                paragraph1.getParagraphFormat().setDepth((short)4); 
                paragraph1.getParagraphFormat().getBullet().setNumberedBulletStartWith((short)2);
                paragraph1.getParagraphFormat().getBullet().setType(BulletType.Numbered);
                txtFrm.getParagraphs().add(paragraph1);

                Paragraph paragraph2 = new Paragraph();
                paragraph2.setText("bullet 3");
                paragraph2.getParagraphFormat().setDepth((short)4);
                paragraph2.getParagraphFormat().getBullet().setNumberedBulletStartWith((short)3); // ADDED: bullet start with 3 per customer needs
                paragraph2.getParagraphFormat().getBullet().setType(BulletType.Numbered);  // FIXED: paragraph1 local variable type was set instead of paragraph2.
                txtFrm.getParagraphs().add(paragraph2);

                // Second list
                Paragraph paragraph5 = new Paragraph();
                paragraph5.setText("bullet 5");
                paragraph5.getParagraphFormat().setDepth((short)4);
                paragraph5.getParagraphFormat().getBullet().setNumberedBulletStartWith((short)5);
                paragraph5.getParagraphFormat().getBullet().setType(BulletType.Numbered);
                txtFrm.getParagraphs().add(paragraph5);
            
            presentation.save(dataDir + "SetCustomBulletsNumber-slides.pptx.pptx", SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        
     //ExEnd:SetCustomBulletsNumber           
        
    }
}

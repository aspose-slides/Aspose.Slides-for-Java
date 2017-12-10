package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.IShapeCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.ISmartArtNodeCollection;
import com.aspose.slides.ISmartArtShape;
import com.aspose.slides.ISmartArtShapeCollection;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.SmartArt;
import com.aspose.slides.TextVerticalType;
import com.aspose.slides.examples.Utils;

public class SmartArtNodeAlternativeText
{
        public static void main(String[] args)
{
                 
                 //ExStart:SmartArtNodeAlternativeText
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SmartArtNodeAlternativeText.class);

		Presentation presentation = new Presentation("testalt.pptx");
                ISlide slide = presentation.getSlides().get_Item(0);
                IShapeCollection shapes = slide.getShapes();
                for(int i = 0; i < shapes.size(); i++)
          {
        	SmartArt shape = (SmartArt) shapes.get_Item(i);
	        ISmartArtNodeCollection nodes = shape.getAllNodes();
	        for(ISmartArtNode smartArtNode : nodes)
	    {		
		ISmartArtShapeCollection smartshapes = smartArtNode.getShapes();
		for(ISmartArtShape smartshape : smartshapes){
			if(smartshape.getShapeType() == ShapeType.Rectangle)
				System.out.println(smartshape.getAlternativeText());
		}
	   }
         }
                presentation.save("test2.pptx", com.aspose.slides.SaveFormat.Pptx);
     }
           //ExEnd:SmartArtNodeAlternativeText

}

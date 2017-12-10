package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.ISmartArtNodeCollection;
import com.aspose.slides.ISmartArtShape;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class GetTextFromSmartArtNode {

	public static void main(String[] args) {

                 //ExStart:GetTextFromSmartArtNode		
                // The path to the documents directory.
		String dataDir = Utils.getDataDir(GetTextFromSmartArtNode.class);

		Presentation pres = new Presentation("Presentation.pptx");
   try{
               ISlide slide = pres.getSlides().get_Item(0);
               ISmartArt smartArt = (ISmartArt)slide.getShapes().get_Item(0);

              ISmartArtNodeCollection smartArtNodes = smartArt.getAllNodes();
              for(ISmartArtNode smartArtNode : smartArtNodes)
      {
             for (ISmartArtShape nodeShape : smartArtNode.getShapes())
         {
            if (nodeShape.getTextFrame() != null)
                System.out.println(nodeShape.getTextFrame().getText());
         }
      }
   }
finally 

  {

    pres.dispose();
  }

//ExEnd:GetTextFromSmartArtNode	
}

}

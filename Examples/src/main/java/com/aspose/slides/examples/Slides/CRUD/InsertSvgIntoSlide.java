package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.IBaseSlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class InsertSvgIntoSlide {

	public static void main(String[] args) {
		//ExStart:InsertSvgIntoSlide
                // The path to the documents directory.
 		String dataDir = Utils.getDataDir(InsertSvgIntoSlide.class);
                Presentation p = new Presentation();
{
               String svgContent = ReadAllTextFromFile(svgPath);
               IPPImage emfImage = p.getImages().addFromSvg(svgContent);
               p.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, emfImage.getWidth(), emfImage.getHeight(), emfImage);
               p.save(outPptxPath, SaveFormat.Pptx);
} 
		
            // ExEnd:InsertSvgIntoSlide

	}

}

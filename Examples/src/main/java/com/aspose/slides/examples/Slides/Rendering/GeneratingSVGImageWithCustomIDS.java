package com.aspose.slides.examples.Slides.Rendering;

import java.io.FileOutputStream;
import java.io.IOException;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SVGOptions;
import com.aspose.slides.examples.Utils;
import java.io.FileNotFoundException;

public class GeneratingSVGImageWithCustomIDS {

	public static void main(String[] args) throws FileNotFoundException, IOException {

// The path to the documents directory.
//ExStart:GeneratingSVGImageWithCustomIDS
 String dataDir = Utils.getDataDir(GeneratingSVGImageWithCustomIDS.class);
 Presentation pres = new Presentation(dataDir+"pptxFileName.pptx");
 try
     {
       FileOutputStream stream = null;
 try 
      {
         stream = new FileOutputStream(new java.io.File(dataDir));
         SVGOptions svgOptions = new SVGOptions();
         svgOptions.setShapeFormattingController(new CustomSvgShapeFormattingController());

         pres.getSlides().get_Item(0).writeAsSvg(stream, svgOptions);
     }
 finally {
          if (stream != null) stream.close();
         }
     }
 finally 
      {
      
        if (pres != null) pres.dispose();
      }		

//ExEnd:GGeneratingSVGImageWithCustomIDS

        }
}
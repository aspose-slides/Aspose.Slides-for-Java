
package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.IFillFormat;
import com.aspose.slides.ILayoutSlide;
import com.aspose.slides.ILineFormat;
import com.aspose.slides.IShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;


public class AccessLayoutFormats {
 
    public static void main(String[] args) {
        
	//ExStart:AccessLayoutFormats

	
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessLayoutFormats.class);
        
        Presentation pres = new Presentation(dataDir + "pres.pptx");
        for (ILayoutSlide layoutSlide : pres.getLayoutSlides())
                {
                    
                    IFillFormat[] fillFormats =  new IFillFormat[layoutSlide.getShapes().size()];
                    int i =0;
                    for (IShape shape : layoutSlide.getShapes()){
                        
                        fillFormats[i] = shape.getFillFormat();
                        
                        i++;
                    }
                    
                    ILineFormat[] lineFormats =  new ILineFormat[layoutSlide.getShapes().size()];
                    int j =0;
                    for (IShape shape : layoutSlide.getShapes()){
                        
                        lineFormats[j] = shape.getLineFormat();
                        
                        j++;
                    }
                    
                }
        //ExEnd:AccessLayoutFormats        
    }
}

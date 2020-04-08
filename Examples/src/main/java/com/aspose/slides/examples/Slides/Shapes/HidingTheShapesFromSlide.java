package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class HidingTheShapesFromSlide {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(HidingTheShapesFromSlide.class);
        
        //ExStart:HidingTheShapesFromSlide
        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation();
        try {
            ISlide slide = pres.getSlides().get_Item(0);
            for (int i = 0; i < slide.getShapes().size(); i++) {
                IAutoShape ashp = (IAutoShape) slide.getShapes().get_Item(i);
                ashp.setHidden(true);
            }
            pres.save(dataDir + "sample_output.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:HidingTheShapesFromSlide
    }

}

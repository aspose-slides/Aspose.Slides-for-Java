package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class AddingSimpleRectangleInTheSlide {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddingSimpleRectangleInTheSlide.class);

        //ExStart:AddingSimpleRectangleInTheSlide
        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();
        try {
            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add AutoShape of ellipse type
            IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 150, 50);

            // Write the PPTX file to disk
            pres.save(dataDir + "RecShp1.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddingSimpleRectangleInTheSlide
    }

}

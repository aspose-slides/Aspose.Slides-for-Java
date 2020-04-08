package com.aspose.slides.examples.Slides.Shapes;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresetColor;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class AddingFormattedRectangleToSlide {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddingFormattedRectangleToSlide.class);

        //ExStart:AddingFormattedRectangleToSlide
        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();
        try {
            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add AutoShape of ellipse type
            IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 150, 50);

            // Apply some formatting to ellipse shape
            shp.getFillFormat().setFillType(FillType.Solid);
            shp.getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Chocolate));

            // Apply some formatting to the line of Ellipse
            shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
            shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
            shp.getLineFormat().setWidth(5);

            // Write the PPTX file to disk
            pres.save(dataDir + "RecShp2.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddingFormattedRectangleToSlide
    }

}

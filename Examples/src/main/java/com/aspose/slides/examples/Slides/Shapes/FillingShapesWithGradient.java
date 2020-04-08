package com.aspose.slides.examples.Slides.Shapes;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.GradientDirection;
import com.aspose.slides.GradientShape;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class FillingShapesWithGradient {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(FillingShapesWithGradient.class);

        //ExStart:FillingShapesWithGradient
        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();
        try {
            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add AutoShape of ellipse type
            IShape shp = sld.getShapes().addAutoShape(ShapeType.Ellipse, 50, 150, 75, 150);

            // Apply some Gradient formatting to ellipse shape
            shp.getFillFormat().setFillType(FillType.Gradient);
            shp.getFillFormat().getGradientFormat().setGradientShape(GradientShape.Linear);

            // Set the Gradient Direction
            shp.getFillFormat().getGradientFormat().setGradientDirection(GradientDirection.FromCorner2);

            // Add two Gradient Stops
            shp.getFillFormat().getGradientFormat().getGradientStops().add((float) 1.0, Color.pink);
            shp.getFillFormat().getGradientFormat().getGradientStops().add((float) 0, Color.red);

            // Write the PPTX file to disk
            pres.save(dataDir + "EllipseShpGrad.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FillingShapesWithGradient
    }

}

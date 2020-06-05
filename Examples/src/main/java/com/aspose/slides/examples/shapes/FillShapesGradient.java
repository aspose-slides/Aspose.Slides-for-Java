package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class FillShapesGradient
{
    public static void main(String[] args)
    {
        //ExStart:FillShapesGradient
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Prseetation class that represents the PPTX// Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add autoshape of ellipse type
            IShape shp = sld.getShapes().addAutoShape(ShapeType.Ellipse, 50, 150, 75, 150);

            // Apply some gradiant formatting to ellipse shape
            shp.getFillFormat().setFillType(FillType.Gradient);
            shp.getFillFormat().getGradientFormat().setGradientShape(GradientShape.Linear);

            // Set the Gradient Direction
            shp.getFillFormat().getGradientFormat().setGradientDirection(GradientDirection.FromCorner2);

            // Add two Gradiant Stops
            shp.getFillFormat().getGradientFormat().getGradientStops().add((float) 1.0, new Color(PresetColor.Purple));
            shp.getFillFormat().getGradientFormat().getGradientStops().add((float) 0, Color.RED);

            //Write the PPTX file to disk
            pres.save(dataDir + "EllipseShpGrad_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FillShapesGradient
    }
}

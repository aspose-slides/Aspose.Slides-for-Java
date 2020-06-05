package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class FillShapesPattern
{
    public static void main(String[] args)
    {
        //ExStart:FillShapesPattern
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add autoshape of rectangle type
            IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 75, 150);

            // Set the fill type to Pattern
            shp.getFillFormat().setFillType(FillType.Pattern);

            // Set the pattern style
            shp.getFillFormat().getPatternFormat().setPatternStyle(PatternStyle.Trellis);

            // Set the pattern back and fore colors
            shp.getFillFormat().getPatternFormat().getBackColor().setColor(Color.LIGHT_GRAY);
            shp.getFillFormat().getPatternFormat().getForeColor().setColor(Color.YELLOW);

            //Write the PPTX file to disk
            pres.save(dataDir + "RectShpPatt_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FillShapesPattern
    }
}

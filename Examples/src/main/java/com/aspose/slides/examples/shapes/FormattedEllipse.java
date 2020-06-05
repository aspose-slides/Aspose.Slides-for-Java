package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class FormattedEllipse
{
    public static void main(String[] args)
    {
        //ExStart:FormattedEllipse
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

            // Add autoshape of ellipse type
            IShape shp = sld.getShapes().addAutoShape(ShapeType.Ellipse, 50, 150, 150, 50);

            // Apply some formatting to ellipse shape
            shp.getFillFormat().setFillType(FillType.Solid);
            shp.getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Chocolate));

            // Apply some formatting to the line of Ellipse
            shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
            shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
            shp.getLineFormat().setWidth(5);

            //Write the PPTX file to disk
            pres.save(dataDir + "EllipseShp2_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FormattedEllipse
    }
}

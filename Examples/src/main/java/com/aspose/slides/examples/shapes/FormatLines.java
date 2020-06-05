package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class FormatLines
{
    public static void main(String[] args)
    {
        //ExStart:FormatLines
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
            IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 150, 75);

            // Set the fill color of the rectangle shape
            shp.getFillFormat().setFillType(FillType.Solid);
            shp.getFillFormat().getSolidFillColor().setColor(Color.WHITE);

            // Apply some formatting on the line of the rectangle
            shp.getLineFormat().setStyle(LineStyle.ThickThin);
            shp.getLineFormat().setWidth(7);
            shp.getLineFormat().setDashStyle(LineDashStyle.Dash);

            // Set the color of the line of rectangle
            shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
            shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);

            //Write the PPTX file to disk
            pres.save(dataDir + "RectShpLn_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FormatLines
    }
}

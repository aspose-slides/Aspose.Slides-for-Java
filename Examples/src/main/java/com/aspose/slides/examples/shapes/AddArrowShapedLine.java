package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class AddArrowShapedLine
{
    public static void main(String[] args)
    {
        //ExStart:AddArrowShapedLine
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate PresentationEx class that represents the PPTX file
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add an autoshape of type line
            IAutoShape shp = sld.getShapes().addAutoShape(ShapeType.Line, 50, 150, 300, 0);

            // Apply some formatting on the line
            shp.getLineFormat().setStyle(LineStyle.ThickBetweenThin);
            shp.getLineFormat().setWidth(10);

            shp.getLineFormat().setDashStyle(LineDashStyle.DashDot);

            shp.getLineFormat().setBeginArrowheadLength(LineArrowheadLength.Short);
            shp.getLineFormat().setBeginArrowheadStyle(LineArrowheadStyle.Oval);

            shp.getLineFormat().setBeginArrowheadLength(LineArrowheadLength.Long);
            shp.getLineFormat().setEndArrowheadStyle(LineArrowheadStyle.Triangle);

            shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
            shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Maroon));

            //Write the PPTX to Disk
            pres.save(dataDir + "LineShape2_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddArrowShapedLine
    }
}

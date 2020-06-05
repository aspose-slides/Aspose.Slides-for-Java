package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class AddingCustomLines
{
    public static void main(String[] args)
    {

        //ExStart:AddingCustomLines
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 500, 400);
            IAutoShape shape = chart.getUserShapes().getShapes().addAutoShape(ShapeType.Line, 0, chart.getHeight() / 2, chart.getWidth(), 0);
            shape.getLineFormat().getFillFormat().setFillType(FillType.Solid);
            shape.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.RED);
            pres.save(dataDir + "AddCustomLines.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddingCustomLines
    }
}


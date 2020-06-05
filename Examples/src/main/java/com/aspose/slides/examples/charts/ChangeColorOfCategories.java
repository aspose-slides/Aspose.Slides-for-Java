package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class ChangeColorOfCategories
{
    public static void main(String[] args)
    {
        //ExStart:ChangeColorOfCategories
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation();
        try

        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

            IChartDataPoint point = chart.getChartData().getSeries().get_Item(0).getDataPoints().get_Item(0);

            point.getFormat().getFill().setFillType(FillType.Solid);

            point.getFormat().getFill().getSolidFillColor().setColor(Color.BLUE);
            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ChangeColorOfCategories
    }

}

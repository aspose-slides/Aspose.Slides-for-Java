package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;

public class Chart_GetRange {

    public static void main(String[] args)
    {
        //ExStart:Chart_GetRange
        // The path to the documents directory.
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 10, 10, 400, 300);

            String result = chart.getChartData().getRange();

            System.out.println("GetRange result : " + result);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:Chart_GetRange
    }

}

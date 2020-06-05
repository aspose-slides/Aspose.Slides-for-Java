package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ClearSpecificChartSeriesDataPointsData
{
    public static void main(String[] args)
    {

        //ExStart:ClearSpecificChartSeriesDataPointsData

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation(dataDir + "TestChart.pptx");
        try
        {
            ISlide sl = pres.getSlides().get_Item(0);

            IChart chart = (IChart) sl.getShapes().get_Item(0);

            for (IChartDataPoint dataPoint : chart.getChartData().getSeries().get_Item(0).getDataPoints())
            {
                dataPoint.getXValue().getAsCell().setValue(null);
                dataPoint.getYValue().getAsCell().setValue(null);
            }

            chart.getChartData().getSeries().get_Item(0).getDataPoints().clear();

            pres.save(dataDir + "ClearSpecificChartSeriesDataPointsData.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:ClearSpecificChartSeriesDataPointsData

    }
}


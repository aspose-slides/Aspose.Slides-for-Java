package com.aspose.slides.examples.charts;

import com.aspose.slides.Chart;
import com.aspose.slides.ChartType;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class IActualLayoutAdded
{
    public static void main(String[] args)
    {
        //ExStart:IActualLayoutadded
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Creating empty presentation
        Presentation pres = new Presentation();
        try
        {
            Chart chart = (Chart) pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 500, 350);
            chart.validateChartLayout();

            double x = chart.getPlotArea().getActualX();
            double y = chart.getPlotArea().getActualY();
            double w = chart.getPlotArea().getActualWidth();
            double h = chart.getPlotArea().getActualHeight();
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
    //ExEnd:IActualLayoutadded
}


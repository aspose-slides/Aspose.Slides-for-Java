package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class InvertIfNegativeForIndividualSeries
{
    public static void main(String[] args)
    {
        String dataDir = RunExamples.getDataDir_Charts();

        //ExStart:InvertIfNegativeForIndividualSeries
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400, true);
            IChartSeriesCollection series = chart.getChartData().getSeries();
            chart.getChartData().getSeries().clear();

            series.add(chart.getChartData().getChartDataWorkbook().getCell(0, "B1"), chart.getType());
            series.get_Item(0).getDataPoints().addDataPointForBarSeries(chart.getChartData().getChartDataWorkbook().getCell(0, "B2", -5));
            series.get_Item(0).getDataPoints().addDataPointForBarSeries(chart.getChartData().getChartDataWorkbook().getCell(0, "B3", 3));
            series.get_Item(0).getDataPoints().addDataPointForBarSeries(chart.getChartData().getChartDataWorkbook().getCell(0, "B4", -2));
            series.get_Item(0).getDataPoints().addDataPointForBarSeries(chart.getChartData().getChartDataWorkbook().getCell(0, "B5", 1));

            series.get_Item(0).setInvertIfNegative(false);

            series.get_Item(0).getDataPoints().get_Item(2).setInvertIfNegative(true);

            pres.save(dataDir + "InvertIfNegativeForIndividualSeries.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:InvertIfNegativeForIndividualSeries
    }

}

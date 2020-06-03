package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class HistogramChart
{

    //ExStart:HistogramChart
    public static void main(String[] args)

    {

        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation(dataDir + "test.pptx");
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Histogram, 50, 50, 500, 400);
            chart.getChartData().getCategories().clear();
            chart.getChartData().getSeries().clear();

            IChartDataWorkbook wb = chart.getChartData().getChartDataWorkbook();

            wb.clear(0);

            IChartSeries series = chart.getChartData().getSeries().add(ChartType.Histogram);
            series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A1", 15));
            series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A2", -41));
            series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A3", 16));
            series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A4", 10));
            series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A5", -23));
            series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A6", 16));

            chart.getAxes().getHorizontalAxis().setAggregationType(AxisAggregationType.Automatic);

            pres.save(dataDir + "Histogram.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

    }

    //ExEnd:HistogramChart
}


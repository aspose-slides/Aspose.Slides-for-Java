package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;

public class MapChart
{

    // This example demonstrates creating Map charts.
    // Please pay attension that when you first open a presentation in PP it may take a few seconds to upload an image
    // of the chart from the Bing service since we don't provide cached image.
    public static void main(String[] args)
    {
        //ExStart:MapChart

        String resultPath = RunExamples.getOutPath() +  "MapChart_out.pptx";

        Presentation presentation = new Presentation();
        try {
            //create empty chart
            IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.Map, 50, 50, 500, 400, false);

            IChartDataWorkbook wb = chart.getChartData().getChartDataWorkbook();

            //Add series and few data points
            IChartSeries series = chart.getChartData().getSeries().add(ChartType.Map);
            series.getDataPoints().addDataPointForMapSeries(wb.getCell(0, "B2", 5));
            series.getDataPoints().addDataPointForMapSeries(wb.getCell(0, "B3", 1));
            series.getDataPoints().addDataPointForMapSeries(wb.getCell(0, "B4", 10));

            //add categories
            chart.getChartData().getCategories().add(wb.getCell(0, "A2", "United States"));
            chart.getChartData().getCategories().add(wb.getCell(0, "A3", "Mexico"));
            chart.getChartData().getCategories().add(wb.getCell(0, "A4", "Brazil"));

            //change data point value
            IChartDataPoint dataPoint = series.getDataPoints().get_Item(1);
            dataPoint.getColorValue().getAsCell().setValue("15");

            //set data point appearance
            dataPoint.getFormat().getFill().setFillType(FillType.Solid);
            dataPoint.getFormat().getFill().getSolidFillColor().setColor(Color.GREEN);

            presentation.save(resultPath, SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }

        //ExEnd:MapChart
    }

}

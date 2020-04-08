package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingTheGapWidthPropertyOfChartSeries {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SettingTheGapWidthPropertyOfChartSeries.class);

        //ExStart:SettingTheGapWidthPropertyOfChartSeries
        // Creating empty presentation
        Presentation pres = new Presentation();
        try {
            // Access first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add chart with default data
            IChart chart = sld.getShapes().addChart(ChartType.StackedColumn3D, 0, 0, 500, 500);

            // Getting the chart data WorkSheet
            IChartDataWorkbook fact = chart.getChartData().getChartDataWorkbook();

            // Delete default generated series and categories
            chart.getChartData().getSeries().clear();
            chart.getChartData().getCategories().clear();

            // Adding new series
            chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType());
            chart.getChartData().getSeries().add(fact.getCell(0, 0, 2, "Series 2"), chart.getType());

            // Adding new categories
            chart.getChartData().getCategories().add(fact.getCell(0, 1, 0, "Caetegoty 1"));
            chart.getChartData().getCategories().add(fact.getCell(0, 2, 0, "Caetegoty 2"));
            chart.getChartData().getCategories().add(fact.getCell(0, 3, 0, "Caetegoty 3"));

            // Take first chart series
            IChartSeries series = chart.getChartData().getSeries().get_Item(0);

            // Populating series data
            series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 1, 1, 20));
            series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 2, 1, 50));
            series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 3, 1, 30));

            // Take second chart series
            series = chart.getChartData().getSeries().get_Item(1);

            // Populating series data
            series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 1, 2, 30));
            series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 2, 2, 10));
            series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 3, 2, 60));

            // Set GapWidth value
            series.getParentSeriesGroup().setGapWidth(75);

            // Save presentation with chart
            pres.save(dataDir + "3Drotation.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SettingTheGapWidthPropertyOfChartSeries
    }

}

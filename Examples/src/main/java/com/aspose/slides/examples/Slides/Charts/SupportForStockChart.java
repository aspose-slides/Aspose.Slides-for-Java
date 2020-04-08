/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class SupportForStockChart {
    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SupportForStockChart.class);

        //ExStart:SupportForStockChart
        // Instantiate the presentation
        Presentation pres = new Presentation(dataDir + "Test.pptx");
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.OpenHighLowClose, 50, 50, 600, 400, false);

            chart.getChartData().getSeries().clear();
            chart.getChartData().getCategories().clear();

            IChartDataWorkbook wb = chart.getChartData().getChartDataWorkbook();

            chart.getChartData().getCategories().add(wb.getCell(0, 1, 0, "A"));
            chart.getChartData().getCategories().add(wb.getCell(0, 2, 0, "B"));
            chart.getChartData().getCategories().add(wb.getCell(0, 3, 0, "C"));

            chart.getChartData().getSeries().add(wb.getCell(0, 0, 1, "Open"), chart.getType());
            chart.getChartData().getSeries().add(wb.getCell(0, 0, 2, "High"), chart.getType());
            chart.getChartData().getSeries().add(wb.getCell(0, 0, 3, "Low"), chart.getType());
            chart.getChartData().getSeries().add(wb.getCell(0, 0, 4, "Close"), chart.getType());

            IChartSeries series = chart.getChartData().getSeries().get_Item(0);

            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 1, 1, 72));
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 2, 1, 25));
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 3, 1, 38));

            series = chart.getChartData().getSeries().get_Item(1);
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 1, 2, 172));
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 2, 2, 57));
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 3, 2, 57));

            series = chart.getChartData().getSeries().get_Item(2);
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 1, 3, 12));
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 2, 3, 12));
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 3, 3, 13));

            series = chart.getChartData().getSeries().get_Item(3);
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 1, 4, 25));
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 2, 4, 38));
            series.getDataPoints().addDataPointForStockSeries(wb.getCell(0, 3, 4, 50));

            chart.getChartData().getSeriesGroups().get_Item(0).getUpDownBars().setUpDownBars(true);
            chart.getChartData().getSeriesGroups().get_Item(0).getHiLowLinesFormat().getLine().getFillFormat().setFillType(FillType.Solid);

            for (IChartSeries ser : chart.getChartData().getSeries()) {
                ser.getFormat().getLine().getFillFormat().setFillType(FillType.NoFill);
            }

            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SupportForStockChart
    }
}
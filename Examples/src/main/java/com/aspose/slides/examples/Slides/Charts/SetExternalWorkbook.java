/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartData;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

/**
 * @author mfazi
 */
public class SetExternalWorkbook {

    public static void main(String[] args) {

        String dataDir = Utils.getDataDir(SetExternalWorkbook.class);

        //ExStart:SetExternalWorkbook
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 400, 600, false);
            IChartData chartData = chart.getChartData();

            chartData.setExternalWorkbook(dataDir + "externalWorkbook.xlsx");

            chartData.getSeries().add(chartData.getChartDataWorkbook().getCell(0, "B1"), ChartType.Pie);
            chartData.getSeries().get_Item(0).getDataPoints().addDataPointForPieSeries(chartData.getChartDataWorkbook().getCell(0, "B2"));
            chartData.getSeries().get_Item(0).getDataPoints().addDataPointForPieSeries(chartData.getChartDataWorkbook().getCell(0, "B3"));
            chartData.getSeries().get_Item(0).getDataPoints().addDataPointForPieSeries(chartData.getChartDataWorkbook().getCell(0, "B4"));

            chartData.getCategories().add(chartData.getChartDataWorkbook().getCell(0, "A2"));
            chartData.getCategories().add(chartData.getChartDataWorkbook().getCell(0, "A3"));
            chartData.getCategories().add(chartData.getChartDataWorkbook().getCell(0, "A4"));
            pres.save(dataDir + "Presentation_with_externalWorkbook.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SetExternalWorkbook
    }
}

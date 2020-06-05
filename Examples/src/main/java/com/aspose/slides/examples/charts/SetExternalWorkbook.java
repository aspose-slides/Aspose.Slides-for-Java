package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SetExternalWorkbook
{
    public static void main(String[] args)
    {
        //ExStart:SetExternalWorkbook
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation();
        try
        {
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
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:SetExternalWorkbook
    }
}


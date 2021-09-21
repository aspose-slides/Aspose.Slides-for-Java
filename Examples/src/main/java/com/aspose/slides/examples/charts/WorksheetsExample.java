package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.Presentation;

/*
This example demonstrates using the IChartDataWorksheetCollection interface, ChartDataWorksheetCollection class, and IChartDataWorkbook.getWorksheets() method.
*/
public class WorksheetsExample
{
    public static void main(String[] args)
    {
        //ExStart:WorksheetsExample
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 400, 500);

            IChartDataWorkbook workbook = chart.getChartData().getChartDataWorkbook();
            for (int i = 0; i < workbook.getWorksheets().size(); i++)
            {
                System.out.println(workbook.getWorksheets().get_Item(i).getName());
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:WorksheetsExample
    }
}

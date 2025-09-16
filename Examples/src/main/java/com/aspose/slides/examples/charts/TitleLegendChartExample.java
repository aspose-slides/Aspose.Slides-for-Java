package com.aspose.slides.examples.charts;

import com.aspose.slides.*;

public class TitleLegendChartExample
{
    public static void main(String[] args)
    {
        //ExStart:TitleLegendChartExample
        Presentation pres = new Presentation();
        try {
            Chart chart = (Chart)pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 500, 350);
            chart.validateChartLayout();

            IChartTitle chartTitle = chart.getChartTitle();
            System.out.println("ChartTitle.X = " + chartTitle.getActualX() + ", ChartTitle.Y = " + chartTitle.getActualY());
            System.out.println("ChartTitle.Width = " + chartTitle.getActualWidth() + ", ChartTitle.Height = " + chartTitle.getActualHeight());

            ILegend legend = chart.getLegend();
            System.out.println("Legend.X = " + legend.getActualX() + ", Legend.Y = " + legend.getActualY());
            System.out.println("Legend.Width = " + legend.getActualWidth() + ", Legend.Height = " + legend.getActualHeight());
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:TitleLegendChartExample
    }
}

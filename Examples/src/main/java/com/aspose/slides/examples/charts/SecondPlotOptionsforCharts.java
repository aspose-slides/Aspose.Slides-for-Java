package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class SecondPlotOptionsforCharts
{
    public static void main(String[] args)
    {
        //ExStart:SecondPlotOptionsforCharts
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        // Add chart on slide
        IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.PieOfPie, 50, 50, 500, 400);

        // Set different properties
        chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(true);
        chart.getChartData().getSeries().get_Item(0).getParentSeriesGroup().setSecondPieSize(149);
        chart.getChartData().getSeries().get_Item(0).getParentSeriesGroup().setPieSplitBy(PieSplitType.ByPercentage);
        chart.getChartData().getSeries().get_Item(0).getParentSeriesGroup().setPieSplitPosition(53);

        // Write presentation to disk
        presentation.save(dataDir + "SecondPlotOptionsforCharts_out.pptx", SaveFormat.Pptx);
        //ExEnd:SecondPlotOptionsforCharts

    }
}

package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class DoughnutChartHole
{
    public static void main(String[] args)
    {
        //ExStart:DoughnutChartHole
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.Doughnut, 50, 50, 400, 400);
        chart.getChartData().getSeriesGroups().get_Item(0).setDoughnutHoleSize((byte) 90);

        // Write presentation to disk
        presentation.save(dataDir + "DoughnutHoleSize_out.pptx", SaveFormat.Pptx);
        //ExEnd:DoughnutChartHole
    }
}

package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class DisplayChartLabels
{
    public static void main(String[] args)
    {
        //ExStart:DisplayChartLabels
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation presentation = new Presentation();
        try
        {
            IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 500, 400);
            chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(true);
            chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowLabelAsDataCallout(true);
            chart.getChartData().getSeries().get_Item(0).getLabels().get_Item(2).getDataLabelFormat().setShowLabelAsDataCallout(false);
            presentation.save(dataDir + "DisplayChartLabels_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:DisplayChartLabels
    }
}

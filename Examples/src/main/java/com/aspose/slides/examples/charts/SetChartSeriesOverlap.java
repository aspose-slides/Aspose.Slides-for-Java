package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SetChartSeriesOverlap
{
    public static void main(String[] args)
    {
        //ExStart:SetChartSeriesOverlap
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation presentation = new Presentation();
        try
        {
            // Adding chart
            IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400, true);
            IChartSeriesCollection series = chart.getChartData().getSeries();
            if (series.get_Item(0).getOverlap() == 0)
            {
                // Setting series overlap
                series.get_Item(0).getParentSeriesGroup().setOverlap((byte) -30);
            }

            // Write the presentation file to disk
            presentation.save(dataDir + "SetChartSeriesOverlap_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetChartSeriesOverlap
    }
}

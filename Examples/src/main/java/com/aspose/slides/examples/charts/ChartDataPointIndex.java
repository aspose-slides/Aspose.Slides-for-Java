package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class ChartDataPointIndex
{
    public static void main(String[] args)
    {
        String dataDir = RunExamples.getDataDir_Charts();
        String pptxFile = dataDir + "ChartIndex.pptx";

        Presentation presentation = new Presentation(pptxFile);
        try {
            Chart chart = (Chart)presentation.getSlides().get_Item(0).getShapes().get_Item(0);
            for (IChartDataPoint dataPoint : chart.getChartData().getSeries().get_Item(0).getDataPoints())
            {
                System.out.println("Point with index " + dataPoint.getIndex() + " is applied to " + dataPoint.getValue());
            }
        } finally {
            if (presentation != null) presentation.dispose();
        }
    }
}

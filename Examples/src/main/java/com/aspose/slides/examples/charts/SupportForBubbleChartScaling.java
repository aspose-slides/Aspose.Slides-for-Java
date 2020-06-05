package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SupportForBubbleChartScaling
{
    public static void main(String[] args)
    {
        //ExStart:SupportForBubbleChartScaling
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Bubble, 100, 100, 400, 300);

            chart.getChartData().getSeriesGroups().get_Item(0).setBubbleSizeScale(150);
            ;

            pres.save(dataDir + "Result.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:SupportForBubbleChartScaling

    }
}

package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SettingPositionAxis
{
    public static void main(String[] args)
    {
        //ExStart:SettingPositionAxis
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 450, 300);
            chart.getAxes().getHorizontalAxis().setAxisBetweenCategories(true);

            pres.save(dataDir + "AsposeScatterChart.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SettingPositionAxis

    }
}

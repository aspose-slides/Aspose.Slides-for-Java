package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class FontPropertiesForChart
{
    public static void main(String[] args)
    {

        //ExStart:FontPropertiesForChart
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation();
        try
        {

            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 500, 400);
            chart.getTextFormat().getPortionFormat().setFontHeight(20);
            chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(true);
            pres.save(dataDir + "FontPropertiesForChart.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:FontPropertiesForChart

    }
}


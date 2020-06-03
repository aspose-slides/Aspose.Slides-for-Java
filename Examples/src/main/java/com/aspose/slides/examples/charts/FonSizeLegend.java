package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class FonSizeLegend
{
    public static void main(String[] args)
    {
        //ExStart:FontSizeLegend
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation(dataDir + "test.pptx");
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

            chart.getLegend().getTextFormat().getPortionFormat().setFontHeight(20);

            chart.getAxes().getVerticalAxis().setAutomaticMinValue(false);

            chart.getAxes().getVerticalAxis().setMinValue(-5);

            chart.getAxes().getVerticalAxis().setAutomaticMaxValue(false);

            chart.getAxes().getVerticalAxis().setMaxValue(10);

            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:FontSizeLegend
    }
}


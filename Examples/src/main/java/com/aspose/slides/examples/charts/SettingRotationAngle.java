package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SettingRotationAngle
{
    public static void main(String[] args)
    {
        //ExStart:SettingRotationAngle
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 450, 300);
            chart.getAxes().getVerticalAxis().setTitle(true);
            chart.getAxes().getVerticalAxis().getTitle().getTextFormat().getTextBlockFormat().setRotationAngle(90);

            pres.save(dataDir + "test.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SettingRotationAngle

    }
}

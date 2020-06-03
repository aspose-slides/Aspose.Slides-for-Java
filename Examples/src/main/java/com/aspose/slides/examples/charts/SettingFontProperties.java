package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SettingFontProperties
{
    public static void main(String[] args)
    {
        //ExStart:SettingFontProperties
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation(dataDir + "test.pptx");
        try
        {

            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

            chart.setDataTable(true);

            chart.getChartDataTable().getTextFormat().getPortionFormat().setFontBold(NullableBool.True);
            chart.getChartDataTable().getTextFormat().getPortionFormat().setFontHeight(20);

            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
    //ExEnd:SettingFontProperties
}

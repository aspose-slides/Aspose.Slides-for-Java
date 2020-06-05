package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SetExternalWorkbookWithUpdateChartData
{
    public static void main(String[] args)
    {

        //ExStart:SetExternalWorkbookWithUpdateChartData

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 400, 600, true);

            IChartData chartData = chart.getChartData();
            chartData.setExternalWorkbook("http://path/doesnt/exists", false);

            pres.save(dataDir + "SetExternalWorkbookWithUpdateChartData.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:SetExternalWorkbookWithUpdateChartData
    }
}        


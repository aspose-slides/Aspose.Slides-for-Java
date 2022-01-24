package com.aspose.slides.examples.charts;


import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class TimeUnitTypeEnum
{
    public static void main(String[] args)
    {
        //ExStart:SwitchChartRowColumns
        String resultPath = RunExamples.getOutPath() + "TimeUnitTypeEnum.pptx";

        // Creating empty presentation
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Area, 10, 10, 400, 300, true);
            chart.getAxes().getHorizontalAxis().setMajorUnitScale(TimeUnitType.None);
            pres.save(resultPath, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:TimeUnitTypeEnum
    }
}

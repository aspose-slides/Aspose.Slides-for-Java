package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ShowingDisplayUnitLabel
{
    public static void main(String[] args)
    {
        //ExStart:ShowingDisplayUnitLabel
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation(dataDir + "Test.pptx");
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 450, 300);
            chart.getAxes().getVerticalAxis().setDisplayUnit(DisplayUnitType.Millions);
            pres.save(dataDir + "Result.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ShowingDisplayUnitLabel
    }
}

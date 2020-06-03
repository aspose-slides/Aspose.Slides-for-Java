package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SupportForChartAreaRoundedBorders
{
    public static void main(String[] args)
    {
        //ExStart:SupportForChartAreaRoundedBorders
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation presentation = new Presentation();
        try
        {
            ISlide slide = presentation.getSlides().get_Item(0);
            IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 20, 100, 600, 400);
            chart.getLineFormat().getFillFormat().setFillType(FillType.Solid);
            chart.getLineFormat().setStyle(LineStyle.Single);
            chart.setRoundedCorners(true);
            ;

            presentation.save(dataDir + "out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
    }
    //ExEnd:SupportForChartAreaRoundedBorders
}


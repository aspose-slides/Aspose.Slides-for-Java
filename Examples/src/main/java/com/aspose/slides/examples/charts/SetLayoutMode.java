package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SetLayoutMode
{
    public static void main(String[] args)
    {

        //ExStart:SetLayoutMode
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation presentation = new Presentation();
        try
        {
            ISlide slide = presentation.getSlides().get_Item(0);
            IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 20, 100, 600, 400);
            chart.getPlotArea().setX(0.2f);
            chart.getPlotArea().setY(0.2f);
            chart.getPlotArea().setWidth(0.7f);
            chart.getPlotArea().setHeight(0.7f);
            chart.getPlotArea().setLayoutTargetType(LayoutTargetType.Inner);

            presentation.save(dataDir + "SetLayoutMode_outer.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetLayoutMode
    }
}


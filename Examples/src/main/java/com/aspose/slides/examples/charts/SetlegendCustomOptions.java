package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SetlegendCustomOptions
{
    public static void main(String[] args)
    {
        //ExStart:SetlegendCustomOptions
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();
        try
        {
            // Get reference of the slide
            ISlide slide = presentation.getSlides().get_Item(0);

            // Add a clustered column chart on the slide
            IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 500, 500);

            // Set Legend Properties
            chart.getLegend().setX(50 / chart.getWidth());
            chart.getLegend().setY(50 / chart.getHeight());
            chart.getLegend().setWidth(100 / chart.getWidth());
            chart.getLegend().setHeight(100 / chart.getHeight());

            // Write presentation to disk
            presentation.save(dataDir + "Legend_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetlegendCustomOptions
    }
}

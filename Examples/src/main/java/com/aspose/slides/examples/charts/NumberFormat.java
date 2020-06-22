package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class NumberFormat
{
    public static void main(String[] args)
    {
        //ExStart:NumberFormat
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate the presentation// Instantiate the presentation
        Presentation pres = new Presentation();
        try
        {
            // Access the first presentation slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Adding a defautlt clustered column chart
            IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 500, 400);

            // Accessing the chart series collection
            IChartSeriesCollection series = chart.getChartData().getSeries();

            // Setting the preset number format
            // Traverse through every chart series
            for (IChartSeries ser : series)
            {
                // Traverse through every data cell in series
                for (IChartDataPoint cell : ser.getDataPoints())
                {
                    // Setting the number format
                    cell.getValue().getAsCell().setPresetNumberFormat((byte) 10); //0.00%
                }
            }

            // Saving presentation
            pres.save(dataDir + "PresetNumberFormat_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:NumberFormat
    }
}

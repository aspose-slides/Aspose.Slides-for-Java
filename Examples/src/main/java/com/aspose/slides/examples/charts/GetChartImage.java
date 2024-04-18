package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;



public class GetChartImage
{
    public static void main(String[] args)
    {
        //ExStart:GetChartImage
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation(dataDir + "test.pptx");
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);
            IImage img = chart.getImage();
            img.save(dataDir + "image.png", ImageFormat.Png);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetChartImage
    }
}


package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GetChartImage
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:GetChartImage
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation(dataDir + "test.pptx");
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);
            BufferedImage img = chart.getThumbnail();
            ImageIO.write(img, ".png", new File(dataDir + "image.png"));
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetChartImage
    }
}


package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;

import static com.aspose.slides.FilterEffectType.Image;

import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

import java.awt.Image;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GetChartImage {


    public static void main(String[] args) throws IOException {

        String dataDir = Utils.getDataDir(GetChartImage.class);

        //ExStart:GetChartImage
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

            BufferedImage img = chart.getThumbnail();
            ImageIO.write(img, "png", new File(dataDir + "result.png"));
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetChartImage
    }
}

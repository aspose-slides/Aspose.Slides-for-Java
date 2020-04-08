package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SupportForChartAreaRoundedBorders {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SupportForChartAreaRoundedBorders.class);

        //ExStart:SupportForChartAreaRoundedBorders
        // Instantiate the presentation
        Presentation presentation = new Presentation(dataDir + "Test.pptx");
        try {
            ISlide slide = presentation.getSlides().get_Item(0);

            IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 20, 100, 600, 400);
            chart.setRoundedCorners(true);

            presentation.save("output.pptx", SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SupportForChartAreaRoundedBorders
    }
}
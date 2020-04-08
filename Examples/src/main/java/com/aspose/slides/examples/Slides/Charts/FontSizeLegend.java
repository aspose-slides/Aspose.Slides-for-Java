package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class FontSizeLegend {
    public static void main(String[] args) {

        String dataDir = Utils.getDataDir(FontSizeLegend.class);

        //ExStart:FontSizeLegend
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

            chart.getLegend().getTextFormat().getPortionFormat().setFontHeight(20);
            chart.getAxes().getVerticalAxis().setAutomaticMinValue(false);
            chart.getAxes().getVerticalAxis().setMinValue(-5);
            chart.getAxes().getVerticalAxis().setAutomaticMaxValue(false);
            chart.getAxes().getVerticalAxis().setMaxValue(10);

            pres.save("output.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
    }
    //ExEnd:FontSizeLegend
}


package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class FontPropertiesForChart {
    public static void main(String[] args) {

        String dataDir = Utils.getDataDir(FontPropertiesForChart.class);

        //ExStart:FontPropertiesForChart
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 500, 400);
            chart.getTextFormat().getPortionFormat().setFontHeight(20);
            chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(true);
            pres.save(dataDir + "FontPropertiesForChart.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FontPropertiesForChart
    }
}

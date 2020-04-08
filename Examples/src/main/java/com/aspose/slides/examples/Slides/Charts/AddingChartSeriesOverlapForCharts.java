package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartSeriesCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddingChartSeriesOverlapForCharts {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddingChartSeriesOverlapForCharts.class);

        //ExStart:AddingChartSeriesOverlapForCharts
        // Creating empty presentation
        Presentation pres = new Presentation();
        try {
            // Adding chart
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400, true);
            IChartSeriesCollection series = chart.getChartData().getSeries();
            if (series.get_Item(0).getOverlap() == 0) {
                // Setting series overlap
                series.get_Item(0).getParentSeriesGroup().setOverlap((byte) -30);
            }

            // Saving presentation
            pres.save(dataDir + "ErrorBars.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddingChartSeriesOverlapForCharts
    }

}

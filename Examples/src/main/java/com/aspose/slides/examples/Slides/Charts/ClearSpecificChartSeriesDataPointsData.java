package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataPoint;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class ClearSpecificChartSeriesDataPointsData {

    public static void main(String[] args) {

        String dataDir = Utils.getDataDir(ClearSpecificChartSeriesDataPointsData.class);

        //ExStart:ClearSpecificChartSeriesDataPointsData
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation(dataDir + "TestChart.pptx");
        try {
            // Accessing the first slide in presentation
            ISlide slide = pres.getSlides().get_Item(0);

            IChart chart = (IChart) slide.getShapes().get_Item(0);

            for (IChartDataPoint dataPoint : chart.getChartData().getSeries().get_Item(0).getDataPoints()) {

                dataPoint.getXValue().getAsCell().setValue(null);
                dataPoint.getYValue().getAsCell().setValue(null);
            }

            chart.getChartData().getSeries().get_Item(0).getDataPoints().clear();

            pres.save(dataDir + "ClearSpecificChartSeriesDataPointsData.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ClearSpecificChartSeriesDataPointsData
    }
}

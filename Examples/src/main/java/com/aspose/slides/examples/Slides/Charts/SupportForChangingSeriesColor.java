package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataPoint;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

import java.awt.Color;

public class SupportForChangingSeriesColor {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SupportForChangingSeriesColor.class);

        //ExStart:SupportForChangingSeriesColor
        // Instantiate the presentation
        Presentation pres = new Presentation(dataDir + "Test.pptx");
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 600, 400);

            IChartDataPoint point = chart.getChartData().getSeries().get_Item(0).getDataPoints().get_Item(1);

            point.setExplosion(30);
            point.getFormat().getFill().setFillType(FillType.Solid);
            point.getFormat().getFill().getSolidFillColor().setColor(Color.BLUE);

            pres.save("output.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SupportForChangingSeriesColor
    }
}
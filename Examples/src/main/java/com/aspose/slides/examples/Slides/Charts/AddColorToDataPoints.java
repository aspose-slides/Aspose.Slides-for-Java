package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartCategory;
import com.aspose.slides.IChartDataPointCollection;
import com.aspose.slides.IChartDataPointLevel;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IDataLabel;
import com.aspose.slides.IFormat;
import com.aspose.slides.ISlide;
import com.aspose.slides.ParentLabelLayoutType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

import java.awt.Color;


public class AddColorToDataPoints {

    public static void main(String[] args) {

        String dataDir = Utils.getDataDir(AddColorToDataPoints.class);

        //ExStart:AddColorToDataPoints
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Sunburst, 100, 100, 450, 400);
            IChartDataPointCollection dataPoints = chart.getChartData().getSeries().get_Item(0).getDataPoints();
            dataPoints.get_Item(3).getDataPointLevels().get_Item(0).getLabel().getDataLabelFormat().setShowValue(true);


            IDataLabel branch1Label = dataPoints.get_Item(0).getDataPointLevels().get_Item(2).getLabel();
            branch1Label.getDataLabelFormat().setShowCategoryName(false);
            branch1Label.getDataLabelFormat().setShowSeriesName(true);

            branch1Label.getDataLabelFormat().getTextFormat().getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            branch1Label.getDataLabelFormat().getTextFormat().getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.YELLOW);

            IFormat steam4Format = dataPoints.get_Item(9).getDataPointLevels().get_Item(1).getFormat();
            steam4Format.getFill().setFillType(FillType.Solid);
            steam4Format.getFill().getSolidFillColor().setColor(new Color(0, 176, 240, 255));
            pres.save(dataDir + "AddColorToDataPoints.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddColorToDataPoints
    }
}

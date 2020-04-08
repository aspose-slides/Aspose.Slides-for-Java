/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.ISlide;
import com.aspose.slides.LegendDataLabelPosition;
import com.aspose.slides.LineDashStyle;
import com.aspose.slides.MarkerStyleType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

import java.awt.Color;


public class HideInformationFromChart {

    public static void main(String[] args) {


        // The path to the documents directory.
        String dataDir = Utils.getDataDir(HideInformationFromChart.class);

        //ExStart:HideInformationFromChart
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation();
        try {
            ISlide slide = pres.getSlides().get_Item(0);
            IChart chart = slide.getShapes().addChart(ChartType.LineWithMarkers, 140, 118, 320, 370);

            //Hiding chart Title
            chart.setTitle(false);

            ///Hiding Values axis
            chart.getAxes().getVerticalAxis().setVisible(false);

            //Category Axis visibility
            chart.getAxes().getHorizontalAxis().setVisible(false);

            //Hiding Legend
            chart.setLegend(false);

            //Hiding MajorGridLines
            chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().getFillFormat().setFillType(FillType.NoFill);

            for (int i = 0; i < chart.getChartData().getSeries().size(); i++) {
                chart.getChartData().getSeries().removeAt(i);
            }

            IChartSeries series = chart.getChartData().getSeries().get_Item(0);

            series.getMarker().setSymbol(MarkerStyleType.Circle);
            series.getLabels().getDefaultDataLabelFormat().setShowValue(true);
            series.getLabels().getDefaultDataLabelFormat().setPosition(LegendDataLabelPosition.Top);
            series.getMarker().setSize(15);

            //Setting series line color
            series.getFormat().getLine().getFillFormat().setFillType(FillType.Solid);
            series.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.MAGENTA);
            series.getFormat().getLine().setDashStyle(LineDashStyle.Solid);

            pres.save(dataDir + "HideInformationFromChart.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:HideInformationFromChart 
    }
}

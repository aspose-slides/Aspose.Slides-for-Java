package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class HideInformationFromChart
{
    public static void main(String[] args)
    {

        //ExStart:HideInformationFromChart
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation();
        try
        {
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

            for (int i = 0; i < chart.getChartData().getSeries().size(); i++)
            {
                chart.getChartData().getSeries().removeAt(i);
            }

            IChartSeries series = chart.getChartData().getSeries().get_Item(0);

            series.getMarker().setSymbol(MarkerStyleType.Circle);
            series.getLabels().getDefaultDataLabelFormat().setShowValue(true);
            series.getLabels().getDefaultDataLabelFormat().setPosition(LegendDataLabelPosition.Top);
            series.getMarker().setSize(15);

            //Setting series line color
            series.getFormat().getLine().getFillFormat().setFillType(FillType.Solid);
            series.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Purple));
            series.getFormat().getLine().setDashStyle(LineDashStyle.Solid);

            pres.save(dataDir + "HideInformationFromChart.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:HideInformationFromChart
    }
}


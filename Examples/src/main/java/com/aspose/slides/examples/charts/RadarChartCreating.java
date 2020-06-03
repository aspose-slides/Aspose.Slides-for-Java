package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class RadarChartCreating
{
    public static void main(String[] args)
    {
        String outPath = RunExamples.OutPath + File.separator + "RadarChart_Out.pptx";

        Presentation pres = new Presentation();
        try
        {
            // Access first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add Radar chart
            IChart ichart = sld.getShapes().addChart(ChartType.Radar, 0, 0, 400, 400);

            // Setting the index of chart data sheet
            int defaultWorksheetIndex = 0;

            // Getting the chart data WorkSheet
            IChartDataWorkbook fact = ichart.getChartData().getChartDataWorkbook();

            // Set chart title
            ichart.getChartTitle().addTextFrameForOverriding("Radar Chart");

            // Delete default generated series and categories
            ichart.getChartData().getCategories().clear();
            ichart.getChartData().getSeries().clear();

            // Adding new categories
            ichart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 1, 0, "Caetegoty 1"));
            ichart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 2, 0, "Caetegoty 3"));
            ichart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 3, 0, "Caetegoty 5"));
            ichart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 4, 0, "Caetegoty 7"));
            ichart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 5, 0, "Caetegoty 9"));
            ichart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 6, 0, "Caetegoty 11"));

            // Adding new series
            ichart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 1, "Series 1"), ichart.getType());
            ichart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 2, "Series 2"), ichart.getType());

            // Now populating series data
            IChartSeries series = ichart.getChartData().getSeries().get_Item(0);
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 1, 1, 2.7));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 2.4));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 1.5));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 4, 1, 3.5));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 5, 1, 5));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 6, 1, 3.5));

            // Set series color
            series.getFormat().getLine().getFillFormat().setFillType(FillType.Solid);
            series.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.RED);

            // Now populating another series data
            series = ichart.getChartData().getSeries().get_Item(1);
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 1, 2, 2.5));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 2, 2, 2.4));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 3, 2, 1.6));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 4, 2, 3.5));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 5, 2, 4));
            series.getDataPoints().addDataPointForRadarSeries(fact.getCell(defaultWorksheetIndex, 6, 2, 3.6));

            // Set series color
            series.getFormat().getLine().getFillFormat().setFillType(FillType.Solid);
            series.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.ORANGE);

            // Set legend position
            ichart.getLegend().setPosition(LegendPositionType.Bottom);

            // Setting Category Axis Text Properties
            IChartPortionFormat txtCat = ichart.getAxes().getHorizontalAxis().getTextFormat().getPortionFormat();
            txtCat.setFontBold(NullableBool.True);
            txtCat.setFontHeight(10);
            txtCat.getFillFormat().setFillType(FillType.Solid);
            txtCat.getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.DimGray));
            txtCat.setLatinFont(new FontData("Calibri"));

            // Setting Legends Text Properties
            IChartPortionFormat txtleg = ichart.getLegend().getTextFormat().getPortionFormat();
            txtleg.setFontBold(NullableBool.True);
            txtleg.setFontHeight(10);
            txtleg.getFillFormat().setFillType(FillType.Solid);
            txtleg.getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.DimGray));
            txtCat.setLatinFont(new FontData("Calibri"));

            // Setting Value Axis Text Properties
            IChartPortionFormat txtVal = ichart.getAxes().getVerticalAxis().getTextFormat().getPortionFormat();
            txtVal.setFontBold(NullableBool.True);
            txtVal.setFontHeight(10);
            txtVal.getFillFormat().setFillType(FillType.Solid);
            txtVal.getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.DimGray));
            txtVal.setLatinFont(new FontData("Calibri"));

            // Setting value axis number format
            ichart.getAxes().getVerticalAxis().setNumberFormatLinkedToSource(false);
            ichart.getAxes().getVerticalAxis().setNumberFormat("\"$\"#,##0.00");

            // Setting chart major unit value
            ichart.getAxes().getVerticalAxis().setAutomaticMajorUnit(false);
            ichart.getAxes().getVerticalAxis().setMajorUnit(1.25f);

            // Save generated presentation
            pres.save(outPath, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}

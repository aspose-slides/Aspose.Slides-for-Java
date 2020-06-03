package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class SetDataLabelsPercentageSign
{
    public static void main(String[] args)
    {
        //ExStart:SetDataLabelsPercentageSign
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        // Get reference of the slide
        ISlide slide = presentation.getSlides().get_Item(0);

        // Add PercentsStackedColumn chart on a slide
        IChart chart = slide.getShapes().addChart(ChartType.PercentsStackedColumn, 20, 20, 500, 400);

        // Set NumberFormatLinkedToSource to false
        chart.getAxes().getVerticalAxis().setNumberFormatLinkedToSource(false);
        chart.getAxes().getVerticalAxis().setNumberFormat("0.00%");

        chart.getChartData().getSeries().clear();
        int defaultWorksheetIndex = 0;

        // Getting the chart data worksheet
        IChartDataWorkbook workbook = chart.getChartData().getChartDataWorkbook();

        // Add new series
        IChartSeries series = chart.getChartData().getSeries().add(workbook.getCell(defaultWorksheetIndex, 0, 1, "Reds"), chart.getType());
        series.getDataPoints().addDataPointForBarSeries(workbook.getCell(defaultWorksheetIndex, 1, 1, 0.30));
        series.getDataPoints().addDataPointForBarSeries(workbook.getCell(defaultWorksheetIndex, 2, 1, 0.50));
        series.getDataPoints().addDataPointForBarSeries(workbook.getCell(defaultWorksheetIndex, 3, 1, 0.80));
        series.getDataPoints().addDataPointForBarSeries(workbook.getCell(defaultWorksheetIndex, 4, 1, 0.65));

        // Setting the fill color of series
        series.getFormat().getFill().setFillType(FillType.Solid);
        series.getFormat().getFill().getSolidFillColor().setColor(Color.RED);

        // Setting LabelFormat properties
        series.getLabels().getDefaultDataLabelFormat().setShowValue(true);
        series.getLabels().getDefaultDataLabelFormat().setNumberFormatLinkedToSource(false);
        series.getLabels().getDefaultDataLabelFormat().setNumberFormat("0.0%");
        series.getLabels().getDefaultDataLabelFormat().getTextFormat().getPortionFormat().setFontHeight(10);
        series.getLabels().getDefaultDataLabelFormat().getTextFormat().getPortionFormat().getFillFormat().setFillType(FillType.Solid);
        series.getLabels().getDefaultDataLabelFormat().getTextFormat().getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.WHITE);
        series.getLabels().getDefaultDataLabelFormat().setShowValue(true);

        // Add new series
        IChartSeries series2 = chart.getChartData().getSeries().add(workbook.getCell(defaultWorksheetIndex, 0, 2, "Blues"), chart.getType());
        series2.getDataPoints().addDataPointForBarSeries(workbook.getCell(defaultWorksheetIndex, 1, 2, 0.70));
        series2.getDataPoints().addDataPointForBarSeries(workbook.getCell(defaultWorksheetIndex, 2, 2, 0.50));
        series2.getDataPoints().addDataPointForBarSeries(workbook.getCell(defaultWorksheetIndex, 3, 2, 0.20));
        series2.getDataPoints().addDataPointForBarSeries(workbook.getCell(defaultWorksheetIndex, 4, 2, 0.35));

        // Setting Fill type and color
        series2.getFormat().getFill().setFillType(FillType.Solid);
        series2.getFormat().getFill().getSolidFillColor().setColor(Color.BLUE);
        series2.getLabels().getDefaultDataLabelFormat().setShowValue(true);
        series2.getLabels().getDefaultDataLabelFormat().setNumberFormatLinkedToSource(false);
        series2.getLabels().getDefaultDataLabelFormat().setNumberFormat("0.0%");
        series2.getLabels().getDefaultDataLabelFormat().getTextFormat().getPortionFormat().setFontHeight(10);
        series2.getLabels().getDefaultDataLabelFormat().getTextFormat().getPortionFormat().getFillFormat().setFillType(FillType.Solid);
        series2.getLabels().getDefaultDataLabelFormat().getTextFormat().getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.WHITE);

        // Write presentation to disk
        presentation.save(dataDir + "SetDataLabelsPercentageSign_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetDataLabelsPercentageSign
    }
}

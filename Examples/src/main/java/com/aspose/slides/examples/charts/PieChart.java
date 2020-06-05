package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;





public class PieChart
{
    public static void main(String[] args)
    {
        //ExStart:PieChart
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Instantiate Presentation class that represents PPTX file
        Presentation presentation = new Presentation();

        // Access first slide
        ISlide slides = presentation.getSlides().get_Item(0);

        // Add chart with default data
        IChart chart = slides.getShapes().addChart(ChartType.Pie, 100, 100, 400, 400);

        // Setting chart Title
        chart.getChartTitle().addTextFrameForOverriding("Sample Title");
        chart.getChartTitle().getTextFrameForOverriding().getTextFrameFormat().setCenterText(NullableBool.True);
        chart.getChartTitle().setHeight(20);
        chart.setTitle(true);

        // Set first series to Show Values
        chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(true);

        // Setting the index of chart data sheet
        int defaultWorksheetIndex = 0;

        // Getting the chart data worksheet
        IChartDataWorkbook fact = chart.getChartData().getChartDataWorkbook();

        // Delete default generated series and categories
        chart.getChartData().getSeries().clear();
        chart.getChartData().getCategories().clear();

        // Adding new categories
        chart.getChartData().getCategories().add(fact.getCell(0, 1, 0, "First Qtr"));
        chart.getChartData().getCategories().add(fact.getCell(0, 2, 0, "2nd Qtr"));
        chart.getChartData().getCategories().add(fact.getCell(0, 3, 0, "3rd Qtr"));

        // Adding new series
        IChartSeries series = chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType());

        // Now populating series data
        series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 1, 1, 20));
        series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 50));
        series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 30));

        // Not working in new version
        // Adding new points and setting sector color
        // series.IsColorVaried = true;
        chart.getChartData().getSeriesGroups().get_Item(0).setColorVaried(true);

        IChartDataPoint point = series.getDataPoints().get_Item(0);
        point.getFormat().getFill().setFillType(FillType.Solid);
        point.getFormat().getFill().getSolidFillColor().setColor(new Color(PresetColor.Cyan));
        // Setting Sector border
        point.getFormat().getLine().getFillFormat().setFillType(FillType.Solid);
        point.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.GRAY);
        point.getFormat().getLine().setWidth(3.0);
        point.getFormat().getLine().setStyle(LineStyle.ThinThick);
        point.getFormat().getLine().setDashStyle(LineDashStyle.DashDot);

        IChartDataPoint point1 = series.getDataPoints().get_Item(1);
        point1.getFormat().getFill().setFillType(FillType.Solid);
        point1.getFormat().getFill().getSolidFillColor().setColor(new Color(PresetColor.Brown));

        // Setting Sector border
        point1.getFormat().getLine().getFillFormat().setFillType(FillType.Solid);
        point1.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
        point1.getFormat().getLine().setWidth(3.0);
        point1.getFormat().getLine().setStyle(LineStyle.Single);
        point1.getFormat().getLine().setDashStyle(LineDashStyle.LargeDashDot);

        IChartDataPoint point2 = series.getDataPoints().get_Item(2);
        point2.getFormat().getFill().setFillType(FillType.Solid);
        point2.getFormat().getFill().getSolidFillColor().setColor(new Color(PresetColor.Coral));

        // Setting Sector border
        point2.getFormat().getLine().getFillFormat().setFillType(FillType.Solid);
        point2.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.RED);
        point2.getFormat().getLine().setWidth(2.0);
        point2.getFormat().getLine().setStyle(LineStyle.ThinThin);
        point2.getFormat().getLine().setDashStyle(LineDashStyle.LargeDashDotDot);

        // Create custom labels for each of categories for new series
        IDataLabel lbl1 = series.getDataPoints().get_Item(0).getLabel();

        // lbl.setShowCategoryName(true);
        lbl1.getDataLabelFormat().setShowValue(true);

        IDataLabel lbl2 = series.getDataPoints().get_Item(1).getLabel();
        lbl2.getDataLabelFormat().setShowValue(true);
        lbl2.getDataLabelFormat().setShowLegendKey(true);
        lbl2.getDataLabelFormat().setShowPercentage(true);

        IDataLabel lbl3 = series.getDataPoints().get_Item(2).getLabel();
        lbl3.getDataLabelFormat().setShowSeriesName(true);
        lbl3.getDataLabelFormat().setShowPercentage(true);

        // Showing Leader Lines for Chart
        series.getLabels().getDefaultDataLabelFormat().setShowLeaderLines(true);

        // Setting Rotation Angle for Pie Chart Sectors
        chart.getChartData().getSeriesGroups().get_Item(0).setFirstSliceAngle(180);

        // Save presentation with chart
        presentation.save(dataDir + "PieChart_out.pptx", SaveFormat.Pptx);
        //ExEnd:PieChart
    }
}

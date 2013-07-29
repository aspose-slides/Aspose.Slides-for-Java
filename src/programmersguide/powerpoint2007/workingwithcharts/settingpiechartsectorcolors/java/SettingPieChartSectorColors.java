/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithcharts.settingpiechartsectorcolors.java;

import com.aspose.slides.*;

public class SettingPieChartSectorColors
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithcharts/settingpiechartsectorcolors/data/";

        //Instantiate PresentationEx class that represents PPTX file
        PresentationEx pres = new PresentationEx();

        //Access first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        // Add chart with default data
        ChartEx chart = sld.getShapes().addChart(ChartTypeEx.Pie, 100, 100, 400, 400);

        //Setting chart Title
        chart.getChartTitle().getText().setText( "Sample Title");
        chart.getChartTitle().getText().setCenterText(true);
        chart.getChartTitle().setHeight(20);
        chart.hasTitle(true);

        //Set first series to Show Values
        chart.getChartData().getSeries().get_Item(0).getLabels().setShowValue(true);

        //Setting the index of chart data sheet
        int defaultWorksheetIndex = 0;

        //Getting the chart data worksheet
        ChartDataCellFactory fact = chart.getChartData().getChartDataCellFactory();

        //Delete default generated series and categories

        chart.getChartData().getSeries().clear();
        chart.getChartData().getCategories().clear();

        //Adding new categories
        chart.getChartData().getCategories().add(fact.getCell(0, 1, 0, "First Qtr"));
        chart.getChartData().getCategories().add(fact.getCell(0, 2, 0, "2nd Qtr"));
        chart.getChartData().getCategories().add(fact.getCell(0, 3, 0, "3rd Qtr"));

        //Adding new series
        int Id=chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType());

        //Accessing added series
        ChartSeriesEx series = chart.getChartData().getSeries().get_Item(Id);

        //Now populating series data
        series.getValues().add(fact.getCell(defaultWorksheetIndex, 1, 1, 20));
        series.getValues().add(fact.getCell(defaultWorksheetIndex, 2, 1, 50));
        series.getValues().add(fact.getCell(defaultWorksheetIndex, 3, 1, 30));

        //Adding new points and setting sector color
        series.isColorVaried(true);
        ChartPointEx point = new ChartPointEx(series);
        point.setIndex(0);
        point.getFormat().getFill().setFillType(FillTypeEx.Solid);
        point.getFormat().getFill().getSolidFillColor().setPresetColor(com.aspose.slides.PresetColorEx.Cyan);
        //Setting Sector border
        point.getFormat().getLine().getFillFormat().setFillType(FillTypeEx.Solid);
        point.getFormat().getLine().getFillFormat().getSolidFillColor().setPresetColor(com.aspose.slides.PresetColorEx.Gray);
        point.getFormat().getLine().setWidth(3.0);
        point.getFormat().getLine().setStyle(LineStyleEx.ThinThick);
        point.getFormat().getLine().setDashStyle(LineDashStyleEx.DashDot);



        ChartPointEx point1 = new ChartPointEx(series);
        point1.setIndex(1);
        point1.getFormat().getFill().setFillType(FillTypeEx.Solid);
        point1.getFormat().getFill().getSolidFillColor().setPresetColor(com.aspose.slides.PresetColorEx.Brown);

        //Setting Sector border
        point1.getFormat().getLine().getFillFormat().getSolidFillColor().setPresetColor(com.aspose.slides.PresetColorEx.Blue);
        point1.getFormat().getLine().setWidth( 3.0);
        point1.getFormat().getLine().setStyle (LineStyleEx.Single);
        point1.getFormat().getLine().setDashStyle(LineDashStyleEx.LargeDashDot);

        ChartPointEx point2 = new ChartPointEx(series);
        point2.setIndex(2);
        point2.getFormat().getFill().setFillType(FillTypeEx.Solid);
        point2.getFormat().getFill().getSolidFillColor().setPresetColor(com.aspose.slides.PresetColorEx.Coral);

        //Setting Sector border
        point2.getFormat().getLine().getFillFormat().setFillType(FillTypeEx.Solid);
        point2.getFormat().getLine().getFillFormat().getSolidFillColor().setPresetColor(com.aspose.slides.PresetColorEx.Red);
        point2.getFormat().getLine().setWidth(2.0);
        point2.getFormat().getLine().setStyle(LineStyleEx.ThinThin);
        point2.getFormat().getLine().setDashStyle(LineDashStyleEx.LargeDashDotDot);

        //Adding Series Points
        series.getPoints().add(point);
        series.getPoints().add(point1);
        series.getPoints().add(point2);

        //Create custom labels for each of categories for new series

        DataLabelEx lbl = new DataLabelEx(series);
        // lbl.ShowCategoryName = true;
        lbl.setShowValue(true);
        lbl.setId(0);
        series.getLabels().add(lbl);

        //Showing Leader Lines for Chart
        series.getLabels().setShowLeaderLines(true);

        //Setting Rotation Angle for Pie Chart Sectors
        chart.getChartData().getSeries().get_Item(0).setFirstSliceAngle(180);

        // Save presentation with chart
        pres.write(dataDir + "AsposeChart.pptx");


        // Status
        System.out.println("Process completed successfully.");
    }
}





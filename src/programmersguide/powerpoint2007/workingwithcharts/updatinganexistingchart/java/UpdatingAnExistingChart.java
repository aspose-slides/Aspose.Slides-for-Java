/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithcharts.updatinganexistingchart.java;

import com.aspose.slides.*;

public class UpdatingAnExistingChart
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithcharts/updatinganexistingchart/data/";

        //Instantiate PresentationEx class that represents PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "AsposeChart.pptx");

        //Access first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        // Add chart with default data
        ChartEx chart = (ChartEx)sld.getShapes().get_Item(0);

        //Setting the index of chart data sheet
        int defaultWorksheetIndex = 0;

        //Getting the chart data worksheet
        ChartDataCellFactory fact = chart.getChartData().getChartDataCellFactory();

        //Take first chart series
        ChartSeriesEx series = chart.getChartData().getSeries().get_Item(0);

        //Now updating series data
        fact.getCell(defaultWorksheetIndex, 0, 1, "New_Series1");//modifying series name
        series.getValues().get_Item(0).setValue(90);
        series.getValues().get_Item(1).setValue(123);
        series.getValues().get_Item(2).setValue(44);

        //Take Second chart series
        series = chart.getChartData().getSeries().get_Item(1);

        //Now updating series data
        fact.getCell(defaultWorksheetIndex, 0, 2, "New_Series2");//modifying series name
        series.getValues().get_Item(0).setValue(23);
        series.getValues().get_Item(1).setValue(67);
        series.getValues().get_Item(2).setValue(99);


        //Now, Adding a new series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 3, "Series 3"), chart.getType());

        //Take 3rd chart series
        series = chart.getChartData().getSeries().get_Item(2);

        //Now populating series data
        series.getValues().add(fact.getCell(defaultWorksheetIndex, 1, 3, 20));
        series.getValues().add(fact.getCell(defaultWorksheetIndex, 2, 3, 50));
        series.getValues().add(fact.getCell(defaultWorksheetIndex, 3, 3, 30));

        chart.setType(ChartTypeEx.ClusteredCylinder);

        // Save presentation with chart
        pres.write(dataDir + "AsposeChartMoodified.pptx");

        // Status
        System.out.println("Chart updated successfully.");
    }
}





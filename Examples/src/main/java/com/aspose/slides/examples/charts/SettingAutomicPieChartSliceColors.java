package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SettingAutomicPieChartSliceColors
{
    public static void main(String[] args)
    {
        //ExStart:SettingAutomicPieChartSliceColors
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        // Instantiate Presentation class that represents PPTX file
        Presentation presentation = new Presentation();
        try
        {

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

            series.getParentSeriesGroup().setColorVaried(true);
            presentation.save(dataDir + "Pie.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
    }
    //ExEnd:SettingAutomicPieChartSliceColors
}


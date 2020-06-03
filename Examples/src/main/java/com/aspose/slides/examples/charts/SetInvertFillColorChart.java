package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SetInvertFillColorChart
{
    public static void main(String[] args)
    {
        //ExStart:SetInvertFillColorChart
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        Color inverColor = Color.RED;
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 400, 300);
            IChartDataWorkbook workBook = chart.getChartData().getChartDataWorkbook();

            chart.getChartData().getSeries().clear();
            chart.getChartData().getCategories().clear();

            // Adding new series and categories
            chart.getChartData().getSeries().add(workBook.getCell(0, 0, 1, "Series 1"), chart.getType());
            chart.getChartData().getCategories().add(workBook.getCell(0, 1, 0, "Category 1"));
            chart.getChartData().getCategories().add(workBook.getCell(0, 2, 0, "Category 2"));
            chart.getChartData().getCategories().add(workBook.getCell(0, 3, 0, "Category 3"));

            // Take first chart series and populating series data.
            IChartSeries series = chart.getChartData().getSeries().get_Item(0);
            series.getDataPoints().addDataPointForBarSeries(workBook.getCell(0, 1, 1, -20));
            series.getDataPoints().addDataPointForBarSeries(workBook.getCell(0, 2, 1, 50));
            series.getDataPoints().addDataPointForBarSeries(workBook.getCell(0, 3, 1, -30));
            Color seriesColor = series.getAutomaticSeriesColor();
            series.setInvertIfNegative(true);
            series.getFormat().getFill().setFillType(FillType.Solid);
            series.getFormat().getFill().getSolidFillColor().setColor(seriesColor);
            series.getInvertedSolidFillColor().setColor(Color.RED);
            pres.save(dataDir + "SetInvertFillColorChart_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SetInvertFillColorChart
    }
}

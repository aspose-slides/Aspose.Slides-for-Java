package com.aspose.slides.examples.charts;

import com.aspose.slides.Chart;
import com.aspose.slides.ChartType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class GetValuesAndUnitScaleFromAxis
{
    public static void main(String[] args)
    {
        //ExStart:GetValuesAndUnitScaleFromAxis
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation();
        try
        {
            Chart chart = (Chart) pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Area, 100, 100, 500, 350);
            chart.validateChartLayout();

            double maxValue = chart.getAxes().getVerticalAxis().getActualMaxValue();
            double minValue = chart.getAxes().getVerticalAxis().getActualMinValue();

            double majorUnit = chart.getAxes().getHorizontalAxis().getActualMajorUnit();
            double minorUnit = chart.getAxes().getHorizontalAxis().getActualMinorUnit();

            // Saving presentation
            pres.save(dataDir + "ErrorBars_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }


    }
    //ExEnd:GetValuesAndUnitScaleFromAxis
}


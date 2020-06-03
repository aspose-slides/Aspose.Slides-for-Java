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


public class AddCustomError
{
    public static void main(String[] args)
    {
        //ExStart:AddCustomError
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Creating empty presentation
        Presentation presentation = new Presentation();
        try
        {
            // Creating a bubble chart
            IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.Bubble, 50, 50, 400, 300, true);

            // Adding custom Error bars and setting its format
            IChartSeries series = chart.getChartData().getSeries().get_Item(0);
            IErrorBarsFormat errBarX = series.getErrorBarsXFormat();
            IErrorBarsFormat errBarY = series.getErrorBarsYFormat();
            errBarX.setVisible(true);
            errBarY.setVisible(true);
            errBarX.setValueType(ErrorBarValueType.Custom);
            errBarY.setValueType(ErrorBarValueType.Custom);

            // Accessing chart series data point and setting error bars values for individual point
            IChartDataPointCollection points = series.getDataPoints();
            points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXPlusValues(DataSourceType.DoubleLiterals);
            points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXMinusValues(DataSourceType.DoubleLiterals);
            points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYPlusValues(DataSourceType.DoubleLiterals);
            points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYMinusValues(DataSourceType.DoubleLiterals);

            // Setting error bars for chart series points
            for (int i = 0; i < points.size(); i++)
            {
                points.get_Item(i).getErrorBarsCustomValues().getXMinus().setAsLiteralDouble(i + 1);
                points.get_Item(i).getErrorBarsCustomValues().getXPlus().setAsLiteralDouble(i + 1);
                points.get_Item(i).getErrorBarsCustomValues().getYMinus().setAsLiteralDouble(i + 1);
                points.get_Item(i).getErrorBarsCustomValues().getYPlus().setAsLiteralDouble(i + 1);
            }

            // Saving presentation
            presentation.save(dataDir + "ErrorBarsCustomValues_out.pptx", SaveFormat.Pptx);

            //ExEnd:AddCustomError
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
    }
}

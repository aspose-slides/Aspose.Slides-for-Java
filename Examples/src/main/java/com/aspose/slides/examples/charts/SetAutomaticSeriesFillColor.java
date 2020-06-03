package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
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


public class SetAutomaticSeriesFillColor
{
    public static void main(String[] args)
    {
        //ExStart:SetAutomaticSeriesFillColor
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation presentation = new Presentation();
        try
        {
            // Creating a clustered column chart
            IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 50, 600, 400);

            // Setting series fill format to automatic
            for (int i = 0; i < chart.getChartData().getSeries().size(); i++)
            {
                chart.getChartData().getSeries().get_Item(i).getAutomaticSeriesColor();
            }

            // Write the presentation file to disk
            presentation.save(dataDir + "AutoFillSeries_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetAutomaticSeriesFillColor
    }
}

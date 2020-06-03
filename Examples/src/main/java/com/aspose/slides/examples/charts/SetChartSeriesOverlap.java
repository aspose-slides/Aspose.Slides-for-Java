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


public class SetChartSeriesOverlap
{
    public static void main(String[] args)
    {
        //ExStart:SetChartSeriesOverlap
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation presentation = new Presentation();
        try
        {
            // Adding chart
            IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400, true);
            IChartSeriesCollection series = chart.getChartData().getSeries();
            if (series.get_Item(0).getOverlap() == 0)
            {
                // Setting series overlap
                series.get_Item(0).getParentSeriesGroup().setOverlap((byte) -30);
            }

            // Write the presentation file to disk
            presentation.save(dataDir + "SetChartSeriesOverlap_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetChartSeriesOverlap
    }
}

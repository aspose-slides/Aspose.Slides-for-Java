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


public class SwitchChartRowColumns
{
    public static void main(String[] args)
    {
        //ExStart:SwitchChartRowColumns
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Creating empty presentation
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 400, 300);

            //Add data
            IChartDataCell[] categoriesCells = new IChartDataCell[chart.getChartData().getCategories().size()];

            for (int i = 0; i < chart.getChartData().getCategories().size(); i++)
            {
                categoriesCells[i] = chart.getChartData().getCategories().get_Item(i).getAsCell();
            }

            IChartDataCell[] seriesCells = new IChartDataCell[chart.getChartData().getSeries().size()];
            for (int i = 0; i < chart.getChartData().getSeries().size(); i++)
            {
                seriesCells[i] = chart.getChartData().getSeries().get_Item(i).getName().getAsCells().get_Item(0);
            }

            //Switching rows and columns
            chart.getChartData().switchRowColumn();

            // Saving presentation
            pres.save(RunExamples.OutPath + "SwitchChartRowColumns_out.pptx", SaveFormat.Pptx);
            //ExEnd:SwitchChartRowColumns
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}


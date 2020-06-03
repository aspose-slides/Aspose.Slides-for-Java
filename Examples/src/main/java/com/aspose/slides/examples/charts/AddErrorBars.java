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


public class AddErrorBars
{
    public static void main(String[] args)
    {
        //ExStart:AddErrorBars
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Creating empty presentation
        Presentation presentation = new Presentation();
        try
        {
            // Creating a bubble chart
            IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.Bubble, 50, 50, 400, 300, true);

            // Adding Error bars and setting its format
            IErrorBarsFormat errBarX = chart.getChartData().getSeries().get_Item(0).getErrorBarsXFormat();
            IErrorBarsFormat errBarY = chart.getChartData().getSeries().get_Item(0).getErrorBarsYFormat();
            errBarX.setVisible(true);
            errBarY.setVisible(true);
            errBarX.setValueType(ErrorBarValueType.Fixed);
            errBarX.setValue(0.1f);
            errBarY.setValueType(ErrorBarValueType.Percentage);
            errBarY.setValue(5);
            errBarX.setType(ErrorBarType.Plus);
            errBarY.getFormat().getLine().setWidth(2);
            errBarX.setEndCap(true);

            // Saving presentation
            presentation.save(dataDir + "ErrorBars_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AddErrorBars
    }
}

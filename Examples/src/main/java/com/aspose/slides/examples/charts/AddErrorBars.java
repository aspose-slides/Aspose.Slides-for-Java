package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


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

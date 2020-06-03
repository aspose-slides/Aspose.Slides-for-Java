package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SupportForSwitchingRowsAndColumns
{
    public static void main(String[] args)
    {
        //ExStart:SupportForSwitchingRowsAndColumns

        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation(dataDir + "Test.pptx");
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 400, 300);

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

            chart.getChartData().switchRowColumn();

            pres.save(RunExamples.OutPath + "Test_out.pptx", SaveFormat.Pptx);
            //ExEnd:SupportForSwitchingRowsAndColumns
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

    }
}

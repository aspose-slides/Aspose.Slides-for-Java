package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class UsingWorkBookChartcellAsDatalabel
{
    public static void main(String[] args)
    {
        //ExStart:UsingWorkBookChartcellAsDatalabel
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();


        String lbl0 = "Label 0 cell value";
        String lbl1 = "Label 1 cell value";
        String lbl2 = "Label 2 cell value";

        // Instantiate Presentation class that represents a presentation file 

        Presentation pres = new Presentation(dataDir + "chart2.pptx");
        try
        {
            ISlide slide = pres.getSlides().get_Item(0);


            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Bubble, 50, 50, 600, 400, true);

            IChartSeriesCollection series = chart.getChartData().getSeries();

            series.get_Item(0).getLabels().getDefaultDataLabelFormat().setShowLabelValueFromCell(true);

            IChartDataWorkbook wb = chart.getChartData().getChartDataWorkbook();

            series.get_Item(0).getLabels().get_Item(0).setValueFromCell(wb.getCell(0, "A10", lbl0));
            series.get_Item(0).getLabels().get_Item(1).setValueFromCell(wb.getCell(0, "A11", lbl1));
            series.get_Item(0).getLabels().get_Item(2).setValueFromCell(wb.getCell(0, "A12", lbl2));

            pres.save(dataDir + "resultchart.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:UsingWorkBookChartcellAsDatalabel


    }
}

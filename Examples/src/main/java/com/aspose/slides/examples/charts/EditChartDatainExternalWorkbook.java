package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartData;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class EditChartDatainExternalWorkbook
{
    public static void main(String[] args)
    {

        // Pay attention the path to external workbook is hardly saved in the presentation
        // so please copy file externalWorkbook.xlsx from Data/Chart directory D:\Aspose.Slides\Aspose.Slides-for-.NET-master\Examples\Data\Charts\ before run the example

        //ExStart:EditChartDatainExternalWorkbook
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation(dataDir + "presentation.pptx");
        try
        {
            IChart chart = (IChart) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            ChartData chartData = (ChartData) chart.getChartData();


            chartData.getSeries().get_Item(0).getDataPoints().get_Item(0).getValue().getAsCell().setValue(100);
            pres.save(RunExamples.OutPath + "presentation_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:EditChartDatainExternalWorkbook
    }
}


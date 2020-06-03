package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SupportForPrecisionOfData
{
    public static void main(String[] args)
    {
        //ExStart:SupportForPrecisionOfData
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Line, 50, 50, 450, 300);
            chart.setDataTable(true);
            chart.getChartData().getSeries().get_Item(0).setNumberFormatOfValues("#,##0.00");

            pres.save(dataDir + "PrecisionOfDatalabels_out.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SupportForPrecisionOfData
    }
}
	




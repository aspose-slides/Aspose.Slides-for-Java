package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

;

public class Chart_RecoverWorkbook
{
    public static void main(String[] args)
    {
        //ExStart:PieChart
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        String pptxFile = dataDir + "ExternalWB.pptx";
        String outPptxFile = RunExamples.OutPath + "ExternalWB_out.pptx";

        LoadOptions lo = new LoadOptions();
        lo.getSpreadsheetOptions().setRecoverWorkbookFromChartCache(true);

        Presentation pres = new Presentation(pptxFile, lo);
        try
        {
            IChart chart = (IChart) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            IChartDataWorkbook wb = chart.getChartData().getChartDataWorkbook();

            pres.save(outPptxFile, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}
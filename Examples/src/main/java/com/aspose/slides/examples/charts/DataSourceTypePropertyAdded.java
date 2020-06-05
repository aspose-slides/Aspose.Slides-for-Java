package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class DataSourceTypePropertyAdded
{
    public static void main(String[] args)
    {
        //ExStart:DataSourceTypePropertyAdded
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation(dataDir + "pres.pptx");
        try
        {
            ISlide slide = pres.getSlides().get_Item(1);
            IChart chart = (IChart) slide.getShapes().get_Item(0);

            int sourceType = chart.getChartData().getDataSourceType();
            if (sourceType == ChartDataSourceType.ExternalWorkbook)
            {
                String path = chart.getChartData().getExternalWorkbookPath();
            }
            // Saving presentation
            pres.save(dataDir + "Result.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }

    }
    //ExEnd:DataSourceTypePropertyAdded
}


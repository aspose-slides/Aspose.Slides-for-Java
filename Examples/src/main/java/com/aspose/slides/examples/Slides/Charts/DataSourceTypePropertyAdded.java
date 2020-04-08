package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartDataSourceType;
import com.aspose.slides.ChartType;
import com.aspose.slides.DataSourceType;
import com.aspose.slides.ErrorBarValueType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataPointCollection;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IErrorBarsFormat;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
import com.aspose.slides.ms.System.IDisposable;

public class DataSourceTypePropertyAdded {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DataSourceTypePropertyAdded.class);

        //ExStart:DataSourceTypePropertyAdded
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation(dataDir + "pres.pptx");
        try {
            ISlide slide = pres.getSlides().get_Item(1);
            IChart chart = (IChart) slide.getShapes().get_Item(0);
            /*ChartDataSourceType*/
            int sourceType = chart.getChartData().getDataSourceType();
            if (sourceType == ChartDataSourceType.ExternalWorkbook) {
                String path = chart.getChartData().getExternalWorkbookPath();
                System.out.println(path);
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:DataSourceTypePropertyAdded
    }

}

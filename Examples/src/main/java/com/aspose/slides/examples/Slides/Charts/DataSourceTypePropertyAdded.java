package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.DataSourceType;
import com.aspose.slides.ErrorBarValueType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataPointCollection;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IErrorBarsFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class DataSourceTypePropertyAdded{

	public static void main(String[] args) {
            //ExStart:DataSourceTypePropertyAdded
             // The path to the documents directory.
	     String dataDir = Utils.getDataDir(DataSourceTypePropertyAdded.class);

       final Presentation pres = new Presentation("pres.pptx");
try
{
    ISlide slide = pres.getSlides().get_Item(1);
    IChart chart = (IChart)slide.getShapes().get_Item(0);
    /*ChartDataSourceType*/ int sourceType = chart.getChartData().getDataSourceType();
    if (sourceType == ChartDataSourceType.ExternalWorkbook)
    {
        String path = chart.getChartData().getExternalWorkbookPath();
    }
}
finally { ((IDisposable)pres).dispose(); }
         //ExEnd:DataSourceTypePropertyAdded
 
 
 }

 }

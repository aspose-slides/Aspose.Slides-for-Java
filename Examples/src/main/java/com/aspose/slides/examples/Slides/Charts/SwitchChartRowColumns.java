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

public class SwitchChartRowColumns {

	public static void main(String[] args) {
            //ExStart:SwitchChartRowColumns
             // The path to the documents directory.
	     String dataDir = Utils.getDataDir(SwitchChartRowColumns.class);

Presentation pres = new Presentation();
try {
IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 400, 300);
 
chart.getChartData().switchRowColumn();
pres.save(dataDir +"SwitchChartRowColumns_out.pptx", SaveFormat.Pptx);
}finally {
pres.dispose();
}

          //ExEnd:SwitchChartRowColumns
 
 
 }

 }

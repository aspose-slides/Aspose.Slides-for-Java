
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartSeriesCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Slides.Rendering.GeneratingThumbnailFromSlide;
import com.aspose.slides.examples.Utils;

public class InvertIfNegativeForIndividualSeries {
    
public static void main(String[] args) {
//ExStart:InvertIfNegativeForIndividualSeries
String dataDir = Utils.getDataDir(InvertIfNegativeForIndividualSeries.class);		
Presentation pres = new Presentation(dataDir+"test.pptx");
try {
    IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400, true);
    IChartSeriesCollection series = chart.getChartData().getSeries();
    chart.getChartData().getSeries().clear();
  
    series.add(chart.getChartData().getChartDataWorkbook().getCell(0, "B1"), chart.getType());
    series.get_Item(0).getDataPoints().addDataPointForBarSeries(chart.getChartData().getChartDataWorkbook().getCell(0, "B2",-5));
    series.get_Item(0).getDataPoints().addDataPointForBarSeries(chart.getChartData().getChartDataWorkbook().getCell(0, "B3",3));
    series.get_Item(0).getDataPoints().addDataPointForBarSeries(chart.getChartData().getChartDataWorkbook().getCell(0, "B4",-2));
    series.get_Item(0).getDataPoints().addDataPointForBarSeries(chart.getChartData().getChartDataWorkbook().getCell(0, "B5",1));
  
    series.get_Item(0).setInvertIfNegative(false);
    series.get_Item(0).getInvertIfNegative();
    series.get_Item(0).getDataPoints().get_Item(2).setInvertIfNegative(true);
  
    pres.save("output.pptx", SaveFormat.Pptx);
} finally {
    pres.dispose();
}

//ExEnd:InvertIfNegativeForIndividualSeries
}
}

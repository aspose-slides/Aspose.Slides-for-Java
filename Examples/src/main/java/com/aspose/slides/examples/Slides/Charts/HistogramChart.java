package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.AxisAggregationType;
import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class HistogramChart {
 
    
public static void main(String[] args) {
      

        String dataDir = Utils.getDataDir(HistogramChart.class);

    //ExStart:HistogramChart

        Presentation pres = new Presentation();
     try {
        IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Histogram, 50, 50, 500, 400);
        chart.getChartData().getCategories().clear();
        chart.getChartData().getSeries().clear();
 
        IChartDataWorkbook wb = chart.getChartData().getChartDataWorkbook();
 
        wb.clear(0);
 
        IChartSeries series = chart.getChartData().getSeries().add(ChartType.Histogram);
        series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A1", 15));
        series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A2", -41));
        series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A3", 16));
        series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A4", 10));
        series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A5", -23));
        series.getDataPoints().addDataPointForHistogramSeries(wb.getCell(0, "A6", 16));
 
        chart.getAxes().getHorizontalAxis().setAggregationType(AxisAggregationType.Automatic);
 
        pres.save("Histogram.pptx", SaveFormat.Pptx);
        
        }finally {
        pres.dispose();
        
      }

//ExEnd:HistogramChart
    }

    
}

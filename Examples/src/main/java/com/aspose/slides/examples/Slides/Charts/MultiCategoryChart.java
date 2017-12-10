package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.DataSourceType;
import com.aspose.slides.ErrorBarValueType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartCategory;
import com.aspose.slides.IChartDataPointCollection;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IErrorBarsFormat;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

        public class MultiCategoryChart {

	public static void main(String[] args) {
            //ExStart:MultiCategoryChart
             // The path to the documents directory.
	     String dataDir = Utils.getDataDir(MultiCategoryChart.class);

             Presentation pres = new Presentation(dataDir+"test.pptx");

             // Access first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add chart with default data
            IChart ch = sld.getShapes().addChart(ChartType.ClusteredColumn, 0, 0, 500, 500);
            ch.getChartData().getSeries().clear();
            ch.getChartData().getCategories().clear();
            IChartDataWorkbook fact=ch.getChartData().getChartDataWorkbook();
            fact.clear(0);
            int defaultWorksheetIndex = 0;
            IChartCategory category = ch.getChartData().getCategories().add(fact.getCell(0, "c2", "A"));
            category.getGroupingLevels().setGroupingItem(1, "Group1");
            category = ch.getChartData().getCategories().add(fact.getCell(0, "c3", "B"));
            category = ch.getChartData().getCategories().add(fact.getCell(0, "c4", "C"));
            category.getGroupingLevels().setGroupingItem(1, "Group2");
            category = ch.getChartData().getCategories().add(fact.getCell(0, "c5", "D"));
            category = ch.getChartData().getCategories().add(fact.getCell(0, "c6", "E"));
            category.getGroupingLevels().setGroupingItem(1, "Group3");
            category = ch.getChartData().getCategories().add(fact.getCell(0, "c7", "F"));
            category = ch.getChartData().getCategories().add(fact.getCell(0, "c8", "G"));
            category.getGroupingLevels().setGroupingItem(1, "Group4");
            category = ch.getChartData().getCategories().add(fact.getCell(0, "c8", "H"));
            IChartSeries series = ch.getChartData().getSeries().add(fact.getCell(0, "D1", "Series 1"),
        ChartType.ClusteredColumn);
            series.getDataPoints().addDataPointForAreaSeries(fact.getCell(defaultWorksheetIndex, "D2", 10));
           // AddDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, "D2", 10));
           series.getDataPoints().addDataPointForAreaSeries(fact.getCell(defaultWorksheetIndex, "D3", 20));
           series.getDataPoints().addDataPointForAreaSeries(fact.getCell(defaultWorksheetIndex, "D4", 30));
           series.getDataPoints().addDataPointForAreaSeries(fact.getCell(defaultWorksheetIndex, "D5", 40));
           series.getDataPoints().addDataPointForAreaSeries(fact.getCell(defaultWorksheetIndex, "D6", 50));
           series.getDataPoints().addDataPointForAreaSeries(fact.getCell(defaultWorksheetIndex, "D7", 60));
           series.getDataPoints().addDataPointForAreaSeries(fact.getCell(defaultWorksheetIndex, "D8", 70));
           series.getDataPoints().addDataPointForAreaSeries(fact.getCell(defaultWorksheetIndex, "D9", 80));
           pres.save(dataDir+"AsposeChart.pptx", SaveFormat.Pptx);
}

          //ExEnd:MultiCategoryChart
 
 }

 

package com.aspose.slides.examples.Slides.Charts;

import java.awt.Color;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingTheAutomaticSeriesColorForChartSeries {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTheAutomaticSeriesColorForChartSeries.class);

		// Instantiate Presentation class that represents PPTX file
		Presentation pres = new Presentation();

		// Access first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add chart with default data
		IChart chart = sld.getShapes().addChart(ChartType.ClusteredColumn, 0, 0, 500, 500);

		// Set first series to Show Values
		chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(true);

		// Setting the index of chart data sheet
		int defaultWorksheetIndex = 0;

		// Getting the chart data WorkSheet
		IChartDataWorkbook fact = chart.getChartData().getChartDataWorkbook();

		// Delete default generated series and categories
		chart.getChartData().getSeries().clear();
		chart.getChartData().getCategories().clear();
		int s = chart.getChartData().getSeries().size();
		s = chart.getChartData().getCategories().size();

		// Adding new series
		chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 1, "Series 1"), chart.getType());
		chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 2, "Series 2"), chart.getType());

		// Adding new categories
		chart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 1, 0, "Caetegoty 1"));
		chart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 2, 0, "Caetegoty 2"));
		chart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 3, 0, "Caetegoty 3"));

		// Take first chart series
		IChartSeries series = chart.getChartData().getSeries().get_Item(0);

		// Now populating series data
		series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 1, 1, 20));
		series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 50));
		series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 30));

		// Setting automatic fill color for series
		series.getFormat().getFill().setFillType(FillType.NotDefined);

		// Take second chart series
		series = chart.getChartData().getSeries().get_Item(1);

		// Now populating series data
		series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 1, 2, 30));
		series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 2, 2, 10));
		series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 3, 2, 60));

		// Setting fill color for series
		series.getFormat().getFill().setFillType(FillType.Solid);
		series.getFormat().getFill().getSolidFillColor().setColor(Color.GRAY);

		// Save presentation with chart
		pres.save(dataDir + "AutomaticColor.pptx", SaveFormat.Pptx);

	}

}

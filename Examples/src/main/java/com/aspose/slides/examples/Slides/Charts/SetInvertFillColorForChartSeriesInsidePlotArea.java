package com.aspose.slides.examples.Slides.Charts;

import java.awt.Color;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SetInvertFillColorForChartSeriesInsidePlotArea {
	
	// The path to the documents directory.
	private static final String dataDir = Utils.getSharedDataDir(SetDataRangeForChart.class) + "Charts/";
			
	public static void main(String[] args) {
		
		Color inverColor = Color.red;
		Color seriesColor;

		final Presentation pres = new Presentation();
		try {
			IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 400, 300);

			IChartDataWorkbook workBook = chart.getChartData().getChartDataWorkbook();

			chart.getChartData().getSeries().clear();
			chart.getChartData().getCategories().clear();

			// Adding new series
			chart.getChartData().getSeries().add(workBook.getCell(0, 0, 1, "Series 1"), chart.getType());

			// Adding new categories
			chart.getChartData().getCategories().add(workBook.getCell(0, 1, 0, "Category 1"));
			chart.getChartData().getCategories().add(workBook.getCell(0, 2, 0, "Category 2"));
			chart.getChartData().getCategories().add(workBook.getCell(0, 3, 0, "Category 3"));

			// Take first chart series
			IChartSeries series = chart.getChartData().getSeries().get_Item(0);

			// Now populating series data
			series.getDataPoints().addDataPointForBarSeries(workBook.getCell(0, 1, 1, -20));
			series.getDataPoints().addDataPointForBarSeries(workBook.getCell(0, 2, 1, 50));
			series.getDataPoints().addDataPointForBarSeries(workBook.getCell(0, 3, 1, -30));

			seriesColor = series.getAutomaticSeriesColor();

			series.setInvertIfNegative(true);
			series.getFormat().getFill().setFillType(FillType.Solid);
			series.getFormat().getFill().getSolidFillColor().setColor(seriesColor);
			series.getInvertedSolidFillColor().setColor(inverColor);
			pres.save(dataDir + "SetInvertFillColorForChartSeries_Out.pptx", SaveFormat.Pptx);
		} finally {
			if (pres != null) {
				pres.dispose();
			}
		}
	}
}
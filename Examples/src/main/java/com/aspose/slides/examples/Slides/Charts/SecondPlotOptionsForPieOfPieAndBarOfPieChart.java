package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartData;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.PieSplitType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SecondPlotOptionsForPieOfPieAndBarOfPieChart {

	public static void main(String[] args) {


		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SecondPlotOptionsForPieOfPieAndBarOfPieChart.class);

//ExStart:SecondPlotOptionsForPieOfPieAndBarOfPieChart


		// Second plot options for Pie of Pie and Bar of Pie chart
		// Instantiate Presentation object
		Presentation pres = new Presentation();

		// Add Pie chart on first slide
		IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.PieOfPie, 50, 50, 500, 400);

		// Getting chart data
		IChartData chartData = chart.getChartData();

		// Accessing first chart series
		IChartSeries series = chartData.getSeries().get_Item(0);

		// Setting series properties
		series.getLabels().getDefaultDataLabelFormat().setShowValue(true);
		series.getParentSeriesGroup().setSecondPieSize(149);
		series.getParentSeriesGroup().setPieSplitBy(PieSplitType.ByPercentage);
		series.getParentSeriesGroup().setPieSplitPosition((double) 53);

		// Saving presentation to disk
		pres.save(dataDir + "pieOFpie.pptx", SaveFormat.Pptx);

//ExEnd:SecondPlotOptionsForPieOfPieAndBarOfPieChart

	}

}

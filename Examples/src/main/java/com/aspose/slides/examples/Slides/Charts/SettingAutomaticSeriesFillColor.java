package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingAutomaticSeriesFillColor {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingAutomaticSeriesFillColor.class);

		// Creating empty presentation
		Presentation pres = new Presentation();

		// Creating a clustered column chart
		IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 50, 600, 400);

		// Setting series fill format to automatic
		for (int i = 0; i < chart.getChartData().getSeries().size(); i++) {
			chart.getChartData().getSeries().get_Item(i).getAutomaticSeriesColor();
		}

		// Saving presentation
		pres.save(dataDir + "AutoFillSeries.pptx", SaveFormat.Pptx);

	}

}

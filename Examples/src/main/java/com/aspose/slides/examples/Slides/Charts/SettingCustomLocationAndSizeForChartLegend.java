package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingCustomLocationAndSizeForChartLegend {

	public static void main(String[] args) {
//ExStart:SettingCustomLocationAndSizeForChartLegend


		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingCustomLocationAndSizeForChartLegend.class);

		// Create an instance of Presentation class
		Presentation pres = new Presentation();

		// Get reference of the slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Add a clustered column chart on the slide
		IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 500, 500);

		// Set Legend Properties
		chart.getLegend().setX(50 / chart.getWidth());
		chart.getLegend().setY(50 / chart.getHeight());
		chart.getLegend().setWidth(100 / chart.getWidth());
		chart.getLegend().setHeight(100 / chart.getHeight());

		// Write presentation to disk
		pres.save(dataDir + "Legend.pptx", SaveFormat.Pptx);

//ExEnd:SettingCustomLocationAndSizeForChartLegend

	}

}

package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.IChart;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SetDataRangeForChart {

	public static void main(String[] args) {
//ExStart:SetDataRangeForChart
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SetDataRangeForChart.class) + "Charts/";
				
		// Instantiate Presentation class that represents PPTX file
		Presentation presentation = new Presentation(dataDir + "ExistingChart.pptx");

		// Access first slideMarker
		ISlide sld = presentation.getSlides().get_Item(0);

		// Add chart with default data
		IChart chart = (IChart)sld.getShapes().get_Item(0);

		chart.getChartData().setRange("Sheet1!A1:B4");

		presentation.save(dataDir + "SetDataRangeForChart_Out.pptx", SaveFormat.Pptx);
//ExEnd:SetDataRangeForChart
	}
}

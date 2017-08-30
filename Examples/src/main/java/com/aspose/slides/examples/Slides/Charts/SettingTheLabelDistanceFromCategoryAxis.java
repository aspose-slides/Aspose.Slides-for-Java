package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingTheLabelDistanceFromCategoryAxis {

	public static void main(String[] args) {

//ExStart:SettingTheLabelDistanceFromCategoryAxis
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTheLabelDistanceFromCategoryAxis.class);

		// Create an instance of Presentation class
		Presentation pres = new Presentation();

		// Get reference of the slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Adding a chart on slide
		IChart ch = sld.getShapes().addChart(ChartType.ClusteredColumn, 20, 20, 500, 300);

		// Setting the position of label from axis
		ch.getAxes().getHorizontalAxis().setLabelOffset(500);

		// Write the presentation to disk
		pres.save(dataDir + "Position.pptx", SaveFormat.Pptx);
//ExEnd:SettingTheLabelDistanceFromCategoryAxis

	}

}

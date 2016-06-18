package com.aspose.slides.examples.Text;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingCustomRotationAngleForTextframe {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingCustomRotationAngleForTextframe.class);

		Presentation pres = new Presentation();

		IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 500, 300);

		IChartSeries series = chart.getChartData().getSeries().get_Item(0);

		series.getLabels().getDefaultDataLabelFormat().setShowCategoryName(true);
		series.getLabels().getDefaultDataLabelFormat().getTextFormat().getTextBlockFormat().setRotationAngle(65);

		chart.hasTitle();
		chart.getChartTitle().addTextFrameForOverriding("Custom title").getTextFrameFormat().setRotationAngle(-30);

		pres.save(dataDir + "out.pptx", SaveFormat.Pptx);

	}

}

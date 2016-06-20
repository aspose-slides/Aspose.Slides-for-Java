package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.DataSourceType;
import com.aspose.slides.ErrorBarValueType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataPointCollection;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IErrorBarsFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddingCustomErrorBarValueForChart {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingCustomErrorBarValueForChart.class);

		// Creating empty presentation
		Presentation pres = new Presentation();

		// Creating a bubble chart
		IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Bubble, 50, 50, 400, 300, true);

		// Adding custom Error bars and setting its format
		IChartSeries series = chart.getChartData().getSeries().get_Item(0);
		IErrorBarsFormat errBarX = series.getErrorBarsXFormat();
		IErrorBarsFormat errBarY = series.getErrorBarsYFormat();
		errBarX.isVisible();
		errBarY.isVisible();
		errBarX.setValueType((byte) ErrorBarValueType.Custom);
		errBarY.setValueType((byte) ErrorBarValueType.Custom);

		// Accessing chart series data point and setting error bars values for
		// individual point
		IChartDataPointCollection points = series.getDataPoints();
		points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXPlusValues((byte) DataSourceType.DoubleLiterals);
		points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXMinusValues((byte) DataSourceType.DoubleLiterals);
		points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYPlusValues((byte) DataSourceType.DoubleLiterals);
		points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYMinusValues((byte) DataSourceType.DoubleLiterals);

		// Setting error bars for chart series points
		for (int i = 0; i < points.size(); i++) {
			points.get_Item(i).getErrorBarsCustomValues().getXMinus().setAsLiteralDouble(i + 1);
			points.get_Item(i).getErrorBarsCustomValues().getXPlus().setAsLiteralDouble(i + 1);
			points.get_Item(i).getErrorBarsCustomValues().getYMinus().setAsLiteralDouble(i + 1);
			points.get_Item(i).getErrorBarsCustomValues().getYPlus().setAsLiteralDouble(i + 1);
		}

		// Saving presentation
		pres.save(dataDir + "ErrorBarsCustomValues.pptx", SaveFormat.Pptx);

	}

}

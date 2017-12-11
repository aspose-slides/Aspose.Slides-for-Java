package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.Chart;
import com.aspose.slides.ChartType;
import com.aspose.slides.DataSourceType;
import com.aspose.slides.ErrorBarValueType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataPointCollection;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IErrorBarsFormat;
import  com.aspose.slides.Chart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
import com.aspose.slides.ms.System.IDisposable;

public class GetValuesAndUnitScaleFromAxis{

	public static void main(String[] args) {
            //ExStart:GetValuesAndUnitScaleFromAxis
             // The path to the documents directory.
	     String dataDir = Utils.getDataDir(GetValuesAndUnitScaleFromAxis.class);

     final Presentation pres = new Presentation();
try
{
    Chart chart = (Chart) pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Area, 100, 100, 500, 350);
    chart.validateChartLayout();

    double maxValue = chart.getAxes().getVerticalAxis().getActualMaxValue();
    double minValue = chart.getAxes().getVerticalAxis().getActualMinValue();

    double majorUnit = chart.getAxes().getHorizontalAxis().getActualMajorUnit();
    double minorUnit = chart.getAxes().getHorizontalAxis().getActualMinorUnit();
}
finally { ((IDisposable)pres).dispose(); }
          //ExEnd:GetValuesAndUnitScaleFromAxis
 
 
 }

 }

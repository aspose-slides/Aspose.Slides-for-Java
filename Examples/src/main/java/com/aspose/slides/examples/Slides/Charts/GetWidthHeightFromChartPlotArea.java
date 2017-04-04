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

public class GetWidthHeightFromChartPlotArea{

	public static void main(String[] args) {
            ExStart:GetWidthHeightFromChartPlotArea
             // The path to the documents directory.
	     String dataDir = Utils.getDataDir(GetWidthHeightFromChartPlotArea.class);

      final Presentation pres = new Presentation();
   try {
        Chart chart = (Chart) pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 500, 350);
        chart.validateChartLayout();

        double x = chart.getPlotArea().getActualX();
        double y = chart.getPlotArea().getActualY();
        double w = chart.getPlotArea().getActualWidth();
        double h = chart.getPlotArea().getActualHeight();
     }
       finally { ((IDisposable)pres).dispose();

     }

          ExEnd:GetWidthHeightFromChartPlotArea
 
 
 
      }

      }

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

public class UsingWorkBookChartCellAsDatalabel {

	public static void main(String[] args) {
                 //ExStart:UsingWorkBookChartCellAsDatalabel
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(UsingWorkBookChartCellAsDatalabel.class);

		
                 String lbl0 = "Label 0 cell value";
                 String lbl1 = "Label 1 cell value";
                 String lbl2 = "Label 2 cell value";

                Presentation pres = new Presentation(path+"Test.pptx");
               try {

               IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Bubble, 50, 50, 600, 400, true);

               IChartSeriesCollection series = chart.getChartData().getSeries();

               series.get_Item(0).getLabels().getDefaultDataLabelFormat().setShowLabelValueFromCell(true);

               IChartDataWorkbook wb = chart.getChartData().getChartDataWorkbook();

               series.get_Item(0).getLabels().get_Item(0).setValueFromCell(wb.getCell(0, "A10", lbl0));
               series.get_Item(0).getLabels().get_Item(1).setValueFromCell(wb.getCell(0, "A11", lbl1));
               series.get_Item(0).getLabels().get_Item(2).setValueFromCell(wb.getCell(0, "A12", lbl2));
} finally {
    pres.dispose();
}
	

		// Saving presentation
		pres.save(dataDir + "TestResult.pptx", SaveFormat.Pptx);

                //ExEnd:UsingWorkBookChartCellAsDatalabel
 
 }

}

package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

public class SetChartDataFromWorkBook {

	public static void main(String[] args) {

//ExStart:SetChartDataFromWorkBook

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SetChartDataFromWorkBook.class);

	         Presentation pres = new Presentation(dataDir+"Test.pptx");

                IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 500, 400);
                byte[] msln =chart.getChartData().readWorkbookStream();
                chart.getChartData().getChartDataWorkbook().clear(0);
                Workbook workbook=null;
            try {
              workbook = new com.aspose.cells.Workbook(dataDir+"a1.xlsx");
             } catch (Exception ex) {
               Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
              }
               java.io.ByteArrayOutputStream mem = new java.io.ByteArrayOutputStream();
               workbook.save(mem, com.aspose.cells.SaveFormat.XLSX);

              chart.getChartData().getChartDataWorkbook();
              chart.getChartData().writeWorkbookStream(mem.toByteArray());
 
              chart.getChartData().setRange("Sheet1!$A$1:$B$9");
              IChartSeries series=chart.getChartData().getSeries().get_Item(0);
              series.getParentSeriesGroup().setColorVaried(true);
              pres.save(dataDir+"response2.pptx",SaveFormat.Pptx);
              //ExEnd:SetChartDataFromWorkBook
	}

}

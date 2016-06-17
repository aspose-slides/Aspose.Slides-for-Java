package com.aspose.slides.examples.Slides.Charts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataPoint;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IPPImage;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingTheChartMarkerOptionsOnDataPointsLevel {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTheChartMarkerOptionsOnDataPointsLevel.class);

		// Creating empty presentation
		Presentation pres = new Presentation();

		// Access first slide
		ISlide slide = pres.getSlides().get_Item(0);

		// Creating the default chart
		IChart chart = slide.getShapes().addChart(ChartType.LineWithMarkers, 0, 0, 400, 400);

		// Getting the default chart data WorkSheet index
		int defaultWorksheetIndex = 0;

		// Getting the chart data WorkSheet
		IChartDataWorkbook fact = chart.getChartData().getChartDataWorkbook();

		// Delete demo series
		chart.getChartData().getSeries().clear();

		// Add new series
		chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 1, 1, "Series 1"), chart.getType());

		IPPImage imgx1 = null;
		try {
			imgx1 = pres.getImages().addImage(new FileInputStream(new File("Desert.jpg")));

		} catch (IOException e) {
		}

		// Set the picture
		IPPImage imgx2 = null;
		try {
			imgx2 = pres.getImages().addImage(new FileInputStream(new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg")));

		} catch (IOException e) {
		}

		// Take first chart series
		IChartSeries series = chart.getChartData().getSeries().get_Item(0);

		// Add new point (1:3) there.
		IChartDataPoint point = series.getDataPoints().addDataPointForLineSeries(fact.getCell(defaultWorksheetIndex, 1, 1, (double) 4.5));
		point.getMarker().getFormat().getFill().setFillType(FillType.Picture);
		point.getMarker().getFormat().getFill().getPictureFillFormat().getPicture().setImage(imgx1);

		point = series.getDataPoints().addDataPointForLineSeries(fact.getCell(defaultWorksheetIndex, 2, 1, (double) 2.5));
		point.getMarker().getFormat().getFill().setFillType(FillType.Picture);
		point.getMarker().getFormat().getFill().getPictureFillFormat().getPicture().setImage(imgx2);

		point = series.getDataPoints().addDataPointForLineSeries(fact.getCell(defaultWorksheetIndex, 3, 1, (double) 3.5));
		point.getMarker().getFormat().getFill().setFillType(FillType.Picture);
		point.getMarker().getFormat().getFill().getPictureFillFormat().getPicture().setImage(imgx1);

		point = series.getDataPoints().addDataPointForLineSeries(fact.getCell(defaultWorksheetIndex, 4, 1, (double) 4.5));
		point.getMarker().getFormat().getFill().setFillType(FillType.Picture);
		point.getMarker().getFormat().getFill().getPictureFillFormat().getPicture().setImage(imgx2);

		// Changing the chart series marker
		series.getMarker().setSize(15);

		// Save presentation with chart
		pres.save(dataDir + "AsposeScatterChart.pptx", SaveFormat.Pptx);

	}
}

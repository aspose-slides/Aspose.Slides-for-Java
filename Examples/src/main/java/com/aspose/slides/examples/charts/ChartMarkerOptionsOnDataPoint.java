package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ChartMarkerOptionsOnDataPoint
{
    public static void main(String[] args)
    {
        //ExStart:ChartMarkerOptionsOnDataPoint
        String dataDir = RunExamples.getDataDir_Charts();
        String outputDir = RunExamples.getOutPath();

        Presentation pres = new Presentation(dataDir + "Test.pptx");

        ISlide slide = pres.getSlides().get_Item(0);

        //Creating the default chart
        IChart chart = slide.getShapes().addChart(ChartType.LineWithMarkers, 0, 0, 400, 400);

        //Getting the default chart data worksheet index
        int defaultWorksheetIndex = 0;

        //Getting the chart data worksheet
        IChartDataWorkbook fact = chart.getChartData().getChartDataWorkbook();

        //Delete demo series
        chart.getChartData().getSeries().clear();

        //Add new series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 1, 1, "Series 1"), chart.getType());


        //Set the picture
        IImage img = Images.fromFile(dataDir + "aspose-logo.jpg");
        IPPImage imgx1 = pres.getImages().addImage(img);

        //Set the picture
        IImage img2 = Images.fromFile(dataDir + "Tulips.jpg");
        IPPImage imgx2 = pres.getImages().addImage(img2);

        //Take first chart series
        IChartSeries series = chart.getChartData().getSeries().get_Item(0);

        //Add new point (1:3) there.
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


        //Changing the chart series marker
        series.getMarker().setSize(15);

        pres.save(outputDir + "AsposeScatterChart.pptx", SaveFormat.Pptx);
    }

    //ExEnd:ChartMarkerOptionsOnDataPoint
}
  
 
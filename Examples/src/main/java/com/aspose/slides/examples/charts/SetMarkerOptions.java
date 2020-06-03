package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SetMarkerOptions
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:SetMarkerOptions
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        ISlide slide = presentation.getSlides().get_Item(0);

        // Creating the default chart
        IChart chart = slide.getShapes().addChart(ChartType.LineWithMarkers, 0, 0, 400, 400);

        // Getting the default chart data worksheet index
        int defaultWorksheetIndex = 0;

        // Getting the chart data worksheet
        IChartDataWorkbook fact = chart.getChartData().getChartDataWorkbook();

        // Delete demo series
        chart.getChartData().getSeries().clear();

        // Add new series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 1, 1, "Series 1"), chart.getType());

        // Set the picture
        BufferedImage image1 = ImageIO.read(new File(dataDir + "aspose-logo.jpg"));
        IPPImage imgx1 = presentation.getImages().addImage(image1);

        // Set the picture
        BufferedImage image2 = ImageIO.read(new File(dataDir + "Tulips.jpg"));
        IPPImage imgx2 = presentation.getImages().addImage(image2);

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

        // Write presentation to disk
        presentation.save(dataDir + "MarkOptions_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetMarkerOptions
    }
}

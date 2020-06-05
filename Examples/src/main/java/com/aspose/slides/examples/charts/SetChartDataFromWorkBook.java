package com.aspose.slides.examples.charts;

import com.aspose.cells.Workbook;
import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.ByteArrayOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SetChartDataFromWorkBook
{

    public static void main(String[] args)
    {
        String dataDir = RunExamples.getDataDir_Charts();
        //ExStart:SetChartDataFromWorkBook
        Presentation pres = new Presentation(dataDir + "Test.pptx");

        IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 500, 400);
        chart.getChartData().getChartDataWorkbook().clear(0);

        Workbook workbook = null;
        try
        {
            workbook = new Workbook(dataDir + "book1.xlsx");
        }
        catch (Exception ex)
        {
            System.out.print(ex);
        }
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        try
        {
            workbook.save(mem, com.aspose.cells.SaveFormat.XLSX);
        }
        catch (Exception ex)
        {
            Logger.getLogger(SetChartDataFromWorkBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        chart.getChartData().writeWorkbookStream(mem.toByteArray());

        chart.getChartData().setRange("Sheet1!$A$1:$B$9");
        IChartSeries series = chart.getChartData().getSeries().get_Item(0);
        series.getParentSeriesGroup().setColorVaried(true);
        pres.save(dataDir + "response2.pptx", SaveFormat.Pptx);
        //ExEnd:SetChartDataFromWorkBook
    }
}

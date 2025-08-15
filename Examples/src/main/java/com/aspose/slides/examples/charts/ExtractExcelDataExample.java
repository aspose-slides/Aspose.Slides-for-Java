package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.examples.RunExamples;

public class ExtractExcelDataExample
{
    public static void main(String[] args)
    {

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        String externalWbPath = dataDir + "book1.xlsx";

        //ExStart:ExtractExcelDataExample
        // extract a value from a cell
        IExcelDataWorkbook workbook = new ExcelDataWorkbook(externalWbPath);
        IExcelDataCell cell = workbook.getCell("Sheet2", "B2");
        System.out.println(cell.getValue());

        //retrieve worksheet names and chart names from an Excel workbook
        List<String> sheetNames = workbook.getWorksheetNames();
        for (String name : sheetNames)
        {
            System.out.println("Worksheet " + name + " has the following charts:");

            Dictionary<Integer, String> sheetCharts = workbook.getChartsFromWorksheet(name);
            for (KeyValuePair<Integer, String> chart : sheetCharts)
                System.out.println(chart.getKey() + " - " + chart.getValue());
        }
        //ExEnd:ExtractExcelDataExample
    }
}

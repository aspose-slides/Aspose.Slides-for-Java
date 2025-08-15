package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.examples.RunExamples;

public class ImportingChartsFromExcelExample
{
    public static void main(String[] args)
    {
        // Path to excel file
        String dataDir = RunExamples.getDataDir_Charts();
        String externalWbPath = dataDir + "book1.xlsx";

        // Path to output file
        String outFileName = RunExamples.getOutPath() + "ImportExcelChart.pptx";

        //ExStart:ImportingChartsFromExcelExample
        // Initializes a new instance using the specified file path
        ExcelDataWorkbook workbook = new ExcelDataWorkbook(externalWbPath);

        Presentation pres = new Presentation();
        try {
            ILayoutSlide blankLayout = pres.getLayoutSlides().getByType(SlideLayoutType.Blank);

            // Gets the names of all worksheets contained in the Excel workbook
            List<String> worksheetNames = workbook.getWorksheetNames();
            for (String name : worksheetNames)
            {
                // Gets a dictionary containing the indexes and names of all charts in the specified worksheet of an Excel workbook
                Dictionary<Integer, String> worksheetCharts = workbook.getChartsFromWorksheet(name);
                for (KeyValuePair<Integer, String> chart : worksheetCharts)
                {
                    ISlide slide = pres.getSlides().addEmptySlide(blankLayout);
                    // Imports the chart from a workbook file by its name and worksheet name
                    ExcelWorkbookImporter.addChartFromWorkbook(slide.getShapes(), 10, 10, workbook, name, chart.getKey(), false);
                }
            }

            // Saves result
            pres.save(outFileName, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ImportingChartsFromExcelExample
    }
}

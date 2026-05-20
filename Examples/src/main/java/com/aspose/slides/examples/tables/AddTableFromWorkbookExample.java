package com.aspose.slides.examples.tables;


import com.aspose.slides.ExcelDataWorkbook;
import com.aspose.slides.ExcelWorkbookImporter;
import com.aspose.slides.IExcelDataWorkbook;
import com.aspose.slides.ILayoutSlide;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class AddTableFromWorkbookExample
{
    public static void main(String[] args)
    {
        // Path to the source Excel file
        String excelFilePath = RunExamples.getDataDir_Tables() + "Budget.xlsx";
        // Path to the output presentation
        String outPath = RunExamples.getOutPath() + "TableFromWorkbook.pptx";

        //ExStart:AddTableFromWorkbookExample
        Presentation presentation = new Presentation();
        try {
            // Get the layout of the first slide to reuse when adding new slides
            ILayoutSlide slideLayout = presentation.getSlides().get_Item(0).getLayoutSlide();

            // Create workbook instance from file
            IExcelDataWorkbook workbook = new ExcelDataWorkbook(excelFilePath);
            // Import the table using an IExcelDataWorkbook instance
            ExcelWorkbookImporter.addTableFromWorkbook(presentation.getSlides().get_Item(0).getShapes(), 10, 10, workbook, "Month", "D4:H17");

            // Add a new slide
            ISlide secondSlide = presentation.getSlides().addEmptySlide(slideLayout);
            // Import the table directly from an Excel file path
            ExcelWorkbookImporter.addTableFromWorkbook(secondSlide.getShapes(), 10, 10, excelFilePath, "Budget", "B21:E43");

            // Add a new slide
            ISlide thirdSlide = presentation.getSlides().addEmptySlide(slideLayout);
            // Import the table from an Excel stream
            try {
                FileInputStream fStream = new FileInputStream(excelFilePath);
                ExcelWorkbookImporter.addTableFromWorkbook(thirdSlide.getShapes(), 10, 10, fStream,
                        "Budget", "B47:E55");
                fStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Save the presentation
            presentation.save(outPath, SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AddTableFromWorkbookExample
    }
}

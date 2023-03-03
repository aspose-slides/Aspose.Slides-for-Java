package com.aspose.slides.examples.charts;

import com.aspose.slides.*;

import java.util.Locale;


public class SpreadsheetFormulasOptions
{
    public static void main(String[] args)
    {
        LoadOptions loadOptions = new LoadOptions();

        // Set preferred culture information for calculating some functions intended for use with languages 
        // that use the double-byte character set (DBCS).
        loadOptions.getSpreadsheetOptions().setPreferredCulture(new Locale("ja-JP"));

        Presentation presentation = new Presentation(loadOptions);
        try
        {
            IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 150, 150, 500, 300);
            IChartDataWorkbook workbook = chart.getChartData().getChartDataWorkbook();

            IChartDataCell cell = workbook.getCell(0, "B2");

            // Use the Formula property of the IChartDataCell interface to write a formula in a cell.
            cell.setFormula("FINDB(\"ス\", \"テキスト\")");
            workbook.calculateFormulas();

            //Check calculation.
            if (Double.parseDouble(cell.getValue().toString()) == 5)
            {
                System.out.println("Calculated value = 5.");
            } else
            {
                System.out.println("Wrong calculation!");
            }
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
    }
}


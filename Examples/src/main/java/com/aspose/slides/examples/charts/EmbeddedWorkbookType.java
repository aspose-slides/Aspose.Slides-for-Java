package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartDataSourceType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartData;
import com.aspose.slides.IChartDataCell;
import com.aspose.slides.IShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.WorkbookType;
import com.aspose.slides.examples.RunExamples;

public class EmbeddedWorkbookType
{
    public static void main(String[] args)
    {
        // Source file name
        String sourcePath = RunExamples.getDataDir_Charts() + "EmbeddedWorkbook.pptx";
        // Output file name
        String resultPath = RunExamples.getOutPath() + "EmbeddedWorkbook-out.pptx";

        //ExStart:EditChartDatainExternalWorkbook
        Presentation presentation = new Presentation(sourcePath);
        try {
            for (IShape shape : presentation.getSlides().get_Item(0).getShapes())
            {
                if (!(shape instanceof IChart))
                    continue;


                IChartData chartData = ((IChart)shape).getChartData();

                // Skip charts whose embedded workbook format is not supported.
                if (chartData.getDataSourceType() == ChartDataSourceType.InternalWorkbook &&
                        chartData.getEmbeddedWorkbookType() == WorkbookType.WorkbookBinaryMacro)
                {
                    System.out.println("\nSkip charts whose embedded workbook format is " + chartData.getEmbeddedWorkbookType());
                    continue;
                }

                System.out.println("\nWork with charts whose embedded workbook format is " + chartData.getEmbeddedWorkbookType());

                // Read or modify chart workbook data.
                System.out.println("\tChart old data: " + chartData.getSeries().get_Item(0)
                        .getName().getAsCells().hashCode());

                IChartDataCell cell = chartData.getSeries().get_Item(0).getDataPoints().get_Item(0).getValue().getAsCell();
                System.out.println("\tChart new data: " + cell.getValue());
            }

            presentation.save(resultPath, SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:EditChartDatainExternalWorkbook
    }
}

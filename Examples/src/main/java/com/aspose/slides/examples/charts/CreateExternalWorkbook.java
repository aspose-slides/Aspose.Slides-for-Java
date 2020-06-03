package com.aspose.slides.examples.charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CreateExternalWorkbook
{
    public static void main(String[] args)
    {

        //ExStart:CreateExternalWorkbook
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation(dataDir + "presentation.pptx");
        try
        {
            String externalWbPath = dataDir + "externalWorkbook1.xlsx";

            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 400, 600);

            java.io.File file = new File(externalWbPath);
            if (file.exists())
                file.delete();

            byte[] worbookData = chart.getChartData().readWorkbookStream();
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(worbookData);
            outputStream.close();

            chart.getChartData().setExternalWorkbook(externalWbPath);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:CreateExternalWorkbook

    }
}


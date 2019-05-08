/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mfazi
 */
public class CreateExternalWorkbook {
    
    public static void main(String[] args){
    
    //ExStart:CreateExternalWorkbook 
    String dataDir = Utils.getDataDir(CreateExternalWorkbook.class);
    
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pres.dispose();
        }
    //ExEnd:CreateExternalWorkbook 
    }
}

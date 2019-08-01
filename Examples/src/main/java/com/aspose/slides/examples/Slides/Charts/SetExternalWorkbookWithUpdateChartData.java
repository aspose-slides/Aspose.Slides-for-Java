/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartData;
import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartData;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class SetExternalWorkbookWithUpdateChartData {
    
    public static void main(String[] args){
    
    //ExStart:SetExternalWorkbookWithUpdateChartData 
    String dataDir = Utils.getDataDir(SetExternalWorkbookWithUpdateChartData.class);
    
        Presentation pres = new Presentation();
        try
        {
              IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 400, 600, true);
              IChartData chartData = chart.getChartData();

              ((ChartData)chartData).setExternalWorkbook("http://path/doesnt/exists", false);
              
              pres.save(dataDir + "Presentation_with_externalWorkbookWithUpdateChartData.pptx", SaveFormat.Pptx);

        } finally {
              if (pres != null) pres.dispose();
        }
    
    //ExEnd:SetExternalWorkbookWithUpdateChartData
    }
}

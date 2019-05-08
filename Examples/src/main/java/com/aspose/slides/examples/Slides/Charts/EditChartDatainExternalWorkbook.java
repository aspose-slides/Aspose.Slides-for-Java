/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartData;
import com.aspose.slides.ChartDataSourceType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

/**
 *
 * @author mfazi
 */
public class EditChartDatainExternalWorkbook {
    
    public static void main(String[] args){
    
    //ExStart:EditChartDatainExternalWorkbook 
    String dataDir = Utils.getDataDir(EditChartDatainExternalWorkbook.class);
    
    Presentation pres = new Presentation(dataDir + "presentation.pptx");
    try
    {
        IChart chart = (IChart) pres.getSlides().get_Item(0).getShapes().get_Item(0);
        ChartData chartData = (ChartData)chart.getChartData();
        chartData.getSeries().get_Item(0).getDataPoints().get_Item(0).getValue().getAsCell().setValue(100);
        pres.save(dataDir + "presentation_out.pptx", SaveFormat.Pptx);
    }
    finally {
        pres.dispose();
    }
    //ExEnd:EditChartDatainExternalWorkbook 
    
    }
}

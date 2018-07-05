/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.DisplayUnitType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class ShowingDisplayUnitLabel {
    
public static void main(String[] args){
           // The path to the documents directory.
           //ExStart:ShowingDisplayUnitLabel
           String dataDir = Utils.getDataDir(ShowingDisplayUnitLabel.class);
           Presentation pres = new Presentation();
        try {
           IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 450, 300);
           chart.getAxes().getVerticalAxis().setDisplayUnit(DisplayUnitType.Millions);
        } finally {
         if (pres != null) pres.dispose();
        
        
          }
        //ExEnd:ShowingDisplayUnitLabel
         }
        
}

package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingPositionAxis {
 
 public static void main(String[] args){
 
     //ExStart:SettingPositionAxis
     String dataDir = Utils.getDataDir(SettingPositionAxis.class); 
     Presentation pres = new Presentation();
     try {
     IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 450, 300);
     chart.getAxes().getHorizontalAxis().setAxisBetweenCategories(true);
   
        pres.save(dataDir+"test.pptx",SaveFormat.Pptx);
     } 
     finally 
     {
         if (pres != null) pres.dispose();
        }
    }
 //ExEnd:SettingPositionAxis 

}

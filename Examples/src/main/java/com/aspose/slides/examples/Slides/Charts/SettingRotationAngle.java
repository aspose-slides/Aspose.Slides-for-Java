
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingRotationAngle {
    
public static void main(String[] args){
           // The path to the documents directory.
           //ExStart:SettingRotationAngle
           String dataDir = Utils.getDataDir(SettingRotationAngle.class);
           Presentation pres = new Presentation(dataDir+"Test.pptx");
        try {
           IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 450, 300);
           chart.getAxes().getVerticalAxis().setTitle(true);
           chart.getAxes().getVerticalAxis().getTitle().getTextFormat().getTextBlockFormat().setRotationAngle(90);
        } finally 
        {
         if (pres != null) pres.dispose();
        }
          pres.save(dataDir+"test.pptx",SaveFormat.Pptx);
        //ExEnd:SettingRotationAngle
      }
}
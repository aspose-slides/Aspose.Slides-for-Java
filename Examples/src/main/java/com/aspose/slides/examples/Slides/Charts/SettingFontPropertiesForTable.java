
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.NullableBool;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingFontPropertiesForTable {
   public static void main(String[] args){
  
  //ExStart:SettingFontPropertiesForTable  
 String dataDir = Utils.getDataDir(SettingFontPropertiesForTable.class);
  Presentation pres = new Presentation();
try
{
    IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

    chart.setDataTable(true);
    chart.getChartDataTable().getTextFormat().getPortionFormat().setFontBold(NullableBool.True);
    chart.getChartDataTable().getTextFormat().getPortionFormat().setFontHeight(20);

    pres.save("output.pptx", SaveFormat.Pptx);
}
finally {
    pres.dispose();
}
//ExEnd:SettingFontPropertiesForTable

   //ExEnd:SettingFontPropertiesForTable  
   }
}

package com.aspose.slides.examples.Slides.Charts;



import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartCategory;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
public class SupportForBubbleChartScaling {


public static void main(String[] args) {

// The path to the documents directory.

//ExStart:SupportForBubbleChartScaling
String dataDir = Utils.getDataDir(SupportForBubbleChartScaling.class);

Presentation pres = new Presentation(dataDir+"Test.pptx");
try
{
   IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Bubble, 100, 100, 400, 300);
    		
   chart.getChartData().getSeriesGroups().get_Item(0).setBubbleSizeScale(150);

pres.save(dataDir+"Result.pptx", SaveFormat.Pptx);
       }
finally {
   if (pres != null) pres.dispose();

   //ExEnd:SupportForBubbleChartScaling
}    
}
}

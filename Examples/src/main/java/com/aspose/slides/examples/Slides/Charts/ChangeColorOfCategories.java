
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataPoint;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
import java.awt.Color;


public class ChangeColorOfCategories {
    
public static void main(String[] args) {
            
  //ExStart:ChangeColorOfCategories

		// The path to the documents directory.
  String dataDir = Utils.getDataDir(ChangeColorOfCategories.class);
      Presentation pres = new Presentation();
  try {
      IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

      IChartDataPoint point = chart.getChartData().getSeries().get_Item(0).getDataPoints().get_Item(0);

      point.getFormat().getFill().setFillType(FillType.Solid);

      point.getFormat().getFill().getSolidFillColor().setColor(Color.BLUE);
      pres.save(dataDir + "output.pptx", SaveFormat.Pptx);

    } 
    finally {
    }
  //ExEnd:ChangeColorOfCategories
    }
}
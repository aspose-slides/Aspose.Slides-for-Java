
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.CategoryAxisType;
import static com.aspose.slides.CategoryAxisType.Date;
import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;



public class SettingDateFormatForCategoryAxis {

        public static void main(String[] args) throws ParseException {    
        
            //ExStart:SettingDateFormatForCategoryAxis
           String dataDir = Utils.getDataDir(SettingDateFormatForCategoryAxis.class);  
           Presentation pres = new Presentation();
        try {
           IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Area, 50, 50, 450, 300);

           IChartDataWorkbook wb = chart.getChartData().getChartDataWorkbook();

           wb.clear(0);

           chart.getChartData().getCategories().clear();
           chart.getChartData().getSeries().clear();
           chart.getChartData().getCategories().add(wb.getCell(0, "A2", convertToOADate(new Date(2015, 1, 1))));
           chart.getChartData().getCategories().add(wb.getCell(0, "A3", convertToOADate(new Date(2016, 1, 1))));
           chart.getChartData().getCategories().add(wb.getCell(0, "A4", convertToOADate(new Date(2017, 1, 1))));
           chart.getChartData().getCategories().add(wb.getCell(0, "A5", convertToOADate(new Date(2018, 1, 1))));

           IChartSeries series = chart.getChartData().getSeries().add(ChartType.Line);
           series.getDataPoints().addDataPointForLineSeries(wb.getCell(0, "B2", 1));
           series.getDataPoints().addDataPointForLineSeries(wb.getCell(0, "B3", 2));
           series.getDataPoints().addDataPointForLineSeries(wb.getCell(0, "B4", 3));
           series.getDataPoints().addDataPointForLineSeries(wb.getCell(0, "B5", 4));
           chart.getAxes().getHorizontalAxis().setCategoryAxisType(CategoryAxisType.Date);
           chart.getAxes().getHorizontalAxis().setNumberFormatLinkedToSource(false);
           chart.getAxes().getHorizontalAxis().setNumberFormat("yyyy");
           pres.save(dataDir, SaveFormat.Pptx);
        } finally {
         if (pres != null) pres.dispose();
        }
        }
       
            
         public static String convertToOADate(Date date) throws ParseException {
            double oaDate;
            SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
            java.util.Date baseDate = myFormat.parse("30 12 1899");
            Long days = TimeUnit.DAYS.convert(date.getTime()- baseDate.getTime(), TimeUnit.MILLISECONDS);

            oaDate = (double) days + ((double) date.getHours() / 24) + ((double) date.getMinutes() / (60 * 24))+ ((double) date.getSeconds() / (60 * 24 * 60));
              return String.valueOf(oaDate);
           }
}


      
 //ExEnd:SettingDateFormatForCategoryAxis
 
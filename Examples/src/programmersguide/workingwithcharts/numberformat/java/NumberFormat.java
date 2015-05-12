/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithcharts.numberformat.java;

import com.aspose.slides.*;

public class NumberFormat
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcharts/numberformat/data/";

        //Instantiate the presentation//Instantiate the presentation
        Presentation pres = new Presentation();

//Access the first presentation slide
        ISlide slide = pres.getSlides().get_Item(0);

//Adding a default clustered column chart
        IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 500, 400);

//Accessing the chart series collection
        IChartSeriesCollection series = chart.getChartData().getSeries();

//Setting the preset number format
//Traverse through every chart series
        for (IChartSeries ser : series)
        {
            //Traverse through every data cell in series
            for (IChartDataPoint cell : ser.getDataPoints())
            {
                //Setting the number format
                cell.getValue().getAsCell().setPresetNumberFormat((byte)10); //0.00%
            }
        }

//Saving presentation
        pres.save(dataDir+ "PresetNumberFormat.pptx", SaveFormat.Pptx);


    }
}





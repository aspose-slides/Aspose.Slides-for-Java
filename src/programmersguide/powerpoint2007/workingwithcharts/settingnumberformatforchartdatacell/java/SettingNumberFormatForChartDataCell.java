/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithcharts.settingnumberformatforchartdatacell.java;

import com.aspose.slides.*;

public class SettingNumberFormatForChartDataCell
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithcharts/settingnumberformatforchartdatacell/data/";

        //Instantiate the presentation
        PresentationEx pres = new PresentationEx();

        //Access the first presentation slide
        SlideEx slide=pres.getSlides().get_Item(0);

        //Adding a defautlt clustered column chart
        ChartEx chart = slide.getShapes().addChart(ChartTypeEx.ClusteredColumn, 50, 50, 500, 400);

        //Accessing the chart series collection
        ChartSeriesExCollection series = chart.getChartData().getSeries();


        //Setting the preset number format
        ChartSeriesEx ser =null;

        //Traverse through every chart series
        for (int i=0;i<series.size();i++)
        {
            ser =series.get_Item(i);
            //Traverse through every data cell in series
            ChartDataCell cell=null;
            for (int j=0;j<ser.getValues().getCount();j++)
            {
                cell = ser.getValues().get_Item(j);
                //Setting the number format
                cell.setPresetNumberFormat((byte)10); //0.00%
            }
        }

        //Saving presentation
        pres.write(dataDir + "PresetNumberFormat.pptx");


        //Now setting the custom number format

        //Traverse through every chart series

        for (int i=0;i<series.size();i++)
        {
            ser =series.get_Item(i);
            //Traverse through every data cell in series
            ChartDataCell cell=null;
            for (int j=0;j<ser.getValues().getCount();j++)
            {
                cell = ser.getValues().get_Item(j);
                //Setting the number format
                cell.setCustomNumberFormat ("0.00000");
            }
        }
        //Saving presentation
        pres.write(dataDir + "CustomNumberFormat.pptx");

        // Status
        System.out.println("Process completed successfully.");
    }
}





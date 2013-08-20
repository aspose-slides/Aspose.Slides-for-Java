/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithcharts.addingcharttrendlines.java;

import com.aspose.slides.*;

public class AddingChartTrendLines
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithcharts/addingcharttrendlines/data/";

            //Creating empty presentation
            PresentationEx pres = new PresentationEx();

            //Creating a clustered column chart
            ChartEx chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartTypeEx.ClusteredColumn, 20, 20, 500, 400);

            //Adding Exponential trend line for chart series 1
            TrendlineEx tredLineExp = new TrendlineEx(chart.getChartData().getSeries().get_Item(0));
            tredLineExp.setTrendlineType(TrendlineTypeEx.Exponential);
            tredLineExp.setDisplayEquation(false);
            tredLineExp.setDisplayRSquaredValue(false);
            chart.getChartData().getSeries().get_Item(0).getTrendLines().add(tredLineExp);

            //Adding Linear trend line for chart series 1
            TrendlineEx tredLineLin = new TrendlineEx(chart.getChartData().getSeries().get_Item(0));
            tredLineLin.setTrendlineType(TrendlineTypeEx.Linear);
            tredLineLin.getFormat().getLine().getFillFormat().setFillType(FillTypeEx.Solid);
            tredLineLin.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(java.awt.Color.RED);
            chart.getChartData().getSeries().get_Item(0).getTrendLines().add(tredLineLin);


            //Adding Logarithmic trend line for chart series 2
            TrendlineEx tredLineLog = new TrendlineEx(chart.getChartData().getSeries().get_Item(1));
            tredLineLog.setTrendlineType(TrendlineTypeEx.Logarithmic);
            tredLineLog.getTextFrame().setText("New log trend line");
            chart.getChartData().getSeries().get_Item(1).getTrendLines().add(tredLineLog);

            //Adding MovingAverage trend line for chart series 2
            TrendlineEx tredLineMovAvg = new TrendlineEx(chart.getChartData().getSeries().get_Item(1));
            tredLineMovAvg.setTrendlineType(TrendlineTypeEx.MovingAverage);
            tredLineMovAvg.setPeriod(3);
            tredLineMovAvg.setTrendlineName("New TrendLine Name");
            chart.getChartData().getSeries().get_Item(1).getTrendLines().add(tredLineMovAvg);

            //Adding Polynomial trend line for chart series 3
            TrendlineEx tredLinePol = new TrendlineEx(chart.getChartData().getSeries().get_Item(2));
            tredLinePol.setTrendlineType(TrendlineTypeEx.Polynomial);
            tredLinePol.setForward(1);
            tredLinePol.setOrder(3);
            chart.getChartData().getSeries().get_Item(2).getTrendLines().add(tredLinePol);

            //Adding Power trend line for chart series 3
            TrendlineEx tredLinePower = new TrendlineEx(chart.getChartData().getSeries().get_Item(2));
            tredLinePower.setTrendlineType(TrendlineTypeEx.Power);
            tredLinePower.setBackward(1);
            chart.getChartData().getSeries().get_Item(2).getTrendLines().add(tredLinePower);

            //Saving presentation
            pres.write(dataDir + "TrendLines.pptx");

            // Status
            System.out.println("TrendLines added successfully.");


    }
}





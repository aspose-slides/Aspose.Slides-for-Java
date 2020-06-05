package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class GetActualPositionOFChartDatalabel
{
    public static void main(String[] args)
    {
        //ExStart:GetActualPositionOFChartDatalabel
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 500, 400);
            for (IChartSeries series : chart.getChartData().getSeries())
            {
                series.getLabels().getDefaultDataLabelFormat().setPosition(LegendDataLabelPosition.OutsideEnd);
                series.getLabels().getDefaultDataLabelFormat().setShowValue(true);
            }

            chart.validateChartLayout();

            for (IChartSeries series : chart.getChartData().getSeries())
            {
                for (IChartDataPoint point : series.getDataPoints())
                {
                    if (point.getValue().toDouble() > 4)
                    {
                        float x = point.getLabel().getActualX();
                        float y = point.getLabel().getActualY();
                        float w = point.getLabel().getActualWidth();
                        float h = point.getLabel().getActualHeight();

                        IAutoShape shape = chart.getUserShapes().getShapes().addAutoShape(ShapeType.Ellipse, x, y, w, h);
                        shape.getFillFormat().setFillType(FillType.Solid);
                        shape.getFillFormat().getSolidFillColor().setColor(com.aspose.cells.Color.fromArgb(100, 0, 255, 0).d());//TODO
                    }
                }
            }

            pres.save(dataDir + "GetActualPositionOFChartDatalabel", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:GetActualPositionOFChartDatalabel
    }
}

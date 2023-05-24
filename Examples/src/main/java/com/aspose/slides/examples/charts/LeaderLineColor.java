package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;
import java.awt.*;

public class LeaderLineColor
{
    public static void main(String[] args)
    {
        String presentationName = RunExamples.getDataDir_Charts() + "LeaderLinesColor.pptx";
        String outPath = RunExamples.getOutPath() + "LeaderLinesColor-out.pptx";

        //ExStart:LeaderLineColor
        Presentation pres = new Presentation(presentationName);
        try {
            // Get the chart from the first slide
            IChart chart = (IChart)pres.getSlides().get_Item(0).getShapes().get_Item(0);

            // Get series of the chart
            IChartSeriesCollection series = chart.getChartData().getSeries();

            // Get lebels of the first serie
            IDataLabelCollection labels = series.get_Item(0).getLabels();

            // Change color of all leader lines in the collection
            labels.getLeaderLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.RED);

            // Save result
            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:LeaderLineColor
    }

}

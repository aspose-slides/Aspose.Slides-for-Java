package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class CustomRotationAngleTextframe
{
    public static void main(String[] args)
    {
        //ExStart:CustomRotationAngleTextframe

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        IChart chart = presentation.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 500, 300);

        IChartSeries series = chart.getChartData().getSeries().get_Item(0);

        series.getLabels().getDefaultDataLabelFormat().setShowValue(true);
        series.getLabels().getDefaultDataLabelFormat().getTextFormat().getTextBlockFormat().setRotationAngle(65);

        chart.setTitle(true);
        chart.getChartTitle().addTextFrameForOverriding("Custom title").getTextFrameFormat().setRotationAngle(-30);

        // Save Presentation
        presentation.save(dataDir + "textframe-rotation_out.pptx", SaveFormat.Pptx);
        //ExEnd:CustomRotationAngleTextframe
    }
}

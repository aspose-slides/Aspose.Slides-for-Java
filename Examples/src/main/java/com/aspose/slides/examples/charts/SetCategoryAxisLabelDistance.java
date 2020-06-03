package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class SetCategoryAxisLabelDistance
{
    public static void main(String[] args)
    {
        //ExStart:SetCategoryAxisLabelDistance
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation presentation = new Presentation();

        // Get reference of the slide
        ISlide sld = presentation.getSlides().get_Item(0);

        // Adding a chart on slide
        IChart ch = sld.getShapes().addChart(ChartType.ClusteredColumn, 20, 20, 500, 300);

        // Setting the position of label from axis
        ch.getAxes().getHorizontalAxis().setLabelOffset(500);

        // Write the presentation file to disk
        presentation.save(dataDir + "SetCategoryAxisLabelDistance_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetCategoryAxisLabelDistance
    }
}

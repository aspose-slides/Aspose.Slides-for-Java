package com.aspose.slides.examples.charts;

import com.aspose.slides.IChart;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SetDataRange
{
    public static void main(String[] args)
    {
        //ExStart:SetDataRange
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Instantiate Presentation class that represents PPTX file
        Presentation presentation = new Presentation(dataDir + "ExistingChart.pptx");

        // Access first slideMarker and add chart with default data
        ISlide slide = presentation.getSlides().get_Item(0);
        IChart chart = (IChart) slide.getShapes().get_Item(0);
        chart.getChartData().setRange("Sheet1!A1:B4");
        presentation.save(dataDir + "SetDataRange_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetDataRange
    }
}

package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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

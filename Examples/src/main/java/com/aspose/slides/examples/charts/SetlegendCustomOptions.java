package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SetlegendCustomOptions
{
    public static void main(String[] args)
    {
        //ExStart:SetlegendCustomOptions
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        // Get reference of the slide
        ISlide slide = presentation.getSlides().get_Item(0);

        // Add a clustered column chart on the slide
        IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 500, 500);

        // Set Legend Properties
        chart.getLegend().setX(50 / chart.getWidth());
        chart.getLegend().setY(50 / chart.getHeight());
        chart.getLegend().setWidth(100 / chart.getWidth());
        chart.getLegend().setHeight(100 / chart.getHeight());

        // Write presentation to disk
        presentation.save(dataDir + "Legend_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetlegendCustomOptions
    }
}

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


public class ChangeChartCategoryAxis
{
    public static void main(String[] args)
    {
        //ExStart:ChangeChartCategoryAxis
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation presentation = new Presentation(dataDir + "ExistingChart.pptx");
        try
        {
            IChart chart = (IChart) presentation.getSlides().get_Item(0).getShapes().get_Item(0);
            chart.getAxes().getHorizontalAxis().setCategoryAxisType(CategoryAxisType.Date);
            chart.getAxes().getHorizontalAxis().setAutomaticMajorUnit(false);
            chart.getAxes().getHorizontalAxis().setMajorUnit(1);
            chart.getAxes().getHorizontalAxis().setMajorUnitScale(TimeUnitType.Months);
            presentation.save(dataDir + "ChangeChartCategoryAxis_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ChangeChartCategoryAxis
    }
}

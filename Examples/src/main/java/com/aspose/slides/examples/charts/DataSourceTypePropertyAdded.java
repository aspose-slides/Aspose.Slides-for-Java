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


public class DataSourceTypePropertyAdded
{
    public static void main(String[] args)
    {
        //ExStart:DataSourceTypePropertyAdded
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation pres = new Presentation(dataDir + "pres.pptx");
        try
        {
            ISlide slide = pres.getSlides().get_Item(1);
            IChart chart = (IChart) slide.getShapes().get_Item(0);
            /*ChartDataSourceType*/
            int sourceType = chart.getChartData().getDataSourceType();
            if (sourceType == ChartDataSourceType.ExternalWorkbook)
            {
                String path = chart.getChartData().getExternalWorkbookPath();
            }
            // Saving presentation
            pres.save(dataDir + "Result.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }

    }
    //ExEnd:DataSourceTypePropertyAdded
}


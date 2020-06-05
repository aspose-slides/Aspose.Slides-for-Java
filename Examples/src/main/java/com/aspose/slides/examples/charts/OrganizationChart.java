package com.aspose.slides.examples.charts;

import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.RunExamples;


public class OrganizationChart
{
    //ExStart:OrganizationChart
    public static void main(String[] args)
    {

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation(dataDir + "test.pptx");
        try
        {
            ISmartArt smartArt = pres.getSlides().get_Item(0).getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.PictureOrganizationChart);

            pres.save(dataDir + "OrganizationChart.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

    }
    //ExEnd:OrganizationChart
}


package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class OrganizeChartLayoutType
{
    public static void main(String[] args)
    {
        //ExStart:OrganizeChartLayoutType
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        Presentation presentation = new Presentation();
        try
        {
            // Add SmartArt BasicProcess 
            ISmartArt smart = presentation.getSlides().get_Item(0).getShapes().addSmartArt(10, 10, 400, 300, SmartArtLayoutType.OrganizationChart);

            // Get or Set the organization chart type 
            smart.getNodes().get_Item(0).setOrganizationChartLayout(OrganizationChartLayoutType.LeftHanging);

            // Saving Presentation
            presentation.save(dataDir + "OrganizeChartLayoutType_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:OrganizeChartLayoutType
    }
}


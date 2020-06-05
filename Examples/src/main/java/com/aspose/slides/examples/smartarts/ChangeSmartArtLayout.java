package com.aspose.slides.examples.smartarts;

import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.RunExamples;


public class ChangeSmartArtLayout
{
    public static void main(String[] args)
    {
        //ExStart:ChangeSmartArtLayout
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        Presentation presentation = new Presentation();
        try
        {
            // Add SmartArt BasicProcess 
            ISmartArt smart = presentation.getSlides().get_Item(0).getShapes().addSmartArt(10, 10, 400, 300, SmartArtLayoutType.BasicBlockList);

            // Change LayoutType to BasicProcess
            smart.setLayout(SmartArtLayoutType.BasicProcess);

            // Saving Presentation
            presentation.save(dataDir + "ChangeSmartArtLayout_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ChangeSmartArtLayout
    }
}


package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class CheckSmartArtHiddenProperty
{
    public static void main(String[] args)
    {
        //ExStart:CheckSmartArtHiddenProperty
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        Presentation presentation = new Presentation();
        try
        {
            // Add SmartArt BasicProcess 
            ISmartArt smart = presentation.getSlides().get_Item(0).getShapes().addSmartArt(10, 10, 400, 300, SmartArtLayoutType.RadialCycle);

            // Add node on SmartArt 
            ISmartArtNode node = smart.getAllNodes().addNode();

            // Check isHidden property
            boolean hidden = node.isHidden(); // Returns true

            if (hidden)
            {
                // Do some actions or notifications
            }
            // Saving Presentation
            presentation.save(dataDir + "CheckSmartArtHiddenProperty_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:CheckSmartArtHiddenProperty
    }
}


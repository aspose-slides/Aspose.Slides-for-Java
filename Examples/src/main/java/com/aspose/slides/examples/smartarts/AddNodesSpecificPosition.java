package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class AddNodesSpecificPosition
{
    public static void main(String[] args)
    {
        //ExStart:AddNodesSpecificPosition
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Creating a presentation instance
        Presentation pres = new Presentation();

        // Access the presentation slide
        ISlide slide = pres.getSlides().get_Item(0);

        // Add Smart Art IShape
        ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.StackedList);

        // Accessing the SmartArt node at index 0
        ISmartArtNode node = smart.getAllNodes().get_Item(0);

        // Adding new child node at position 2 in parent node
        SmartArtNode chNode = (SmartArtNode) ((SmartArtNodeCollection) node.getChildNodes()).addNodeByPosition(2);

        // Add Text
        chNode.getTextFrame().setText("Sample Text Added");

        // Save Presentation
        pres.save(dataDir + "AddSmartArtNodeByPosition_out.pptx", SaveFormat.Pptx);
        //ExEnd:AddNodesSpecificPosition
    }
}

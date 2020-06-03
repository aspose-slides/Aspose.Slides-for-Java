package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class RemoveNode
{
    public static void main(String[] args)
    {
        //ExStart:RemoveNode
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Load the desired the presentation
        Presentation pres = new Presentation(dataDir + "RemoveNode.pptx");
        try
        {

            // Traverse through every shape inside first slide
            for (IShape shape : pres.getSlides().get_Item(0).getShapes())
            {

                // Check if shape is of SmartArt type
                if (shape instanceof ISmartArt)
                {
                    // Typecast shape to SmartArtEx
                    ISmartArt smart = (ISmartArt) shape;

                    if (smart.getAllNodes().size() > 0)
                    {
                        // Accessing SmartArt node at index 0
                        ISmartArtNode node = smart.getAllNodes().get_Item(0);

                        // Removing the selected node
                        smart.getAllNodes().removeNode(node);

                    }
                }
            }

            // Save Presentation
            pres.save(dataDir + "RemoveSmartArtNode_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RemoveNode
    }
}

package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class RemoveNodeSpecificPosition
{
    public static void main(String[] args)
    {
        //ExStart:RemoveNodeSpecificPosition
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Load the desired the presentation             
        Presentation pres = new Presentation(dataDir + "RemoveNodeSpecificPosition.pptx");

        // Traverse through every shape inside first slide
        for (IShape shape : pres.getSlides().get_Item(0).getShapes())
        {
            // Check if shape is of SmartArt type
            if (shape instanceof ISmartArt)
            {
                // Typecast shape to SmartArt
                ISmartArt smart = (ISmartArt) shape;

                if (smart.getAllNodes().size() > 0)
                {
                    // Accessing SmartArt node at index 0
                    ISmartArtNode node = smart.getAllNodes().get_Item(0);

                    if (node.getChildNodes().size() >= 2)
                    {
                        // Removing the child node at position 1
                        ((ISmartArtNodeCollection) node.getChildNodes()).removeNode(1);
                    }

                }
            }
        }

        // Save Presentation
        pres.save(dataDir + "RemoveSmartArtNodeByPosition_out.pptx", SaveFormat.Pptx);
        //ExEnd:RemoveNodeSpecificPosition
    }
}

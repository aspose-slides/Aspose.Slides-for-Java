package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AccessChildNodes
{
    public static void main(String[] args)
    {
        //ExStart:AccessChildNodes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Load the desired the presentation
        Presentation pres = new Presentation(dataDir + "AccessChildNodes.pptx");
        try
        {
            // Traverse through every shape inside first slide
            for (IShape shape : pres.getSlides().get_Item(0).getShapes())
            {

                // Check if shape is of SmartArt type
                if (shape instanceof SmartArt)
                {

                    // Typecast shape to SmartArt
                    ISmartArt smart = (ISmartArt) shape;

                    // Traverse through all nodes inside SmartArt
                    for (int i = 0; i < smart.getAllNodes().size(); i++)
                    {
                        // Accessing SmartArt node at index i
                        ISmartArtNode node0 = (ISmartArtNode) smart.getAllNodes().get_Item(i);

                        // Traversing through the child nodes in SmartArt node at index i
                        for (int j = 0; j < node0.getChildNodes().size(); j++)
                        {
                            // Accessing the child node in SmartArt node
                            ISmartArtNode node = (ISmartArtNode) node0.getChildNodes().get_Item(j);

                            // Printing the SmartArt child node parameters
                            String outString = String.format("j = {0},.Text{1},  Level = {2}, Position = {3}", j, node.getTextFrame().getText(), node.getLevel(), node.getPosition());
                            System.out.println(outString);
                        }
                    }
                }
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AccessChildNodes
    }
}

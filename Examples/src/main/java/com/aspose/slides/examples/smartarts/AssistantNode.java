package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class AssistantNode
{
    public static void main(String[] args)
    {
        //ExStart:AssistantNode
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Creating a presentation instance
        Presentation pres = new Presentation(dataDir + "AssistantNode.pptx");
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
                    // Traversing through all nodes of SmartArt shape

                    for (ISmartArtNode node : smart.getAllNodes())
                    {
                        String tc = node.getTextFrame().getText();
                        // Check if node is Assitant node
                        if (node.isAssistant())
                        {
                            // Setting Assitant node to false and making it normal node
                            node.setAssistant(false);
                        }
                    }
                }
            }
            // Save Presentation
            pres.save(dataDir + "ChangeAssitantNode_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AssistantNode
    }
}

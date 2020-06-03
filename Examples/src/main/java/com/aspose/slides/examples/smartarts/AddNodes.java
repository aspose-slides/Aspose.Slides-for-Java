package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AddNodes
{
    public static void main(String[] args)
    {
        //ExStart:AddNodes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Load the desired the presentation// Load the desired the presentation
        Presentation pres = new Presentation(dataDir + "AddNodes.pptx");

        // Traverse through every shape inside first slide
        for (IShape shape : pres.getSlides().get_Item(0).getShapes())
        {

            // Check if shape is of SmartArt type
            if (shape instanceof ISmartArt)
            {

                // Typecast shape to SmartArt
                ISmartArt smart = (ISmartArt) shape;

                // Adding a new SmartArt Node
                ISmartArtNode TemNode = (ISmartArtNode) smart.getAllNodes().addNode();

                // Adding text
                TemNode.getTextFrame().setText("Test");

                // Adding new child node in parent node. It  will be added in the end of collection
                ISmartArtNode newNode = (ISmartArtNode) TemNode.getChildNodes().addNode();

                // Adding text
                newNode.getTextFrame().setText("New Node Added");

            }
        }

        // Saving Presentation
        pres.save(dataDir + "AddSmartArtNode_out.pptx", SaveFormat.Pptx);
        //ExEnd:AddNodes
    }
}

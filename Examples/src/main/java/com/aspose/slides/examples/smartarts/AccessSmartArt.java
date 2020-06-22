package com.aspose.slides.examples.smartarts;

import com.aspose.slides.IShape;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class AccessSmartArt
{
    public static void main(String[] args)
    {
        //ExStart:AccessSmartArt
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Load the desired the presentation
        Presentation pres = new Presentation(dataDir + "AccessSmartArt.pptx");
        try
        {
            // Traverse through every shape inside first slide
            for (IShape shape : pres.getSlides().get_Item(0).getShapes())
            {
                // Check if shape is of SmartArt type
                if (shape instanceof ISmartArt)
                {

                    // Typecast shape to SmartArt
                    ISmartArt smart = (ISmartArt) shape;

                    // Traverse through all nodes inside SmartArt
                    for (int i = 0; i < smart.getAllNodes().size(); i++)
                    {
                        // Accessing SmartArt node at index i
                        ISmartArtNode node = (ISmartArtNode) smart.getAllNodes().get_Item(i);

                        // Printing the SmartArt node parameters
                        String outString = String.format("i = {0},.Text{1},  Level = {2}, Position = {3}", i, node.getTextFrame().getText(), node.getLevel(), node.getPosition());
                        System.out.println(outString);
                    }
                }
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AccessSmartArt
    }
}

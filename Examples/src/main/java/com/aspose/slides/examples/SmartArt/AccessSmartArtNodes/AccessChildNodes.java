/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.SmartArt.AccessSmartArtNodes;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class AccessChildNodes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessChildNodes.class);

        //Instantiate Presentation Class
        Presentation pres = new Presentation(dataDir+"SimpleSmartArt.pptx");

        //Get first slide
        ISlide slide = pres.getSlides().get_Item(0);

        //Traverse through every shape inside first slide
        for(IShape shape : slide.getShapes())
        {
            //Check if shape is of SmartArt type
            if (shape instanceof ISmartArt)
            {
                //Typecast shape to SmartArtEx
                ISmartArt smart = (ISmartArt)shape;

                //Traverse through all nodes inside SmartArt
                for (int i = 0; i < smart.getAllNodes().size(); i++)
                {
                    //Accessing SmartArt node at index i
                    SmartArtNode node0 = (SmartArtNode)smart.getAllNodes().get_Item(i);

                    //Traversing through the child nodes in SmartArt node at index i
                    for (int j = 0; j < node0.getChildNodes().size(); j++)
                    {
                        //Accessing the child node in SmartArt node
                        SmartArtNode node = (SmartArtNode)node0.getChildNodes().get_Item(j);

                        //Printing the SmartArt child node parameters
                        System.out.print("j = "+j+", Text = "+node.getTextFrame().getText()+",  Level = "+node.getLevel()+", Position = "+node.getPosition());
                    }
                }
            }
        }
    }
}





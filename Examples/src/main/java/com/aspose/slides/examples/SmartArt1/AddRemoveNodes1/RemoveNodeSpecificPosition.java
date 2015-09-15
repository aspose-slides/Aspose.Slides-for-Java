/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.SmartArt1.AddRemoveNodes1;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class RemoveNodeSpecificPosition
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RemoveNodeSpecificPosition.class);
        //Load the desired the Presentation1
        Presentation pres = new Presentation(dataDir+ "AddSmartArtNode.pptx");

        //Traverse through every shape inside first slide
        for(IShape shape : pres.getSlides().get_Item(0).getShapes())
        {

            //Check if shape is of SmartArt type
            if (shape instanceof SmartArt)
            {
                //Typecast shape to SmartArt
                SmartArt smart = (SmartArt)shape;

                if (smart.getAllNodes().size() > 0)
                {
                    //Accessing SmartArt node at index 0
                    ISmartArtNode node = smart.getAllNodes().get_Item(0);

                    if (node.getChildNodes().size() >= 2)
                    {
                        //Removing the child node at position 1
                        ((SmartArtNodeCollection)node.getChildNodes()).removeNodeByPosition(1);
                    }

                }
            }

        }

        //Save Presentation
        pres.save(dataDir+ "RemoveSmartArtNodeByPosition.pptx", SaveFormat.Pptx);

    }
}





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

public class AddNodes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddNodes.class);

        //Load the desired the Presentation1
        Presentation pres = new Presentation(dataDir+ "SimpleSmartArt.pptx");

        //Traverse through every shape inside first slide
        for(IShape shape : pres.getSlides().get_Item(0).getShapes())
        {

            //Check if shape is of SmartArt type
            if (shape instanceof SmartArt)
            {

                //Typecast shape to SmartArt
                SmartArt smart = (SmartArt)shape;

                //Adding a new SmartArt Node
                SmartArtNode TemNode = (SmartArtNode)smart.getAllNodes().addNode();

                //Adding Text1
                TemNode.getTextFrame().setText("Test");

                //Adding new child node in parent node. It  will be added in the end of collection
                SmartArtNode newNode = (SmartArtNode)TemNode.getChildNodes().addNode();

                //Adding Text1
                newNode.getTextFrame().setText("New Node Added");

            }
        }

        //Saving Presentation
        pres.save(dataDir+ "AddSmartArtNode.pptx", SaveFormat.Pptx);

    }
}





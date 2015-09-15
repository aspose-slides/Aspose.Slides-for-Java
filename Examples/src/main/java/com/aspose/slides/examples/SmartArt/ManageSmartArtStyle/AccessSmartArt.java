/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.SmartArt.ManageSmartArtStyle;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class AccessSmartArt
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessSmartArt.class);

        //Instantiate Presentation Class
        Presentation pres = new Presentation(dataDir+ "SimpleSmartArt.pptx");

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

                //Checking SmartArt Layout
                if (smart.getLayout() == SmartArtLayoutType.BasicBlockList)
                {
                    System.out.print("Program is executed successfully....");
                }

            }
        }

        //Saving Presentation1
        pres.save(dataDir+ "SimpleSmartArt.pptx", SaveFormat.Pptx);
    }
}





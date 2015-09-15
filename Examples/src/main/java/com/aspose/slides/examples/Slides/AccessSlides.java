/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Slides;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class AccessSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessSlides.class);

        //Instantiate a Presentation object that represents a Presentation1 file
        Presentation pres = new Presentation(dataDir+ "demo.pptx");

        //Accessing a slide using its slide index
        ISlide slide = pres.getSlides().get_Item(0);

        System.out.println("Program executed successfully");
        
    }
}





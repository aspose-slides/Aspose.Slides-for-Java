/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.presentation.presentationtoxps;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.XpsOptions;
import com.aspose.slides.examples.Utils;

public class WithoutXPSOptions
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(WithoutXPSOptions.class);

        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");

        //Saving the presentation to XPS document
        pres.save(dataDir+ "demo.xps", SaveFormat.Xps);

        System.out.println("Program executed successfully");
    }
}





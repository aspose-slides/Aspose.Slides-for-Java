/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Presentation1.PresentationToXPS1;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.XpsOptions;
import com.aspose.slides.examples.Utils;

public class XPSOptions
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(XPSOptions.class);

        //Instantiate a Presentation object that represents a Presentation1 file
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");

        //Instantiate the TiffOptions class
        XpsOptions opts = new XpsOptions();

        //Save MetaFiles as PNG
        opts.setSaveMetafilesAsPng(true);

        //Save the Presentation1 to XPS document
        pres.save(dataDir+ "demo.xps", SaveFormat.Xps,opts);
        System.out.println("Program executed successfully");
    }
}





/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithpresentation.convertingtoxpsfile.java;

import com.aspose.slides.*;

public class ConvertingToXPSFile
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithpresentation/convertingtoxpsfile/data/";

        // 1.
        // Save to XPS without using XpsOptions
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Saving the presentation to TIFF document
        pres.save(dataDir + "demo1.xps", com.aspose.slides.SaveFormat.Xps);

        // 1.
        // Save to XPS with using XpsOptions
        //Instantiate the TiffOptions class
        com.aspose.slides.XpsOptions opts = new com.aspose.slides.XpsOptions();

        //Save MetaFiles as PNG
        opts.setSaveMetafilesAsPng(true);

        //Save the presentation to XPS document
        pres.save(dataDir + "demo2.xps", com.aspose.slides.SaveFormat.Xps,opts);

        // Display Status
        System.out.println("Presentation is saved to XPS with and without using XpsOptions successfully!");
    }
}





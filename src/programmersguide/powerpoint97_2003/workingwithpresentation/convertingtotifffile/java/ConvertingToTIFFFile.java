/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithpresentation.convertingtotifffile.java;

import com.aspose.slides.*;

public class ConvertingToTIFFFile
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithpresentation/convertingtotifffile/data/";

        // 1.
        // Save to TIFF using default options.
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Saving the presentation to TIFF document
        pres.save(dataDir + "demo1.tiff", com.aspose.slides.SaveFormat.Tiff);


        // 2.
        // Save with customized image size using TiffOptions class.
        //Instantiate the TiffOptions class
        com.aspose.slides.TiffOptions opts = new com.aspose.slides.TiffOptions();

        //Set Image Size
        opts.setImageSize(new java.awt.Dimension(150, 200));

        //Save the presentation to TIFF with specified image size
        pres.save(dataDir + "demo2.tiff", com.aspose.slides.SaveFormat.Tiff, opts);

        // Display Status
        System.out.println("Presentation is saved to TIFF with default and custom save options successfully!");
    }
}





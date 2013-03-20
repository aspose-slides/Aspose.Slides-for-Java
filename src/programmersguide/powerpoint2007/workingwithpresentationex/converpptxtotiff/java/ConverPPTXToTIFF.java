/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithpresentationex.converpptxtotiff.java;

import com.aspose.slides.*;

public class ConverPPTXToTIFF
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithpresentationex/converpptxtotiff/data/";

        //Instantiate a Presentation object that represents a PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");


        // 1.
        //Saving the presentation to TIFF document
        pres.save(dataDir + "demo.tiff", com.aspose.slides. SaveFormat.Tiff);


        // 2.
        // Save with custom size.
        //Instantiate the TiffOptions class
        com.aspose.slides.TiffOptions opts = new com.aspose.slides.TiffOptions();

        //Set Image Size
        opts.setImageSize(new java.awt.Dimension(150, 200));

        //Save the presentation to TIFF with specified image size
        pres.save("demo.tiff", com.aspose.slides.SaveFormat.Tiff,opts);

        // Status
        System.out.println("PPTX to TIFF conversion has been performed successfully.");
    }
}





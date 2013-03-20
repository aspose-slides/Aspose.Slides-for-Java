/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithpresentationex.convertpptxtoxps.java;

import com.aspose.slides.*;

public class ConvertPPTXToXPS
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithpresentationex/convertpptxtoxps/data/";

        //Instantiate a PresentationEx object that represents a PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");


        // 1.
        //Saving the presentation to TIFF document
        pres.save(dataDir + "output.xps", com.aspose.slides.SaveFormat.Xps);


        // 2.
        // Save with XpsOptions
        //Instantiate the XpsOptions class
        com.aspose.slides.XpsOptions opts = new com.aspose.slides.XpsOptions();

        //Save MetaFiles as PNG
        opts.setSaveMetafilesAsPng(true);

        //Save the prsentation to XPS document
        pres.save(dataDir + "outputXPSOptions.xps", com.aspose.slides.SaveFormat.Xps,opts);

        // Status
        System.out.println("PPTX to XPS conversion has been performed successfully.");
    }
}





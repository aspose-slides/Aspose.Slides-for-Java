/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Shapes.OLEObjectFrames;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

import java.io.File;
import java.io.FileInputStream;

public class AddOLEObjectFrame
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddOLEObjectFrame.class);

        //Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();

        //Access the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Load an Excel file to Array of Bytes
        File file=new File(dataDir+ "sample.xlsx");
        int length=(int)file.length();
        FileInputStream fstro = new FileInputStream(file);
        byte[] buf = new byte[length];
        fstro.read(buf, 0, length);

        //Add an Ole Object Frame shape
        IOleObjectFrame oof = sld.getShapes().addOleObjectFrame((float)0,(float) 0, (float)pres.getSlideSize().getSize().getWidth(),(float) pres.getSlideSize().getSize().getHeight (), "Excel.Sheet.8", buf);

        //Write the PPTX to disk
        pres.save(dataDir+ "OleEmbed.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");

    }
}





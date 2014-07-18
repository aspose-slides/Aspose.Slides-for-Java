/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.oleobjectframes.addingoleobjectframe.java;

import com.aspose.slides.*;

import java.io.File;
import java.io.FileInputStream;

public class AddingOLEObjectFrame
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/oleobjectframes/addingoleobjectframe/data/";

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





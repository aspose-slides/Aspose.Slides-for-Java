/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.presentation.savepresentation;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class RemoveWriteProtection
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RemoveWriteProtection.class);

        //Opening the presentation file
        Presentation pres = new Presentation(dataDir+ "demoWriteProtected.pptx");


        //Checking if presentation is write protected
        if(pres.getProtectionManager().isWriteProtected())
            //Removing Write protection
            pres.getProtectionManager().removeWriteProtection();

        //Saving presentation
        pres.save(dataDir+ "newDemo.pptx",  com.aspose.slides.SaveFormat.Pptx);

        System.out.println("Program executed successfully");
    }
}





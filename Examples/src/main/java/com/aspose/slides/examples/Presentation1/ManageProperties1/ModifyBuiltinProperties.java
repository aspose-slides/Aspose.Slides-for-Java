/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Presentation1.ManageProperties1;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class ModifyBuiltinProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ModifyBuiltinProperties.class);

        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");

        //Create a reference to DocumentProperties object associated with Prsentation
        IDocumentProperties dp = pres.getDocumentProperties();


        //Access and modify custom properties
        for (int i = 0; i < dp.getCount(); i++)
        {
            //Display names and values of custom properties
            System.out.println("Custom Property Name : " + dp.getPropertyName(i));
            System.out.println("Custom Property Value : " + dp.get_Item(dp.getPropertyName(i)));

            //Modify values of custom properties
            dp.set_Item( dp.getPropertyName(i) , "New Value " + (i + 1));
        }

        //Save your Presentation1 to a file
        pres.save(dataDir+ "CustomDemoModified.pptx",SaveFormat.Pptx);
        System.out.println("Program executed successfully");

    }
}





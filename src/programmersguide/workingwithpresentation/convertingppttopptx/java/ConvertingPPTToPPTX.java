/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithpresentation.convertingppttopptx.java;

import com.aspose.slides.*;

public class ConvertingPPTToPPTX
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithpresentation/convertingppttopptx/data/";
        //Instantiate a Presentation object that represents a PPTX file
        Presentation pres = new Presentation(dataDir+ "Presentation1.ppt");

        //Saving the PPTX presentation to PPTX format
        pres.save(dataDir+ "Aspose.pptx",SaveFormat.Pptx);
        System.out.println("Program executed successfully");
        
    }
}





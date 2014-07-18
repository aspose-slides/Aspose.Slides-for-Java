/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithpresentation.convertingpresentationtotiff.convertingwithdefaultsize.java;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TiffCompressionTypes;
import com.aspose.slides.TiffOptions;

public class ConvertingWithDefaultSize
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithpresentation/convertingpresentationtotiff/convertingwithdefaultsize/data/";
        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");


        //Saving the presentation to TIFF document
        pres.save(dataDir+ "demo.tiff", SaveFormat.Tiff);
        System.out.println("Program executed successfully");
    }
}





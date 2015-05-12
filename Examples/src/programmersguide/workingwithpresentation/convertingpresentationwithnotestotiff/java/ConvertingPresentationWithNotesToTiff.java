/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithpresentation.convertingpresentationwithnotestotiff.java;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class ConvertingPresentationWithNotesToTiff
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithpresentation/convertingpresentationtotiff/convertingwithdefaultsize/data/";
        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");

        //Saving the presentation to TIFF notes
        pres.save(dataDir+ "TestNotes.tiff", SaveFormat.TiffNotes);
        System.out.println("Program executed successfully");
    }
}





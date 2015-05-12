/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithslidesinpresentation.removingslidesfromapresentation.usingslideindex.java;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class RemovingSlidesFromAPresentation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithslidesinpresentation/removingslidesfromapresentation/usingslideindex/data/";

        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir+ "demo.pptx");

        //Removing a slide using its slide index
        pres.getSlides().removeAt(0);


        //Writing the presentation file
        pres.save(dataDir+ "modified.pptx", SaveFormat.Pptx);

        System.out.println("Program executed successfully");
        
    }
}





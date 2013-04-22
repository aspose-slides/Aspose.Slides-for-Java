/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithslidesinpresentationex.removingslidesfrompresentationex.java;

import com.aspose.slides.*;

public class RemovingSlidesFromPresentationEx
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithslidesinpresentationex/removingslidesfrompresentationex/data/";

        //Instantiate a PresentationEx object that represents a PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Accessing a slide using its index in the slides collection
        SlideEx slide = pres.getSlides().get_Item(0);

        //Removing a slide using its reference
        pres.getSlides().remove(slide);

        //Writing the presentation as a PPTX file
        pres.write(dataDir + "modified.pptx");

        //Printing the status
        System.out.println("Slide removed successfully!");
    }
}





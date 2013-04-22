/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithslidesinpresentationex.cloningslidesinpresentationex.java;

import com.aspose.slides.*;

public class CloningSlidesInPresentationEx
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithslidesinpresentationex/cloningslidesinpresentationex/data/";

        //Instantiate PresentationEx class that represents a PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Clone the desired slide to the end of the collection of slides in the same PPTX
        SlideExCollection slds = pres.getSlides();
        slds.addClone(pres.getSlides().get_Item(0));

        //Write the modified pptx to disk
        pres.write(dataDir + "demo_cloned.pptx");

        //Printing the status
        System.out.println("Slide cloned successfully!");
    }
}





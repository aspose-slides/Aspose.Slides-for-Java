/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithpresentationex.openingpresentationex.java;

import com.aspose.slides.*;

public class OpeningPresentationEx
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithpresentationex/openingpresentationex/data/";

        //Opening the presentation file by passing the file path to the constructor of Presentation class
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Printing the total number of slides present in the presentation
        System.out.println("Slides Count: "+Integer.toString(pres.getSlides().getCount()));

    }
}




